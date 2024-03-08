class Starprint
{
 public static void main(String arg[])
 {
/*
   int n = 4;
   int i,j;
   for(i = 1;i<=n;i++)
   {
     for(j = 1;j<=i;j++)
    {
    System.out.print("*" +"");
   }
   System.out.println();
}

int n = 5;
int i,j;
for(i = 1;i<=n;i++)
{
 for(j = 4 ; j>=i;j--)
 {
 System.out.print("*" +" ");
 }
System.out.println();
}
*/
int n = 5;
for(int i = 1;i<=n;i++)
{
 for(int j = i;j<=i;j++)
 {
  System.out.print("*" + " ");
 }
 System.out.println();
}
}
for(int i = 1;i<=n;i++)
{
 for(int j = n;j>=i;i--)
 {
 System.out.print("*" + " ");
 }
System.out.println();
}
}
}


