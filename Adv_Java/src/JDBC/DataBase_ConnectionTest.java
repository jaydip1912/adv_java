package JDBC;

import java.sql.*;

public class DataBase_ConnectionTest
{
    public static void main(String[] args)
    {
        Connection con=null;
        String Driver ="com.mysql.cj.jdbc.Driver";
        String Url ="jdbc:mysql://localhost:3306/jp";
        String User="root";
        String Pass="";
        
        try
        {
            Class.forName(Driver);
            con=DriverManager.getConnection(Url, User, Pass);
            
            if(con!=null)
            {
                System.out.println("Connection is Success...");
            }
            else
            {
                System.out.println("Connection is Failed...");
            }
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
