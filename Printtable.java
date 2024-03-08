import java.util.*;
class Printtable
{
 public static void main(String arg[])
 {
 
  Scanner sc = new Scanner(System.in);
  System.out.println("table print ");
  int n = sc.nextInt();
   for(int i = 1;i<=n*5;i++)
   {
   System.out.println( n + "*" + i + "=" + i *  n );
   }
}
}