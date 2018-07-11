/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jradio;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 *
 * @author vip
 */
public class DemoJRadio	extends	JFrame{
    public DemoJRadio(String title)	{
        setTitle(title);
    }
    public void	doShow(){
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addControl();
        setResizable(false);
        setVisible(true);
    }
    public void	addControl(){
        JPanel pnBorder=new JPanel();
        pnBorder.setLayout(new BorderLayout());
        JPanel	pnNorth=new JPanel();
        JLabel	lblTitle=new JLabel("PHÉP TOÁN SỐ HỌC");
        pnNorth.add(lblTitle);
        pnBorder.add(pnNorth,BorderLayout.NORTH);
        lblTitle.setForeground(Color.BLUE);
        Font ft=new Font("arial", Font.BOLD, 25);
        lblTitle.setFont(ft);
        JPanel pnWest=new JPanel();
        pnWest.setLayout(new BoxLayout(pnWest, BoxLayout.Y_AXIS));
        JButton	btnGiai=new JButton("Tính");
        JButton	btnXoa=new JButton("Xóa");
        JButton	btnThoat=new JButton("Thoát");
        pnWest.add(btnGiai);
        pnWest.add(Box.createVerticalStrut(10));
        pnWest.add(btnXoa);
        pnWest.add(Box.createVerticalStrut(10));
        pnWest.add(btnThoat);
        pnBorder.add(pnWest,BorderLayout.WEST);
        pnWest.setBackground(Color.LIGHT_GRAY);
        Border southborder=BorderFactory.createLineBorder(Color.BLUE);
        TitledBorder southTitleBorder=	new TitledBorder(southborder, "Lựa chọn");
        pnWest.setBorder(southTitleBorder);
        JPanel	pnSouth=new JPanel();
        pnSouth.setPreferredSize(new Dimension(0, 30));
        pnSouth.setBackground(Color.blue);
        pnBorder.add(pnSouth,BorderLayout.SOUTH);
        JPanel	pnCenter=new JPanel();
        pnCenter.setLayout(new BoxLayout(pnCenter, BoxLayout.Y_AXIS));
        pnBorder.add(pnCenter,BorderLayout.CENTER);
        Border centerborder =BorderFactory.createLineBorder(Color.BLUE);
        TitledBorder centerTitleBorder=new TitledBorder(centerborder, "nhập a và b:");
        pnCenter.setBorder(centerTitleBorder);
        JPanel pna=new JPanel();
        JLabel lbla=new	JLabel("nhập a:");
        final JTextField txta=new JTextField(15);
        pna.add(lbla);
        pna.add(txta);
        pnCenter.add(pna);
        JPanel pnb=new JPanel();
        JLabel lblb=new JLabel("nhập b:");
        final JTextField txtb=new JTextField(15);
        pnb.add(lblb);
        pnb.add(txtb);
        pnCenter.add(pnb);
        JPanel pnc=new JPanel();
        JPanel pnpheptoan=new JPanel();
        pnpheptoan.setLayout(new GridLayout(2,	2));
        pnpheptoan.setBorder(new TitledBorder(
        BorderFactory.createLineBorder(Color.BLACK),"Phép toán:"));
        final JRadioButton radCong=new JRadioButton("Cộng");
        pnpheptoan.add(radCong);
        final JRadioButton radTru=new JRadioButton("Trừ");
        pnpheptoan.add(radTru);
        final JRadioButton radNhan=new JRadioButton("Nhân");
        pnpheptoan.add(radNhan);
        final JRadioButton radChia=new JRadioButton("Chia");
        pnpheptoan.add(radChia);
        ButtonGroup group=new ButtonGroup();
        radCong.setSelected(true);
        group.add(radCong);group.add(radTru);
        group.add(radNhan);group.add(radChia);
        pnc.add(pnpheptoan);
        pnCenter.add(pnc);
        JPanel pnkq=new JPanel();
        JLabel lblkq=new JLabel("Kết quả:");
        final JTextField txtkq=new JTextField(15);
        pnkq.add(lblkq);
        pnkq.add(txtkq);
        pnCenter.add(pnkq);
        lbla.setPreferredSize(lblkq.getPreferredSize());
        lblb.setPreferredSize(lblkq.getPreferredSize());
        btnThoat.addActionListener(new ActionListener()	{
        @Override
            public void actionPerformed(ActionEvent e) {
                int ret=JOptionPane.showConfirmDialog(null, "Bạn muốn thoát không?", "Thoát", JOptionPane.YES_NO_OPTION);
                if(ret==JOptionPane.YES_OPTION)
                    System.exit(0);
            }
        });
        btnXoa.addActionListener(new ActionListener()	{
         public	void actionPerformed(ActionEvent e){
                txta.setText("");
                txtb.setText("");
                txtkq.setText("");
                txta.requestFocus();
            }
            });
        btnGiai.addActionListener(new ActionListener()	{
        public void actionPerformed(ActionEvent e)	{
        String sa=txta.getText();
        int a=0,b=0;
        try{
            a=Integer.parseInt(sa);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"a không phải là số!");
                txta.selectAll();
                txta.requestFocus();
                return;
            }
            String sb=txtb.getText();
         try{
            b=Integer.parseInt(sb);
            }catch(Exception ex){
            JOptionPane.showMessageDialog(null,	"b không phải là số!");
                txtb.selectAll();
                txtb.requestFocus();
                return;
            }
        double	kq=0;
        if(radCong.isSelected()){
            kq=(a+b);
        }
        else	if(radTru.isSelected()){
                    kq=(a-b);
                }
                else	if(radNhan.isSelected()){
                    kq=(a*b);
                }                   
                else if(b==0){
                    JOptionPane.showMessageDialog(null,	"không chia cho 0!");  
                    txtb.selectAll();
                    txtb.requestFocus();
                    return;
                }
                else{  kq=a*1.0/b*1.0;
                        }
                    txtkq.setText(kq+"");
            }
            });
        Container con=getContentPane();
        con.add(pnBorder);
        }
    public static void main(String[] args)	{
        DemoJRadio ui=new DemoJRadio("Phép tính số học");
        ui.doShow();
    }
}    
