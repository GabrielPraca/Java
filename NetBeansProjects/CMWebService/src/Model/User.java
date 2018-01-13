
package Model;

public class User
{
    String userID;
    String password;
    String userName;
    float salary;
    float balance;

    public User(String userID, String password, String userName, float salary, float balance)
    {
        this.userID = userID;
        this.password = password;
        this.userName = userName;
        this.salary = salary;
        this.balance = balance;
    }
    
    public String getUserID() 
    {
        return userID;
    }

    public void setUserID(String userID) 
    {
        this.userID = userID;
    }

    public String getPassword() 
    {
        return password;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getUserName() 
    {
        return userName;
    }

    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public float getSalary() 
    {
        return salary;
    }

    public void setSalary(float salary) 
    {
        this.salary = salary;
    }

    public float getBalance() 
    {
        return balance;
    }

    public void setBalance(float balance) 
    {
        this.balance = balance;
    }    
}
