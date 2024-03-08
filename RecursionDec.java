class RecursionDec
{
// print decersing number 
 public static void printDec(int n)
 {
  if(n==1)
  {
  System.out.println(n);
  return ;
  }
   System.out.print(n +" ");
   printDec(n-1);          
  }
 // print inceasing  order 
public static void printInc(int n)
{
 if(n==1)
 {
  System.out.print(n +" ");
 return;
}
 printInc(n-1);
 System.out.print(n +" ");
}
public static int fact(int n)
{
 if(n == 0)
 {
return 1;
}
 int fnm1 = fact(n-1);
 int fn = n * fact(n-1);
 return fn;
}
// print the sum natural number
public static int Calsum(int n)
{
  if(n == 1)
 {
 return 1;
}
int snm1 = Calsum(n - 1);
int sn = n + snm1;
return sn;
}
public static int fib(int n)
{
 if(n == 0 || n == 1)
{
  return n;
}
 int fnm1 = fib(n-1);
 int fnm2 = fib(n-2);
 int fn = fnm1 + fnm2;
 return fn;
}
 public static void main(String arg[])
 {
  int n = 25;
  System.out.println(fib(n));
 }
}
  