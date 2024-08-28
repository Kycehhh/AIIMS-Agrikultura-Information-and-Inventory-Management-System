/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author janed
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        setLocationRelativeTo(null); 
        showDate();
        showTime();
                            

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        loginbtn = new javax.swing.JButton();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1350, 829));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyApp/logo.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, 190));

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 1, 30)); // NOI18N
        jLabel2.setText("Information and Inventory Management System");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 660, 280));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 550, 130, 30));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 480, 140, 30));

        user.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, 350, -1));

        pass.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 540, 350, -1));

        loginbtn.setBackground(new java.awt.Color(255, 255, 255));
        loginbtn.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        loginbtn.setText("Log in");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 610, 160, -1));

        date.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 30, 70, 20));

        time.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 30, 80, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        //login functionality username and password entered must be correct to enter system home page
        String lgn = user.getText();
        String pwd = pass.getText();
        
        if(user.getText().isEmpty())
            JOptionPane.showMessageDialog(null,"Please check that all inputs are filled!");
        else{
            if(lgn.equals("Admin") & pwd.equals("Admin")){
            JOptionPane.showMessageDialog(null,"Logging in!");
            Home home = new Home();
            home.show();
            dispose();
            }
             else
                JOptionPane.showMessageDialog(null,"Incorrect username or password!"); 
            }
    }//GEN-LAST:event_loginbtnActionPerformed
    void showDate(){
            SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
            Date d = new Date();
            date.setText(s.format(d));
    }                                    
    void showTime(){
        new Timer(0, new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
            SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
            Date d = new Date();
            time.setText(s.format(d));                   
            }  
        }).start();
    }
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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel time;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
