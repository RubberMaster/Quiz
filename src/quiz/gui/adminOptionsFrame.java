/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.gui;

import java.awt.Font;

/**
 *
 * @author Pravesh
 */
public class adminOptionsFrame extends javax.swing.JFrame {

    /**
     * Creates new form adminOptionsFrame
     */
    public adminOptionsFrame() {

        initComponents();
        this.setTitle("The Quizz App");
        jLabel5.setText("Hello  " + loginFrame.uname);
        super.setLocationRelativeTo(null);

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
        txtLogout = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        txtShowname = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jrbSetPaper = new javax.swing.JRadioButton();
        jrbEditPaper = new javax.swing.JRadioButton();
        jrbRegister = new javax.swing.JRadioButton();
        jrbViewScores = new javax.swing.JRadioButton();
        btnDoTask = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        txtLogout.setBackground(new java.awt.Color(0, 0, 0));
        txtLogout.setForeground(new java.awt.Color(255, 153, 51));
        txtLogout.setText("Log Out");

        btnLogout.setBackground(new java.awt.Color(0, 0, 0));
        btnLogout.setForeground(new java.awt.Color(255, 153, 51));
        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        txtShowname.setBackground(new java.awt.Color(0, 0, 0));
        txtShowname.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                txtShownameMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtShownameMouseMoved(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("ONLINE QUIZ ADMINISTRATION PANEL");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("Make A Choice");

        jrbSetPaper.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbSetPaper);
        jrbSetPaper.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbSetPaper.setForeground(new java.awt.Color(255, 153, 51));
        jrbSetPaper.setText("Set A Paper");

        jrbEditPaper.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbEditPaper);
        jrbEditPaper.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbEditPaper.setForeground(new java.awt.Color(255, 153, 51));
        jrbEditPaper.setText("Edit Paper");

        jrbRegister.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbRegister);
        jrbRegister.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbRegister.setForeground(new java.awt.Color(255, 153, 51));
        jrbRegister.setText("Register Student");
        jrbRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbRegisterActionPerformed(evt);
            }
        });

        jrbViewScores.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbViewScores);
        jrbViewScores.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbViewScores.setForeground(new java.awt.Color(255, 153, 51));
        jrbViewScores.setText("View Scores");
        jrbViewScores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbViewScoresActionPerformed(evt);
            }
        });

        btnDoTask.setBackground(new java.awt.Color(51, 51, 51));
        btnDoTask.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDoTask.setForeground(new java.awt.Color(255, 153, 51));
        btnDoTask.setText("TO DO TASK");
        btnDoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoTaskActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(255, 153, 51));

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 51));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 51));
        jLabel6.setText("Log Out");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
        });

        jLabel7.setText("jLabel7");

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pravesh\\Desktop\\download.jpg")); // NOI18N
        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout txtShownameLayout = new javax.swing.GroupLayout(txtShowname);
        txtShowname.setLayout(txtShownameLayout);
        txtShownameLayout.setHorizontalGroup(
            txtShownameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtShownameLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(txtShownameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtShownameLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addGroup(txtShownameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(txtShownameLayout.createSequentialGroup()
                        .addGroup(txtShownameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(txtShownameLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(127, 127, 127))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtShownameLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)))
                        .addGroup(txtShownameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbSetPaper, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbEditPaper, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbRegister)
                            .addComponent(jrbViewScores, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDoTask, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtShownameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        txtShownameLayout.setVerticalGroup(
            txtShownameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtShownameLayout.createSequentialGroup()
                .addGroup(txtShownameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtShownameLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(txtShownameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(txtShownameLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(txtShownameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(txtShownameLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)))
                .addGap(30, 30, 30)
                .addGroup(txtShownameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtShownameLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jrbSetPaper)
                        .addGap(18, 18, 18)
                        .addComponent(jrbEditPaper)
                        .addGap(18, 18, 18)
                        .addComponent(jrbRegister)
                        .addGap(18, 18, 18)
                        .addComponent(jrbViewScores)
                        .addGap(18, 18, 18)
                        .addComponent(btnDoTask))
                    .addGroup(txtShownameLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtShowname, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtShowname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbViewScoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbViewScoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbViewScoresActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        loginFrame lFrame = new loginFrame();
        lFrame.setVisible(true);//phele button bana diya tha isilye
        this.dispose();//faltu hi kar rakhi hai
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        dispose();
        loginFrame lFrame = new loginFrame();
        lFrame.setVisible(true);

    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
        Font f = new Font("Tahoma", Font.ITALIC, 14);
        jLabel6.setFont(f);

    }//GEN-LAST:event_jLabel6MouseEntered

    private void txtShownameMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtShownameMouseMoved
        // TODO add your handling code here:


    }//GEN-LAST:event_txtShownameMouseMoved

    private void txtShownameMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtShownameMouseDragged
        // TODO add your handling code here:

    }//GEN-LAST:event_txtShownameMouseDragged

    private void jrbRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbRegisterActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jrbRegisterActionPerformed

    private void btnDoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoTaskActionPerformed
        // TODO add your handling code here:
        if (jrbRegister.isSelected()) {
            registerStudentFrame register = new registerStudentFrame();
            register.setVisible(true);
            this.dispose();
        }
        if (jrbSetPaper.isSelected()) {
            setPaperFrame setpaper = new setPaperFrame();
            setpaper.setVisible(true);
            this.dispose();
        }
        if (jrbRegister.isSelected()) {
            registerStudentFrame register = new registerStudentFrame();
            register.setVisible(true);
            this.dispose();
        }
        if (jrbEditPaper.isSelected()) {
            //this.dispose();
            editPaperFrame editpaper = new editPaperFrame();
            editpaper.setVisible(true);
            this.dispose();
        }
        if (jrbViewScores.isSelected()) {
            viewScoreFrame viewScore = new viewScoreFrame();
            viewScore.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnDoTaskActionPerformed

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
            java.util.logging.Logger.getLogger(adminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminOptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoTask;
    private javax.swing.JButton btnLogout;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jrbEditPaper;
    private javax.swing.JRadioButton jrbRegister;
    private javax.swing.JRadioButton jrbSetPaper;
    private javax.swing.JRadioButton jrbViewScores;
    private javax.swing.JLabel txtLogout;
    private javax.swing.JPanel txtShowname;
    // End of variables declaration//GEN-END:variables
}
