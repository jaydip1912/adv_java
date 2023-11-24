package JDBC;

import java.sql.*;
public class DataBase_FetchResul_Table
{
    public static void main(String[] args)
    {
        Connection con = null;
        Statement st = null;
        String Driver ="com.mysql.cj.jdbc.Driver";
        String Url ="jdbc:mysql://localhost:3306/jp";
        String User ="root";
        String Pass ="";
        
        try
        {
            Class.forName(Driver);
            con=DriverManager.getConnection(Url, User, Pass);
            
            st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT * from tb");
            
            
            while(rs.next())
            {
                System.out.println(rs.getString(1)+" "+rs.getString(2));
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
}
