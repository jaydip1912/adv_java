package JDBC;

import java.sql.*;
public class DataBase_UpdateRecord_Table
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
            
            String query="Update tb SET name='jaydip' Where id in(1)";
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
            System.out.println(rs.getInt(1)+""+rs.getString(2));
            
            con.close();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
