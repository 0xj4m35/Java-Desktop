/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtable.view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import jtable.controller.IOFile;
import jtable.controller.Search;
import jtable.controller.SortByDiachi;
import jtable.controller.SortByDienthoai;
import jtable.controller.SortByHoten;
import jtable.controller.SortByMa;
import jtable.model.BanDoc;
import jtable.model.BanDocTableModel;

/**
 *
 * @author vip
 */
public class Run extends javax.swing.JFrame {

    private ArrayList<BanDoc> bandoc;    
    private BanDocTableModel bandocTableModel;    
    private IOFile file = new IOFile();
    private State state;        
    private DefaultComboBoxModel sortcombomodel;
    private DefaultComboBoxModel searchcombomodel;
    private String[] sort = {"Ma ban doc","Ho ten","Dia chi","Dien thoai"};
    private String[] search = {"Tat ca","Ma ban doc","Ho ten","Dia chi","Dien thoai"};    
    private BanDocTableModel tamBandocTableModel;
    private ArrayList<BanDoc> tambandoc;
    
    public Run() {
        initComponents();
        changeState(State.normal);        
        bandoc = new ArrayList<BanDoc>();         
        tambandoc = new ArrayList<BanDoc>();       
        try {
            file.inFile(bandoc,"bandoc.dat");
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {         
        }        
        bandocTableModel = new BanDocTableModel();
        bandocTableModel.setBanDoc(bandoc);
        bandocTable.setModel(bandocTableModel);                
        
        sortcombomodel = new DefaultComboBoxModel(sort);
        combosx.setModel(sortcombomodel);                
                
        searchcombomodel = new DefaultComboBoxModel(search);
        combotk.setModel(searchcombomodel);                
        
        tamBandocTableModel = new BanDocTableModel();
        tamBandocTableModel.setBanDoc(tambandoc);
        hienthiTable.setModel(tamBandocTableModel);
    }
    private void changeState(State state){
        this.state = state;
        if(state == State.normal){            
            setEnableBandocChitiet(false);            
            bandocTable.setEnabled(true); 
            hienthiTable.setEnabled(true); 
        }        
        else if(state == State.addBanDoc){
           setEnableBandocChitiet(true);
           resetBandocChitiet();
           bandocTable.setEnabled(false);
        }
        else if(state == State.editBanDoc){
            setEnableBandocChitiet(true);
            txtma.setEditable(false);
            bandocTable.setEnabled(false);
        }        
    }
    private void setEnableBandocChitiet(boolean b){
        txtma.setEnabled(b);
        txtten.setEnabled(b);
        txtdchi.setEnabled(b);
        txtdthoai.setEnabled(b);        
        btCapnhat.setEnabled(b);
        btBoqua.setEnabled(b);
    }
    private void resetBandocChitiet(){
       txtma.setText("");
       txtma.setEnabled(true);
       txtten.setText("");
       txtdchi.setText("");
       txtdthoai.setText("");
       txtma.setEditable(true);
   }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bandocTable = new javax.swing.JTable();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        txtma = new javax.swing.JTextField();
        txtten = new javax.swing.JTextField();
        txtdchi = new javax.swing.JTextField();
        txtdthoai = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btCapnhat = new javax.swing.JButton();
        btBoqua = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        hienthiTable = new javax.swing.JTable();
        combosx = new javax.swing.JComboBox<>();
        btsapxep = new javax.swing.JButton();
        txttim = new javax.swing.JTextField();
        combotk = new javax.swing.JComboBox<>();
        bttimkiem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bandocTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        bandocTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bandocTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bandocTable);

        btThem.setText("Them moi");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btSua.setText("Sua");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        btXoa.setText("Xoa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        jLabel1.setText("Ma ban doc:");

        jLabel2.setText("Ho ten ban doc:");

        jLabel3.setText("Dia chi:");

        jLabel4.setText("Dien thoai:");

        btCapnhat.setText("Cap nhat");
        btCapnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCapnhatActionPerformed(evt);
            }
        });

        btBoqua.setText("Bo qua");
        btBoqua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBoquaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(29, 29, 29)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtten)
                                            .addComponent(txtdchi)
                                            .addComponent(txtdthoai)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(47, 47, 47)
                                        .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btBoqua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btCapnhat, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btThem)
                            .addComponent(btSua)
                            .addComponent(btXoa))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btCapnhat)
                        .addGap(32, 32, 32)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdchi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btBoqua))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtdthoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ban doc", jPanel1);

        hienthiTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(hienthiTable);

        combosx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btsapxep.setText("Sap xep");
        btsapxep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsapxepActionPerformed(evt);
            }
        });

        combotk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        bttimkiem.setText("Tim kiem");
        bttimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttimkiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(combosx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btsapxep)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(combotk, 0, 164, Short.MAX_VALUE)
                            .addComponent(txttim))
                        .addGap(30, 30, 30)
                        .addComponent(bttimkiem)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combosx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btsapxep)
                    .addComponent(txttim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttimkiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combotk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tim kiem va sap xep", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        changeState(State.addBanDoc);
    }//GEN-LAST:event_btThemActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        if(bandocTable.getSelectedRow() >= 0){
                changeState(State.editBanDoc);
            } else{
                JOptionPane.showMessageDialog(this,"Hay chon ban doc de sua!");
            }
    }//GEN-LAST:event_btSuaActionPerformed

    private void bandocTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bandocTableMouseClicked
        if(bandocTable.getSelectedRow() >= 0){
                BanDoc bd = bandoc.get(bandocTable.getSelectedRow());
                txtma.setText(bd.getMaBD());
                txtten.setText(bd.getTenBD());
                txtdchi.setText(bd.getDiachi());
                txtdthoai.setText(bd.getDienthoai());              
            }
    }//GEN-LAST:event_bandocTableMouseClicked

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        if(bandocTable.getSelectedRow() >= 0){
                bandoc.remove(bandocTable.getSelectedRow());
                bandocTableModel.fireTableDataChanged();;
                resetBandocChitiet();
                try {
                    file.outFile(bandoc, "bandoc.dat");
                } catch (IOException ex) {
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Hay chon 1 ban doc de xoa!");
            }
    }//GEN-LAST:event_btXoaActionPerformed
    
    private void btBoquaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBoquaActionPerformed
        changeState(State.normal);
        bandocTableModel.fireTableDataChanged();
        resetBandocChitiet();
    }//GEN-LAST:event_btBoquaActionPerformed
    private boolean checkMaBandoc(String s){
        for(BanDoc bd : bandoc){
            if(bd.getMaBD().compareTo(s)== 0){
                return false;
            }
        }
        return true;
    }
    private boolean checkValidBandocChitiet(){
        if(txtma.getText().toString().trim().equals("")
                ||txtten.getText().toString().trim().equals("")
                ||txtdchi.getText().toString().trim().equals("")
                ||txtdthoai.getText().toString().trim().equals("") ){
            return false;
        }
        return true;
    }
    private void btCapnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCapnhatActionPerformed
               if (state == State.addBanDoc) {
            if (checkValidBandocChitiet()) {
                String s = txtma.getText().toString().trim();
                if (checkMaBandoc(s)) {
                    try {
                        BanDoc bd = new BanDoc();
                        bd.setMaBD(txtma.getText().toString().trim());
                        bd.setTenBD(txtten.getText().toString().trim());
                        bd.setDiachi(txtdchi.getText().toString().trim());
                        bd.setDienthoai(txtdthoai.getText().toString().trim());                        
                        bandoc.add(bd);
                        bandocTableModel.fireTableDataChanged();                        
                        changeState(State.normal);
                        resetBandocChitiet();
                        file.outFile(bandoc, "bandoc.dat");
                    } catch (IOException ex) {
                    }catch(NumberFormatException e)
                    {
                        JOptionPane.showMessageDialog(null, "sai dang du lieu");
                    }                    
                } else {
                    JOptionPane.showMessageDialog(null, "Ma ban doc trung");
                    return;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Thong tin dien chua day du!");
            }
        }
        else if(state == State.editBanDoc){
            if (checkValidBandocChitiet()) {
                try {
                    BanDoc bd = bandoc.get(bandocTable.getSelectedRow());
                    bd.setMaBD(txtma.getText().toString().trim());
                    bd.setTenBD(txtten.getText().toString().trim());
                    bd.setDiachi(txtdchi.getText().toString().trim());
                    bd.setDienthoai(txtdthoai.getText().toString().trim());                    
                    bandocTableModel.fireTableDataChanged();                    
                    changeState(State.normal);
                    resetBandocChitiet();
                    file.outFile(bandoc, "bandoc.dat");
                } catch (IOException ex) {
                }
            } else {
                JOptionPane.showMessageDialog(null, "Thong tin dien chua day du");
            }
        }
    }//GEN-LAST:event_btCapnhatActionPerformed

    private void btsapxepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsapxepActionPerformed
        if(combosx.getSelectedIndex() >= 0){
            String s  = sort[combosx.getSelectedIndex()];
            tambandoc.removeAll(tambandoc);
            if(s.equals("Ma ban doc")){
                SortByMa SortByMa = new SortByMa();
                tambandoc.addAll(bandoc);
                Collections.sort(tambandoc,SortByMa);
                tamBandocTableModel.fireTableDataChanged();                                              
            }
            else if(s.equals("Ho ten")){
                SortByHoten SortByHoten = new SortByHoten();
                tambandoc.addAll(bandoc);
                Collections.sort(tambandoc,SortByHoten);
                tamBandocTableModel.fireTableDataChanged();                   
            }
            else if(s.equals("Dia chi")){
                SortByDiachi bydchi = new SortByDiachi();
                tambandoc.addAll(bandoc);
                Collections.sort(tambandoc,bydchi);
                tamBandocTableModel.fireTableDataChanged();  
            }
            else if(s.equals("Dien thoai")){
                SortByDienthoai bydthoai = new SortByDienthoai();
                tambandoc.addAll(bandoc);
                Collections.sort(tambandoc,bydthoai);
                tamBandocTableModel.fireTableDataChanged();  
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Hay chon truong de sap xep!");
        }        
    }//GEN-LAST:event_btsapxepActionPerformed

    private void bttimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttimkiemActionPerformed
        if(txttim.getText().trim().equals("") || combotk.getSelectedIndex() < 0){
            JOptionPane.showMessageDialog(null,"Nhap thong tin tim kiem!");
            return;
        }
        else{
           Search find = new Search();
           String key =  txttim.getText().trim();
           String flag = search[combotk.getSelectedIndex()];
           if(flag.equals("Ma ban doc")){
               if(find.searchByMa(key,bandoc)!= null){
                   tambandoc.removeAll(tambandoc);
                   tambandoc.addAll(find.searchByMa(key,bandoc));
                   tamBandocTableModel.fireTableDataChanged();
               }
               else{
                   JOptionPane.showMessageDialog(null,"khong tim thay ban doc nao");
               }
           }
            if(flag.equals("Ho ten")){
               if(find.searchByHoten(key,bandoc)!= null){
                   tambandoc.removeAll(tambandoc);
                   tambandoc.addAll(find.searchByHoten(key,bandoc));
                   tamBandocTableModel.fireTableDataChanged();
               }
               else{
                   JOptionPane.showMessageDialog(null,"khong tim thay ban doc nao");
               }
           }
           if(flag.equals("Dia chi")){
               if(find.searchByDchi(key,bandoc)!= null){
                   tambandoc.removeAll(tambandoc);
                   tambandoc.addAll(find.searchByDchi(key,bandoc));
                   tamBandocTableModel.fireTableDataChanged();
               }
               else{
                   JOptionPane.showMessageDialog(null,"khong tim thay ban doc nao");
               }
           }
           if(flag.equals("Dien thoai")){
               if(find.searchByDthoai(key,bandoc)!= null){
                   tambandoc.removeAll(tambandoc);
                   tambandoc.addAll(find.searchByDthoai(key,bandoc));
                   tamBandocTableModel.fireTableDataChanged();
               }
               else{
                   JOptionPane.showMessageDialog(null,"khong tim thay ban doc nao");
               }
           }
           if(flag.equals("Tat ca")){
               if(find.searchByBatky(key,bandoc)!= null){
                   tambandoc.removeAll(tambandoc);
                   tambandoc.addAll(find.searchByBatky(key,bandoc));
                   tamBandocTableModel.fireTableDataChanged();
               }
               else{
                   JOptionPane.showMessageDialog(null,"khong tim thay ban doc nao");
               }
           }
        }
    }//GEN-LAST:event_bttimkiemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Run().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bandocTable;
    private javax.swing.JButton btBoqua;
    private javax.swing.JButton btCapnhat;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXoa;
    private javax.swing.JButton btsapxep;
    private javax.swing.JButton bttimkiem;
    private javax.swing.JComboBox<String> combosx;
    private javax.swing.JComboBox<String> combotk;
    private javax.swing.JTable hienthiTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtdchi;
    private javax.swing.JTextField txtdthoai;
    private javax.swing.JTextField txtma;
    private javax.swing.JTextField txtten;
    private javax.swing.JTextField txttim;
    // End of variables declaration//GEN-END:variables
enum State {
    addBanDoc,
    editBanDoc,
    normal,    
    }
}
