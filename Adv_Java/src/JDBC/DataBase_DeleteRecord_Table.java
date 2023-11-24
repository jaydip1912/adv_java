
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBase_DeleteRecord_Table
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
            
            String query="delete from tb Where id in(7)";
            int result=st.executeUpdate(query);
            if(result!=0)
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
            
            ResultSet rs =st.executeQuery("select * from tb");
            
            while(rs.next())
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
            
            con.close();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

