class FactorialNumberPrint
{
 public static void main(String arg[])
  {
    System.out.println("Factorial number print");
    int n = 5;
    int fac = 1;
    for(int i = 1;i<=n;i++)
    {
     fac = fac * i;
    }
    System.out.println(fac);
}
}
   