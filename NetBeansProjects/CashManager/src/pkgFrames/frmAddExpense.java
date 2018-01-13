
package pkgFrames;

import DAOFactory.DAOFactory;
import Model.ExpenseType;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static pkgFrames.frmMain.wsCon;
import SeverUtils.Config;
import de.javasoft.plaf.synthetica.SyntheticaBlueIceLookAndFeel;
import javax.swing.UnsupportedLookAndFeelException;
import static pkgFrames.frmMain.UpdateInformations;

public class frmAddExpense extends javax.swing.JFrame
{

    private List<Model.ExpenseType> expenTypes;        
    private int expenTypeID = 0;
    
    public frmAddExpense()
    {
        this.expenTypes = null;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        cmbExpenseType = new javax.swing.JComboBox<>();
        lblDescriptionExpenseType = new javax.swing.JLabel();
        lblDescriptionExpenseLocality = new javax.swing.JLabel();
        txtExpenseLocality = new javax.swing.JTextField();
        lblDescriptionExpenseCost = new javax.swing.JLabel();
        txtExpenseCost = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Despesa");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImages(null);
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlBackground.setBackground(new java.awt.Color(255, 255, 255));

        lblDescriptionExpenseType.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        lblDescriptionExpenseType.setText("Tipo:");

        lblDescriptionExpenseLocality.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        lblDescriptionExpenseLocality.setText("Local:");

        lblDescriptionExpenseCost.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        lblDescriptionExpenseCost.setText("Custo:");

        btnSave.setText("Adicionar");
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

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbExpenseType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtExpenseLocality)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescriptionExpenseType)
                            .addComponent(lblDescriptionExpenseLocality)
                            .addComponent(lblDescriptionExpenseCost))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtExpenseCost)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                        .addGap(0, 134, Short.MAX_VALUE)
                        .addComponent(btnCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave)))
                .addContainerGap())
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblDescriptionExpenseType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbExpenseType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescriptionExpenseLocality)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtExpenseLocality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescriptionExpenseCost)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtExpenseCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblDescriptionExpenseType.getAccessibleContext().setAccessibleName("\n");
        lblDescriptionExpenseLocality.getAccessibleContext().setAccessibleName("");

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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try
        {
            expenTypes = DAOFactory.getExpenseTypeDAO().getAllExpenseType(wsCon.GetConnection());            
            
            expenTypes.stream().forEach((ExpenseType expType) -> {
                cmbExpenseType.addItem(expType.getExpenseTypeName());
            });         
        }
        catch (Exception ex)
        {
            Logger.getLogger(frmAddExpense.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try
        {
            expenTypeID = 0;
            expenTypes.stream().forEach((ExpenseType expType) -> {
                if(cmbExpenseType.getSelectedItem().toString().equals(expType.getExpenseTypeName()))
                {
                    expenTypeID = expType.getExpenseTypeID();
                }
            });
            
            //Validar custo!
            
            Model.Expense expense = new Model.Expense(0, 1, expenTypeID, Config.getUser().getUserID(),
                                                      txtExpenseLocality.getText(),
                                                      -Float.parseFloat(txtExpenseCost.getText()));
                
            DAOFactory.getExpenseDAO().addExpense(expense, wsCon.GetConnection());
            DAOFactory.getUserDAO().RemoveBalance(Float.parseFloat(txtExpenseCost.getText()),
                                                  Config.getUser().getUserID(), wsCon.GetConnection());
            
            this.dispose();
        }
        catch (Exception ex)
        {
            Logger.getLogger(frmAddExpense.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try
        {
            UpdateInformations(Config.getUser());
        }
        catch (Exception ex)
        {
            Logger.getLogger(frmAddExpense.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try
        {
            UpdateInformations(Config.getUser());
        }
        catch (Exception ex)
        {
            Logger.getLogger(frmAddExpense.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
    }//GEN-LAST:event_formWindowActivated
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException
    {        
        try
        {
            javax.swing.UIManager.setLookAndFeel(new SyntheticaBlueIceLookAndFeel());
        }   
        catch (Exception e)            
        {
            e.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(() -> {
            new frmAddExpense().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbExpenseType;
    private javax.swing.JLabel lblDescriptionExpenseCost;
    private javax.swing.JLabel lblDescriptionExpenseLocality;
    private javax.swing.JLabel lblDescriptionExpenseType;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JTextField txtExpenseCost;
    private javax.swing.JTextField txtExpenseLocality;
    // End of variables declaration//GEN-END:variables
}
