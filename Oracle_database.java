import java.sql.*;
class Oracle_database
{
 public static void main(String arg[])
 {
  try
  {
   // load the driver
  Class.forName("oralce.jdbc.driver.OracleDriver");
  // create connection object
  Connection con = DriverManager.getConnection
 ("jdbc:oracle:thin:@localhost:1521:xe","system","system");
// create statement object
  Statement st = con.createStatement();
// execute query
ResultSet rs = st.executeQuery("select*from emp");
while(rs.next())
{
 System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3));
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}

  
  