package PreparredStatement;

import java.sql.*;
public class UpdateRecord_Table
{
    public static void main(String[] args)
    {
        Connection con =null;
        PreparedStatement ps =null;
        ResultSet rs=null;
        Statement st =null;
        String Driver="com.mysql.cj.jdbc.Driver";
        String Url="jdbc:mysql://localhost:3306/jp";
        String User="root";
        String Pass="";
        
        try
        {
            Class.forName(Driver);
            con=DriverManager.getConnection(Url, User, Pass);
            
            String qre="UPDATE tb set name=? where id=?";
            ps=con.prepareStatement(qre);
            ps.setInt(2, 2);
            ps.setString(1,"jm");
            
            int result=ps.executeUpdate();
            if(result!=0)
            {
                System.out.println("Yes-Update");
            }
            else
            {
                System.out.println("No");
            }
            
            String query ="select* from tb";
            ps=con.prepareStatement(query);
//            ps.setInt(1,1);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }
            
            ps.close();
            rs.close();
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
