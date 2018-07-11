package bai5;


import javax.swing.*;


public class Form1 extends javax.swing.JFrame {

    public Form1() {
        setLocation(200, 200);
        initComponents();        
    }
    String getTxtA() {
       return(txtA.getText()); 
    }
    void setTxtA(String x) {
        txtA.setText(x);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA = new javax.swing.JTextArea();
        jMenuBar2 = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mnuItemReplace = new javax.swing.JMenuItem();
        mnuItemExit = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Notepad");

        txtA.setColumns(20);
        txtA.setRows(5);
        txtA.setText("Hello World, how are you to day. Hello World, how\nare you to day. Hello World, how are you to day.\nHello World, how are you to day. Hello\n World, how are you to day.");
        jScrollPane1.setViewportView(txtA);

        mnuFile.setText("File");
        mnuFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuFileMouseClicked(evt);
            }
        });

        mnuItemReplace.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        mnuItemReplace.setText("Replace");
        mnuItemReplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemReplaceActionPerformed(evt);
            }
        });
        mnuFile.add(mnuItemReplace);

        mnuItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        mnuItemExit.setText("Exit");
        mnuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemExitActionPerformed(evt);
            }
        });
        mnuFile.add(mnuItemExit);

        jMenuBar2.add(mnuFile);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemExitActionPerformed
     // yes, k = 0, No, k = 1
     int k = JOptionPane.showConfirmDialog(null,"Do you want to exit the application?","Question",JOptionPane.YES_NO_OPTION);
     if(k == 0) System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuItemExitActionPerformed

    private void mnuFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuFileMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuFileMouseClicked

    private void mnuItemReplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemReplaceActionPerformed
    Form2 t = new Form2(this);
    t.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    t.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuItemReplaceActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenuItem mnuItemExit;
    private javax.swing.JMenuItem mnuItemReplace;
    private javax.swing.JTextArea txtA;
    // End of variables declaration//GEN-END:variables
}
