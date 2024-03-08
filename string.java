import java.util.*;
public class string
{
 public static void printLatter(String str)
{
  for(int i = 0;i<str.length();i++)
  {
   System.out.print(str.charAt(i)+" ");
  }
  System.out.println();
}
 public static void main(String arg[])
 {
/*
  String str = "dimpal chaudhary";
  System.out.println(str);
  Scanner sc = new Scanner(System.in);
  String name = sc.nextLine();
  System.out.println(name);
*/
  // concattation
  String firstname = "I Love coding ";
  String lastname = " in java ";
  String fullname = firstname+""+lastname;
 // System.out.println(fullname);
 // System.out.println(fullname.charAt(2));
   printLatter(fullname);
}
}