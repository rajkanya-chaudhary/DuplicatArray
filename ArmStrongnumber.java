import java.util.*;
class ArmStrongnumber
{
 public static void main(String arg[])
 { 
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter your any number for check Armstrong number ");
   int n = sc.nextInt();
   int arm = 0,rem,c;
   c=n;
   while(n>0)
   {
     rem = n % 10;
     arm = (rem * rem * rem )+arm;
     n = n/10;
   }
   if(c==arm)
   {
    System.out.println("ArmStrong number");
   }
   else
   {
   System.out.println("Not ArmStrong number");
   }
  }
}
   
   
    