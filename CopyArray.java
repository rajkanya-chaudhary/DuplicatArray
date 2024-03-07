import java.util.*;
class CopyArray
{
 public static void main(String arg[])
 {
/*
  int a[]= new int[5];
  int b[]= new int[5];
 Scanner sc = new Scanner(System.in);
 for(int i = 0;i<5;i++)
 {
  a[i]=sc.nextInt();
 }
 System.out.println("First array Element ");
 for(int i = 0;i<5;i++)
 {
 System.out.print(a[i]+" ");
 }
 System.out.println("\n Second array Element ");
 for(int i = 0;i<5;i++)
 {
  b[i]=a[i];
 System.out.print(b[i] + " ");
}
*/


 int a[] = {10,20,30,40,50};
 int b[] = new int[5];
 System.out.println("first element ");
 for(int i = 0;i<a.length;i++)
 {
  System.out.print(a[i] + " ");
 }
 
System.out.println("\n copy element ");
 for(int i = 0;i<a.length;i++)
 {
  b[i] = a[i];
 System.out.print(b[i]+" ");
 }
 
}
}

  