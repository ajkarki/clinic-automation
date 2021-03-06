/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlertGUI extends javax.swing.JFrame {

    /**
     * Creates new form AlertGUI
     */
    public AlertGUI() {
        initComponents();
        
        setAlwaysOnTop(true);
        Insets toolheight = Toolkit.getDefaultToolkit().getScreenInsets(getGraphicsConfiguration());
        Dimension scrsize = Toolkit.getDefaultToolkit().getScreenSize();
        new Thread(new Runnable(){
            public void run(){
                for(int i = 0; i < getHeight(); i++){
                    setLocation(scrsize.width - getWidth(), scrsize.height - toolheight.bottom - i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(AlertGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton_alertview = new javax.swing.JButton();
        jButton_alertexit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(400, 150));
        setMinimumSize(new java.awt.Dimension(400, 150));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(400, 150));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(110, 170, 230));
        jPanel1.setMaximumSize(new java.awt.Dimension(400, 150));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 150));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 150));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        jPanel2.setMaximumSize(new java.awt.Dimension(390, 115));
        jPanel2.setMinimumSize(new java.awt.Dimension(390, 115));
        jPanel2.setPreferredSize(new java.awt.Dimension(390, 115));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Helvetica", 0, 20)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Hi, here is a message for you!");
        jTextField1.setBorder(null);

        jButton_alertview.setBackground(new java.awt.Color(45, 175, 75));
        jButton_alertview.setFont(new java.awt.Font("Helvetica", 0, 20)); // NOI18N
        jButton_alertview.setForeground(new java.awt.Color(255, 255, 255));
        jButton_alertview.setText("View");
        jButton_alertview.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 175, 75)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 175, 75), 3)));
        jButton_alertview.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_alertview.setMaximumSize(new java.awt.Dimension(75, 30));
        jButton_alertview.setMinimumSize(new java.awt.Dimension(75, 30));
        jButton_alertview.setPreferredSize(new java.awt.Dimension(75, 30));
        jButton_alertview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_alertviewActionPerformed(evt);
            }
        });

        jButton_alertexit.setBackground(new java.awt.Color(200, 65, 75));
        jButton_alertexit.setFont(new java.awt.Font("Helvetica", 0, 20)); // NOI18N
        jButton_alertexit.setForeground(new java.awt.Color(255, 255, 255));
        jButton_alertexit.setText("Exit");
        jButton_alertexit.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 65, 75)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 65, 75), 3)));
        jButton_alertexit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_alertexit.setMaximumSize(new java.awt.Dimension(75, 30));
        jButton_alertexit.setMinimumSize(new java.awt.Dimension(75, 30));
        jButton_alertexit.setPreferredSize(new java.awt.Dimension(75, 30));
        jButton_alertexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_alertexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_alertexit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jButton_alertview, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_alertview, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_alertexit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_alertexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_alertexitActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton_alertexitActionPerformed

    private void jButton_alertviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_alertviewActionPerformed
        NotificationGUI notify = new NotificationGUI();
        notify.setVisible(true);
        pack();
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton_alertviewActionPerformed

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
            java.util.logging.Logger.getLogger(AlertGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlertGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlertGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlertGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlertGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_alertexit;
    private javax.swing.JButton jButton_alertview;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
