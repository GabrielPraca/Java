/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgFrames;

import DAOFactory.DAOFactory;
import SeverUtils.Config;
import de.javasoft.plaf.synthetica.SyntheticaBlueIceLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import static pkgFrames.frmMain.UpdateBalance;
import static pkgFrames.frmMain.wsCon;

/**
 *
 * @author Gabriel
 */
public class frmAddFunds extends javax.swing.JFrame {

    /**
     * Creates new form frmAddFunds
     */
    public frmAddFunds() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackgroundAddFunds = new javax.swing.JPanel();
        lblDescriptionAddFunds = new javax.swing.JLabel();
        txtAddFunds = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnAddFunds = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Fundos");
        setResizable(false);

        pnlBackgroundAddFunds.setBackground(new java.awt.Color(0, 102, 102));
        pnlBackgroundAddFunds.setForeground(new java.awt.Color(255, 255, 255));

        lblDescriptionAddFunds.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        lblDescriptionAddFunds.setForeground(new java.awt.Color(255, 255, 255));
        lblDescriptionAddFunds.setText("Valor a ser adicionado:");

        txtAddFunds.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnCancel.setText("Cancelar");
        btnCancel.setFocusPainted(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnAddFunds.setText("Ok");
        btnAddFunds.setToolTipText("");
        btnAddFunds.setFocusPainted(false);
        btnAddFunds.setMaximumSize(new java.awt.Dimension(77, 23));
        btnAddFunds.setMinimumSize(new java.awt.Dimension(77, 23));
        btnAddFunds.setPreferredSize(new java.awt.Dimension(77, 23));
        btnAddFunds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFundsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBackgroundAddFundsLayout = new javax.swing.GroupLayout(pnlBackgroundAddFunds);
        pnlBackgroundAddFunds.setLayout(pnlBackgroundAddFundsLayout);
        pnlBackgroundAddFundsLayout.setHorizontalGroup(
            pnlBackgroundAddFundsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundAddFundsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBackgroundAddFundsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundAddFundsLayout.createSequentialGroup()
                        .addComponent(lblDescriptionAddFunds)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtAddFunds)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundAddFundsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAddFunds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlBackgroundAddFundsLayout.setVerticalGroup(
            pnlBackgroundAddFundsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundAddFundsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDescriptionAddFunds)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAddFunds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBackgroundAddFundsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnAddFunds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBackgroundAddFunds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackgroundAddFunds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnAddFundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFundsActionPerformed
        try
        {
            DAOFactory.getUserDAO().IncrementBalance(Float.parseFloat(txtAddFunds.getText()),
                                                  Config.getUser().getUserID(), wsCon.GetConnection());
            
            Config.setUser(DAOFactory.getUserDAO().getUser(Config.getUser().getUserID(), wsCon.GetConnection()));
            
            UpdateBalance();
        }
        catch (Exception ex)
        {
            Logger.getLogger(frmAddFunds.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.dispose();
    }//GEN-LAST:event_btnAddFundsActionPerformed

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
                new frmAddFunds().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddFunds;
    private javax.swing.JButton btnCancel;
    private javax.swing.JLabel lblDescriptionAddFunds;
    private javax.swing.JPanel pnlBackgroundAddFunds;
    private javax.swing.JTextField txtAddFunds;
    // End of variables declaration//GEN-END:variables
}
