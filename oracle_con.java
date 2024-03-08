import java.sql.*;
class oracle_con
{
 public static void main(String arg[])
{
 try
 {
 // step 1 > to load the driver
 Class.forName("oracle.jdbc.driver.OracleDriver");
// step 2 > create the connection object
Connection con = DriverManager.getConnection
("jdbc:oracle:thin:@localhost:1521:xe","system","system");
  // step 3 > create the statement object
 Statement st = con.createStatement();
// step 4 > execute query
 ResultSet rs = st.executeQuery("select*from emp");
while(rs.next())
{
 System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
}
 // step 5 > close the connection object
 con.close();
}
catch(Exception e)
{
 System.out.println(e);
}
}
}

