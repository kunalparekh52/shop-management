import java.sql.*;
import java.sql.DriverManager.*;


public class odbc 

{

    Connection con;

    public odbc() 
    {        try
    {
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
     con = DriverManager.getConnection("Database2");
    }
    catch (Exception ex)
    {}
    }
    public void queryExecuter (String sql) throws Exception
{
    
    Statement stat = con.createStatement();
    stat.execute(sql);
    stat.close();
    con.close();
    
    
}
    
}
