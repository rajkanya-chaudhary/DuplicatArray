import java.util.*;
class Tprint
{
 public static void main(String arg[])
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter any number for  any table ");
   int n = sc.nextInt();
   int i;
   for(i = 1;i<=10;i++)
   {
    System.out.println( i + "*" + n + " = " + i*n);
   }
}
}
   
   