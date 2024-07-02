
package view;
import java.sql.*;
import javax.swing.*;
import config.KoneksiDB;
import config.UserSession;

public class Login extends javax.swing.JFrame {

    Connection con = KoneksiDB.getConnection();;
    ResultSet rs;
    
    public Login() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Petugas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        In_username = new javax.swing.JTextField();
        In_password = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        Siswa = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        submit_siswa = new javax.swing.JButton();
        tNisn = new javax.swing.JTextField();
        bg = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 51));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGIN APLIKASI");

        jLabel4.setFont(new java.awt.Font("Open Sans", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" x");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(37, 37, 37))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 460, 130));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N

        Petugas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 5, true));

        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Password");

        In_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In_usernameActionPerformed(evt);
            }
        });

        In_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In_passwordActionPerformed(evt);
            }
        });

        submit.setText("Login");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PetugasLayout = new javax.swing.GroupLayout(Petugas);
        Petugas.setLayout(PetugasLayout);
        PetugasLayout.setHorizontalGroup(
            PetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PetugasLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(PetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PetugasLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2))
                    .addComponent(In_username, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PetugasLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel3))
                    .addComponent(In_password, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PetugasLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
        );
        PetugasLayout.setVerticalGroup(
            PetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PetugasLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(In_username, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addComponent(In_password, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        jTabbedPane1.addTab("Petugas", Petugas);

        Siswa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 5, true));

        jLabel6.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("NISN SISWA");

        submit_siswa.setText("Login Siswa");
        submit_siswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_siswaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SiswaLayout = new javax.swing.GroupLayout(Siswa);
        Siswa.setLayout(SiswaLayout);
        SiswaLayout.setHorizontalGroup(
            SiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SiswaLayout.createSequentialGroup()
                .addGroup(SiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SiswaLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(submit_siswa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SiswaLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(tNisn, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SiswaLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel6)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        SiswaLayout.setVerticalGroup(
            SiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SiswaLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(tNisn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(submit_siswa, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Siswa", Siswa);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 370, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 460, 470));

        bg.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        String user = In_username.getText();
        String pass = In_password.getText();

        try {
            Statement st = con.createStatement();
            String sql = "SELECT * FROM  petugas where username='"+user+"' and password='"+pass+"'";
            rs = st.executeQuery(sql);

            if (rs.next()) {
                String id = rs.getString("id_petugas");
                String username = rs.getString("username");
                String nama = rs.getString("nama_petugas");
                String level = rs.getString("level");
                
                //set user data session
                UserSession.set_id(id);
                UserSession.set_username(username);
                UserSession.set_nama(nama);
                UserSession.set_level(level);
                
                switch (level) {
                    case "admin":
                    {
                        JOptionPane.showMessageDialog(null, "Selamat datang "+ nama +" !");
                        Dashboard dsb = new Dashboard();
                        dsb.dashAdmin();
                        dsb.setExtendedState(JFrame.MAXIMIZED_BOTH);
                        dsb.setVisible(true);
                        dispose();
                        break;
                    }
                    case "petugas":
                    {
                        JOptionPane.showMessageDialog(null, "Selamat datang "+ nama +" !");
                        Dashboard dsb = new Dashboard();
                        dsb.dashPetugas();
                        dsb.setExtendedState(JFrame.MAXIMIZED_BOTH);
                        dsb.setVisible(true);
                        dispose();
                        break;
                    }
                    default:
                    break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Username atau password salah");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void submit_siswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_siswaActionPerformed
        String Get_nisn = tNisn.getText();

        try {
            String sql = "SELECT * FROM  siswa where nisn='"+Get_nisn+"'";
            rs = con.createStatement().executeQuery(sql);

            if (rs.next()) {
                String nisn = rs.getString("nisn");
                String nama_siswa = rs.getString("nama");
                
                //set user data session
                UserSession.set_nisn(nisn);
                UserSession.set_nama_siswa(nama_siswa);
                
                JOptionPane.showMessageDialog(null, "Selamat datang "+ nama_siswa +" !");
                Dashboard dsb = new Dashboard();
                dsb.dashSiswa();
                dsb.setExtendedState(JFrame.MAXIMIZED_BOTH);
                dsb.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "NISN tidak ditemukan");
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_submit_siswaActionPerformed

    private void In_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_In_usernameActionPerformed

    private void In_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_In_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField In_password;
    private javax.swing.JTextField In_username;
    private javax.swing.JPanel Petugas;
    private javax.swing.JPanel Siswa;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton submit;
    private javax.swing.JButton submit_siswa;
    private javax.swing.JTextField tNisn;
    // End of variables declaration//GEN-END:variables
}
