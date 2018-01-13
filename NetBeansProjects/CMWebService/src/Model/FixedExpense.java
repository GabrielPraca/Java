/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.Date;

/**
 *
 * @author Gabriel
 */
public class FixedExpense
{
    private int fixedExpenseID;
    private int expenseTypeID;
    private String userID;
    private String locality;
    private float cost;
    private Date endDate;
    private boolean isEnabled;

    public int getFixedExpenseID()
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

    public Date getEndDate()
    {
        return endDate;
    }

    public void setEndDate(Date endDate)
    {
        this.endDate = endDate;
    }

    public boolean isIsEnabled()
    {
        return isEnabled;
    }

    public void setIsEnabled(boolean isEnabled)
    {
        this.isEnabled = isEnabled;
    }
}
