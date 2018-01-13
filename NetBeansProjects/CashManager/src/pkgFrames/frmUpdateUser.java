
package pkgFrames;

import DAOFactory.DAOFactory;
import SeverUtils.Config;
import de.javasoft.plaf.synthetica.SyntheticaBlueIceLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import static pkgFrames.frmMain.UpdateInformations;
import static pkgFrames.frmMain.wsCon;

public class frmUpdateUser extends javax.swing.JFrame {

    public frmUpdateUser() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        lblDescriptionUserName = new javax.swing.JLabel();
        lblDescriptionNewPassword = new javax.swing.JLabel();
        lblDescriptionSalary = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        txtBalance = new javax.swing.JTextField();
        lblDescriptionSalary1 = new javax.swing.JLabel();
        txtNewPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Atualizar Usuário");

        pnlBackground.setBackground(new java.awt.Color(255, 255, 255));

        lblDescriptionUserName.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        lblDescriptionUserName.setText("Nome do usuário:");

        lblDescriptionNewPassword.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        lblDescriptionNewPassword.setText("Nova Senha:");

        lblDescriptionSalary.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        lblDescriptionSalary.setText("Salario:");

        btnSave.setText("OK");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblDescriptionSalary1.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        lblDescriptionSalary1.setText("Saldo:");

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSalary)
                    .addComponent(txtUserName)
                    .addComponent(txtBalance)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                        .addGap(0, 125, Short.MAX_VALUE)
                        .addComponent(btnCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescriptionUserName)
                            .addComponent(lblDescriptionNewPassword)
                            .addComponent(lblDescriptionSalary)
                            .addComponent(lblDescriptionSalary1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtNewPassword))
                .addContainerGap())
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblDescriptionUserName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescriptionNewPassword)
                .addGap(1, 1, 1)
                .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescriptionSalary)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescriptionSalary1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnSave))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try
        {
            Model.User newUser = Config.getUser();
            
            if(!txtUserName.getText().equals("") && !txtUserName.getText().equals(null))
            {
                newUser.setUserName(txtUserName.getText());
            }
            if(!txtNewPassword.getText().equals("") && !txtNewPassword.getText().equals(null))
            {
                newUser.setPassword(txtNewPassword.getText());
            }
            if(!txtSalary.getText().equals("") && !txtSalary.getText().equals(null))
            {
                //adionar mascara so para valores float
                newUser.setSalary(Float.parseFloat(txtSalary.getText()));
            }
            if(!txtBalance.getText().equals("") && !txtBalance.getText().equals(null))
            {
                //adionar mascara so para valores float
                newUser.setBalance(Float.parseFloat(txtBalance.getText()));
            }
            
            DAOFactory.getUserDAO().UpdateUser(newUser, wsCon.GetConnection());

            Config.setUser(newUser);            
            UpdateInformations(Config.getUser());

            this.dispose();
        }
        catch (Exception ex)
        {
            Logger.getLogger(frmAddExpense.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {            
        try
        {
            javax.swing.UIManager.setLookAndFeel(new SyntheticaBlueIceLookAndFeel());
        }   
        catch (Exception e)            
        {
            e.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUpdateUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblDescriptionNewPassword;
    private javax.swing.JLabel lblDescriptionSalary;
    private javax.swing.JLabel lblDescriptionSalary1;
    private javax.swing.JLabel lblDescriptionUserName;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
