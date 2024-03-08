import java.sql.*;
class dbinsert
{
    public static void main(String[] args)throws Exception
    {
      Scanner in = new Scanner(System.in);
        System.out.println("Enter name you want to insert ");
        String name1 = in.nextLine();
        System.out.println("you enter name " +name1);
        System.out.println("Enter salary");
        int sal = in.nextInt();
        System.out.println("you enterd salary " +sal);
        try {
            Class.forName("oracle.jdbc.driver.Oracle.Driver");
            Connection c = DriverManager.getConnection("jdbc.oracle:thin:@localhost:1521:xe","system","system");
            Statement s = c.createStatement();
            int x = s.executeUpdate("create table emp3 (name varchar2(20) , salary ");
            x = s.executeUpdate("insert into emp3 values ( " +name1+ " , " +sal+ " , ");
            ResultSet rs = s.executeQuery("select * from emp3 ");
            while (rs.next())
            {
                System.out.println("name = " +rs.getString(1)+" salary = " +rs.getString(2));
            }
        }
        catch (Exception e )
        {
            System.out.println(e);
        }

    }
}
