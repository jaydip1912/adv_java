package PreparredStatement;

import java.sql.*;
public class Insert_Select_Record_Table
{
    public static void main(String[] args)
    {
        Connection con =null;
        PreparedStatement ps =null;
        ResultSet rs =null;
        Statement st =null;
        String Driver="com.mysql.cj.jdbc.Driver";
        String Url="jdbc:mysql://localhost:3306/jp";
        String User="root";
        String Pass="";
        
        try
        {
            Class.forName(Driver);
            con=DriverManager.getConnection(Url, User, Pass);
            
            ps=con.prepareStatement("Insert into tb values(?,?)");
            ps.setInt(1, 9);
            ps.setString(2, "nine");
            int result=ps.executeUpdate();
            
            if(result!=0)
            {
                System.out.println("y");
            }
            else
            {
                System.out.println("n");
            }
            String query="select*from tb where id=?";
            ps=con.prepareStatement(query);
            ps.setInt(1, 9);
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
