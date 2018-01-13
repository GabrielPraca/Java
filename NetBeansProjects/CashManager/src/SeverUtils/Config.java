
package SeverUtils;

public final class Config
{
    private static Model.User _user;
    private static boolean _connected;
    
    public static Model.User getUser() 
    {
        return _user;
    }
    public static void setUser(Model.User user) 
    {
        _user = user;
    }

    public static boolean getIsConnected() 
    {
        return _connected;
    }

    public static void setIsConnected(boolean connected) 
    {
        _connected = connected;
    }
}
