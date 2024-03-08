import java.util.*;
class Primenumber
{
 public static void main(String arg[])
 {
  int n1 = 10;
  int n2 = 30;
  int i,j;
 for(i = n1;i<=n2;i++)
 {
  for(j = 2;j<=i;j++)
  {
   if(i%j==0)
   break;
  }
  if(i==j)
  {
  System.out.print(j +" ");
  }
}
}
}