import java.util.*;
public class PalindromeNumber 
{
   public static void main(String[] args) 
  {
    // TODO Auto-generated method stub
   System.out.println("enter your any number");
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int sum = 0 ,c,r;
	   c = n;
     while(n>0)
     {
	 r = n % 10;
	 sum = (sum * 10)+r;
	   n = n/10;
    }
    if(c==sum)
    {
    System.out.println("Palindrome number");
   }
   else
   {
   System.out.println("not Palindrome number");
   }
	    
}

}
