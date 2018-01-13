
package Model;

import com.sun.istack.internal.Nullable;

public class Expense
{
    private int expenseID;
    private java.lang.Integer fixedExpenseID;
    private int expenseTypeID;
    private String userID;
    private String locality;
    private float cost;

    public Expense(int expenseID, java.lang.Integer fixedExpenseID, int expenseTypeID,
                   String userID, String locality, float cost)
    {
        this.expenseID = expenseID;
        this.fixedExpenseID = fixedExpenseID;
        this.expenseTypeID = expenseTypeID;
        this.userID = userID;
        this.locality = locality;
        this.cost = cost;
    }

    public int getExpenseID() 
    {
        return expenseID;
    }

    public void setExpenseID(int expenseID) 
    {
        this.expenseID = expenseID;
    }

    public java.lang.Integer getFixedExpenseID() 
    {
        return fixedExpenseID;
    }

    public void setFixedExpenseID(int fixedExpenseID) 
    {
        this.fixedExpenseID = fixedExpenseID;
    }

    public int getExpenseTypeID() 
    {
        return expenseTypeID;
    }

    public void setExpenseTypeID(int expenseTypeID) 
    {
        this.expenseTypeID = expenseTypeID;
    }

    public String getUserID() 
    {
        return userID;
    }

    public void setUserID(String userID) 
    {
        this.userID = userID;
    }

    public String getLocality() 
    {
        return locality;
    }

    public void setLocality(String locality) 
    {
        this.locality = locality;
    }

    public float getCost() 
    {
        return cost;
    }

    public void setCost(float cost) 
    {
        this.cost = cost;
    }
}
