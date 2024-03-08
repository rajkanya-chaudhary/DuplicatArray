import java.util.*;
class FiboncciNumber
{
 public static void main(String arg[])
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter your any number");
   int n = sc.nextInt();
   int a = 0,b=1,c;
   for(int i = 1;i<=n;i++)
   {
   System.out.printsn(a + " ");
   c = a + b;
   a = b;
   b = c;
  }
}
}
   
