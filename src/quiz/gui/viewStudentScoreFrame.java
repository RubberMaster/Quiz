/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.gui;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import quiz.dao.PerformanceDAO;
import quiz.pojo.StudentStore;

/**
 *
 * @author Pravesh
 */
public class viewStudentScoreFrame extends javax.swing.JFrame {

    /**
     * Creates new form viewStudentScoreFrame
     */
    ArrayList<String>examIdList=new ArrayList<>();
    boolean isAdding;//class level par boolean ki default value false hoti hai
    public viewStudentScoreFrame() {
        initComponents();
        super.setLocationRelativeTo(null);
        
    }
      public viewStudentScoreFrame(ArrayList<String>examIdList)
    
     {
         this();
         this.examIdList=examIdList;
         loadUI();

         
     }
      public void loadUI()
      {
          txtUserId.setText(loginFrame.uname);
          isAdding=true;
          jcExamId.removeAllItems();
          jcExamId.addItem("ExamId");
          for(String exid:examIdList)
          {
              jcExamId.addItem(exid);
              isAdding=false;
          }
          
          
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
        txtUserId = new javax.swing.JTextField();
        jcExamId = new javax.swing.JComboBox<>();
        btnback = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtLanguage = new javax.swing.JTextField();
        txtPer = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        txtUserId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jcExamId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcExamId.setForeground(new java.awt.Color(255, 102, 0));
        jcExamId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcExamIdActionPerformed(evt);
            }
        });

        btnback.setBackground(new java.awt.Color(0, 0, 0));
        btnback.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnback.setForeground(new java.awt.Color(255, 153, 51));
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\Java Project\\questionpaper4.jpg")); // NOI18N
        jLabel1.setText("jLabel1");

        txtLanguage.setText("jTextField1");

        txtPer.setText("jTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUserId)
                            .addComponent(jcExamId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnback, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(72, 72, 72))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jcExamId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(txtLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnback))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcExamIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcExamIdActionPerformed
        // TODO add your handling code here:
        if(isAdding==true)
            return;
        String examId=jcExamId.getSelectedItem().toString();
        if(examId.equals("ExamId"))
        {
             JOptionPane.showMessageDialog(null,"Please select an ExamId:","No ExamId Selected!",JOptionPane.ERROR_MESSAGE);
       return;
        }
        try
        {
             StudentStore scoreobj=PerformanceDAO.getScore(loginFrame.uname,examId);
          txtLanguage.setText(scoreobj.getLanguage());
          txtPer.setText(String.valueOf(scoreobj.getPercent()));
          }
          catch(SQLException sq)
             {
                 JOptionPane.showMessageDialog(null,"SQL Exception"+sq,"ERROR!",JOptionPane.ERROR_MESSAGE);
                    sq.printStackTrace();
             }
         
        
    }//GEN-LAST:event_jcExamIdActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        studentOptionsFrame studentFrame=new studentOptionsFrame();
        studentFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

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
            java.util.logging.Logger.getLogger(viewStudentScoreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewStudentScoreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewStudentScoreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewStudentScoreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewStudentScoreFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcExamId;
    private javax.swing.JTextField txtLanguage;
    private javax.swing.JTextField txtPer;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables
}
