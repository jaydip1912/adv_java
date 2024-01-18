package JDBC;

import java.sql.*;
public class DataBase_InsertValue_Table
{
    public static void main(String[] args)
    {
        Connection con =null;
        Statement st =null;
        String Driver ="com.mysql.cj.jdbc.Driver";
        String Url ="jdbc:mysql://localhost:3306/jp";
        String User ="root";
        String Pass ="";
        
        try
        {
            Class.forName(Driver);
            con=DriverManager.getConnection(Url, User, Pass);
            st=con.createStatement();
            
            String query ="insert into tb values(4,'jppp')";
            int Result=st.executeUpdate(query);
            
            
            if(Result!=0)
            {
                System.out.println("Value is inserted");
            }
            else
            {
                System.out.println("NOT");
            }
             con.close();  
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
}
