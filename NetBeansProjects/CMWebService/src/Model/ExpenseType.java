/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class ExpenseType
{
    int expenseTypeID;
    String expenseTypeName;
    
    public ExpenseType()
    {
        this.expenseTypeID = 0;
        this.expenseTypeName = null;
    }
    public ExpenseType(int expenseTypeID, String expenseTypeName)
    {
        this.expenseTypeID = expenseTypeID;
        this.expenseTypeName = expenseTypeName;
    }

    public int getExpenseTypeID() 
    {
        return expenseTypeID;
    }

    public void setExpenseTypeID(int expenseTypeID) 
    {
        this.expenseTypeID = expenseTypeID;
    }

    public String getExpenseTypeName() 
    {
        return expenseTypeName;
    }

    public void setExpenseTypeName(String expenseTypeName) 
    {
        this.expenseTypeName = expenseTypeName;
    }
}
