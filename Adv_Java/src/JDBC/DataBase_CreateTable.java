package JDBC;

import java.sql.*;
public class DataBase_CreateTable
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
            
            String query ="create table tb(id int ,name varchar(20))";
            st.execute(query);
            System.out.println("Table is created");          
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
