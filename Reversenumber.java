class ReverseNumber
{
 public static void main(String arg[])
 {
   int n = 998487;
   int rev = 0;
   while(n>0)
   {
    int lastdigit = n % 10;
    rev = (rev * 10) + lastdigit;
    n = n / 10;
   }
   System.out.println("Number of Reverse = " + rev);
  }
}

    
   
  