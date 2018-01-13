package pkgFrames;

import DAOFactory.DAOFactory;
import SeverUtils.Config;
import de.javasoft.plaf.synthetica.SyntheticaBlueIceLookAndFeel;

import SeverUtils.WSConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class frmMain extends javax.swing.JFrame
{
    public static WSConnection wsCon = new WSConnection();
    private static List<Model.Expense> expens = new ArrayList<Model.Expense>();
    
    public frmMain()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        btnEditUser = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnInfo = new javax.swing.JButton();
        pnlStatus = new javax.swing.JPanel();
        lblBalance = new javax.swing.JLabel();
        lblDescriptionBalance = new javax.swing.JLabel();
        btnAddExpense = new javax.swing.JButton();
        btnAddBalance = new javax.swing.JButton();
        btnDeleteExpense = new javax.swing.JButton();
        grdExpenseLog = new javax.swing.JScrollPane();
        tblExpenseLog = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblDescriptionUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cash Manager");
        setBackground(new java.awt.Color(255, 255, 255));
        setExtendedState(6);
        setName("frmMain"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlBackground.setBackground(new java.awt.Color(255, 255, 255));
        pnlBackground.setBorder(new javax.swing.border.MatteBorder(null));
        pnlBackground.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        pnlMenu.setBackground(new java.awt.Color(0, 102, 102));
        pnlMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlMenu.setForeground(new java.awt.Color(255, 255, 255));

        lblLogo.setBackground(new java.awt.Color(255, 255, 255));
        lblLogo.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(255, 255, 255));
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setText("Cash Manager");

        btnEditUser.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        btnEditUser.setForeground(new java.awt.Color(255, 255, 255));
        btnEditUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User.png"))); // NOI18N
        btnEditUser.setText("Editar Usuário");
        btnEditUser.setBorderPainted(false);
        btnEditUser.setContentAreaFilled(false);
        btnEditUser.setFocusPainted(false);
        btnEditUser.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnEditUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditUserActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dark Void Solutions© 2017");

        btnInfo.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        btnInfo.setForeground(new java.awt.Color(255, 255, 255));
        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Info.png"))); // NOI18N
        btnInfo.setText("Informações");
        btnInfo.setBorderPainted(false);
        btnInfo.setContentAreaFilled(false);
        btnInfo.setFocusPainted(false);
        btnInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEditUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo)
                .addGap(18, 18, 18)
                .addComponent(btnEditUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 478, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        pnlStatus.setBackground(new java.awt.Color(255, 255, 255));
        pnlStatus.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlStatus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        lblBalance.setBackground(new java.awt.Color(255, 255, 255));
        lblBalance.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lblBalance.setForeground(new java.awt.Color(0, 204, 0));
        lblBalance.setText("R$ ");

        lblDescriptionBalance.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        lblDescriptionBalance.setText("Saldo");

        btnAddExpense.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        btnAddExpense.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Stop.png"))); // NOI18N
        btnAddExpense.setText("Adicionar Gasto");
        btnAddExpense.setBorder(null);
        btnAddExpense.setContentAreaFilled(false);
        btnAddExpense.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAddExpense.setFocusPainted(false);
        btnAddExpense.setHideActionText(true);
        btnAddExpense.setMaximumSize(new java.awt.Dimension(14, 14));
        btnAddExpense.setMinimumSize(new java.awt.Dimension(14, 14));
        btnAddExpense.setPreferredSize(new java.awt.Dimension(1, 15));
        btnAddExpense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddExpenseActionPerformed(evt);
            }
        });

        btnAddBalance.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        btnAddBalance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Add.png"))); // NOI18N
        btnAddBalance.setBorder(null);
        btnAddBalance.setContentAreaFilled(false);
        btnAddBalance.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAddBalance.setFocusPainted(false);
        btnAddBalance.setMaximumSize(new java.awt.Dimension(14, 14));
        btnAddBalance.setMinimumSize(new java.awt.Dimension(14, 14));
        btnAddBalance.setPreferredSize(new java.awt.Dimension(1, 15));
        btnAddBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBalanceActionPerformed(evt);
            }
        });

        btnDeleteExpense.setText("Deletar Gasto");
        btnDeleteExpense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteExpenseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlStatusLayout = new javax.swing.GroupLayout(pnlStatus);
        pnlStatus.setLayout(pnlStatusLayout);
        pnlStatusLayout.setHorizontalGroup(
            pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescriptionBalance)
                    .addGroup(pnlStatusLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlStatusLayout.createSequentialGroup()
                                .addComponent(btnAddBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblBalance))
                            .addGroup(pnlStatusLayout.createSequentialGroup()
                                .addComponent(btnAddExpense, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDeleteExpense)))))
                .addContainerGap())
        );
        pnlStatusLayout.setVerticalGroup(
            pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDescriptionBalance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBalance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddExpense, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteExpense))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblBalance.getAccessibleContext().setAccessibleName("");

        grdExpenseLog.setBackground(new java.awt.Color(255, 255, 255));
        grdExpenseLog.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblExpenseLog.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        tblExpenseLog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblExpenseLog.setRowHeight(20);
        tblExpenseLog.setSelectionBackground(new java.awt.Color(0, 153, 153));
        grdExpenseLog.setViewportView(tblExpenseLog);

        lblDescriptionUser.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        lblDescriptionUser.setText("Usuário: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblDescriptionUser)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDescriptionUser)
        );

        lblDescriptionUser.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(grdExpenseLog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1007, Short.MAX_VALUE))
                        .addContainerGap())
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(grdExpenseLog)
                .addContainerGap())
            .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1248, 716));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try
        {        
            UpdateInformations(Config.getUser());
        }
        catch (Exception ex)
        {
            Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_formWindowOpened

    private void btnEditUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditUserActionPerformed
        try
        {  
            frmUpdateUser frmupdateuser = new frmUpdateUser();
            frmupdateuser.show();
        }
        catch (Exception ex)
        {
            Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
        }                 
    }//GEN-LAST:event_btnEditUserActionPerformed

    private void btnAddBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBalanceActionPerformed
        frmAddFunds frmaddfunds = new frmAddFunds();
        frmaddfunds.show();
    }//GEN-LAST:event_btnAddBalanceActionPerformed

    private void btnAddExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddExpenseActionPerformed
        frmAddExpense frmaddexpense = new frmAddExpense();
        frmaddexpense.show();
    }//GEN-LAST:event_btnAddExpenseActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        JOptionPane.showMessageDialog(this,"Projeto desenvolvido por: Gabriel Praça \n IDE: NetBeans",
                                      ".:: Informações ::.",
                                      JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnDeleteExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteExpenseActionPerformed
        if(tblExpenseLog.getSelectedRow() >= 0)
        {           
            try
            {
                int index = (int)tblExpenseLog.getModel().getValueAt(tblExpenseLog.getSelectedRow(), 0);
                float resCost = (float)tblExpenseLog.getModel().getValueAt(tblExpenseLog.getSelectedRow(), 4);                
               
                DAOFactory.getUserDAO().IncrementBalance(resCost, Config.getUser().getUserID(), wsCon.GetConnection());
            
                Config.setUser(DAOFactory.getUserDAO().getUser(Config.getUser().getUserID(), wsCon.GetConnection()));
                UpdateBalance();               
                
                Model.Expense delExp = expens.get(index);
                DAOFactory.getExpenseDAO().removeExpenseByID(index, wsCon.GetConnection());
                
                UpdateInformations(Config.getUser());
            } 
            catch (Exception ex) 
            {
                Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnDeleteExpenseActionPerformed
    
    public static void UpdateInformations(Model.User user) throws Exception
    {
        if(!user.getUserName().equals("") && !user.getUserName().equals(null))
            lblDescriptionUser.setText("Usuário: " + user.getUserName());
        else
            lblDescriptionUser.setText("Usuário: " + user.getUserID());
            
        expens = DAOFactory.getExpenseDAO().getExpenseByUserID(Config.getUser().getUserID(),
                                     wsCon.GetConnection());
        String[] nameColumns = {"ID","Tipo da Despesa", "Usuário", "Local", "Custo"};
        DefaultTableModel TableModel = new DefaultTableModel(nameColumns, expens.size());
            
        List<Model.ExpenseType> expenType = new ArrayList<>();
            
        expens.stream().forEach((expen) -> {                
            try
            {
                Model.ExpenseType expType = DAOFactory.getExpenseTypeDAO().getExpenseTypeByID(expen.getExpenseID(),
                                            wsCon.GetConnection());
                if(expType.getExpenseTypeName() != null)
                    expenType.add(expType);
            } 
            catch (Exception ex)
            {
                Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        while (TableModel.getRowCount() > 0)
        {
            TableModel.removeRow(0);
        }            
                
        expens.stream().forEach((exp) -> {
            try
            {                    
                TableModel.addRow(new Object[] {
                exp.getExpenseID(),
                DAOFactory.getExpenseTypeDAO().getExpenseTypeByID(exp.getExpenseTypeID(), wsCon.GetConnection()).getExpenseTypeName(),
                exp.getUserID(),
                exp.getLocality(),
                exp.getCost()
                });
            }
            catch (Exception ex)
            {
                Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        Config.setUser(DAOFactory.getUserDAO().getUser(Config.getUser().getUserID(), wsCon.GetConnection()));
        
        UpdateBalance();
        tblExpenseLog.setModel(TableModel);
    }
    
    public static void UpdateBalance()
    {
        lblBalance.setText("R$: " + Config.getUser().getBalance());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try
        {
            //wsCon.SetConnection();
                  
            javax.swing.UIManager.setLookAndFeel(new SyntheticaBlueIceLookAndFeel());
        }   
        catch (Exception e)
            
        {
            e.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBalance;
    private javax.swing.JButton btnAddExpense;
    private javax.swing.JButton btnDeleteExpense;
    private javax.swing.JButton btnEditUser;
    private javax.swing.JButton btnInfo;
    private javax.swing.JScrollPane grdExpenseLog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblDescriptionBalance;
    private static javax.swing.JLabel lblDescriptionUser;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlStatus;
    private static javax.swing.JTable tblExpenseLog;
    // End of variables declaration//GEN-END:variables
}
