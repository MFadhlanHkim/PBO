/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uas_pbo;

/**
 *
 * @author 62896
 */
public class Main_Utama extends javax.swing.JFrame {

    public Main_Utama() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        laporan = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_peta = new javax.swing.JButton();
        btn_buatL = new javax.swing.JButton();
        btn_login = new javax.swing.JButton();
        btn_valid = new javax.swing.JButton();
        btn_notif = new javax.swing.JButton();
        btn_kontak = new javax.swing.JButton();
        btn_main = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(231, 212, 181));

        jPanel1.setBackground(new java.awt.Color(232, 212, 181));
        jPanel1.setForeground(new java.awt.Color(232, 212, 181));
        jPanel1.setPreferredSize(new java.awt.Dimension(914, 552));

        laporan.setFont(new java.awt.Font("JetBrains Mono", 1, 36)); // NOI18N
        laporan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        laporan.setText("LAPORSU!!!");

        jPanel2.setBackground(new java.awt.Color(182, 199, 170));

        btn_peta.setBackground(new java.awt.Color(182, 199, 170));
        btn_peta.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        btn_peta.setText("Peta");
        btn_peta.setBorder(null);
        btn_peta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_petaActionPerformed(evt);
            }
        });

        btn_buatL.setBackground(new java.awt.Color(182, 199, 170));
        btn_buatL.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        btn_buatL.setText("Buat Laporan");
        btn_buatL.setBorder(null);
        btn_buatL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buatLActionPerformed(evt);
            }
        });

        btn_login.setBackground(new java.awt.Color(182, 199, 170));
        btn_login.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        btn_login.setText("Login");
        btn_login.setBorder(null);
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        btn_valid.setBackground(new java.awt.Color(182, 199, 170));
        btn_valid.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        btn_valid.setText("Validasi");
        btn_valid.setBorder(null);
        btn_valid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_validActionPerformed(evt);
            }
        });

        btn_notif.setBackground(new java.awt.Color(182, 199, 170));
        btn_notif.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        btn_notif.setText("Notifikasi");
        btn_notif.setBorder(null);
        btn_notif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_notifActionPerformed(evt);
            }
        });

        btn_kontak.setBackground(new java.awt.Color(182, 199, 170));
        btn_kontak.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        btn_kontak.setText("Kontak");
        btn_kontak.setBorder(null);
        btn_kontak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kontakActionPerformed(evt);
            }
        });

        btn_main.setBackground(new java.awt.Color(182, 199, 170));
        btn_main.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_main.setText("MENU");
        btn_main.setBorder(null);
        btn_main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_buatL, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
            .addComponent(btn_peta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_kontak, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(btn_valid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(btn_notif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_main, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(btn_main, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_peta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_buatL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_valid, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_notif, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_kontak, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 296, Short.MAX_VALUE)
                .addComponent(laporan, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(laporan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(417, 417, 417)))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(930, 560));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buatLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buatLActionPerformed
        Laporan L = new Laporan();
        L.show();
        
        dispose();
    }//GEN-LAST:event_btn_buatLActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        Form_Login FL  = new Form_Login();
        FL.show();
        
        dispose();
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_validActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_validActionPerformed
        Validasi V = new Validasi();
        V.show();
        
        dispose();
    }//GEN-LAST:event_btn_validActionPerformed

    private void btn_notifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_notifActionPerformed
        Notifikasi N = new Notifikasi();
        N.show();
        
        dispose();
    }//GEN-LAST:event_btn_notifActionPerformed

    private void btn_kontakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kontakActionPerformed
        Kontak K = new Kontak();
        K.show();
        
        dispose();
    }//GEN-LAST:event_btn_kontakActionPerformed

    private void btn_petaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_petaActionPerformed
        Peta P = new Peta();
        P.show();
        
        dispose();
    }//GEN-LAST:event_btn_petaActionPerformed

    private void btn_mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mainActionPerformed
        Main_Utama MU = new Main_Utama();
        MU.show();
        
        dispose();
    }//GEN-LAST:event_btn_mainActionPerformed

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
            java.util.logging.Logger.getLogger(Main_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buatL;
    private javax.swing.JButton btn_kontak;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_main;
    private javax.swing.JButton btn_notif;
    private javax.swing.JButton btn_peta;
    private javax.swing.JButton btn_valid;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel laporan;
    // End of variables declaration//GEN-END:variables
}
