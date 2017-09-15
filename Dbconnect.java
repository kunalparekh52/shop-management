import java.sql.*;

public class Dbconnect 


{
Connection conn;

    public Dbconnect() throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sony","root","system");
        
    }
public void queryExecuter (String sql) throws Exception
{
    
    Statement stat = conn.createStatement();
    stat.execute(sql);
    stat.close();
    conn.close();
    
    
}


}
