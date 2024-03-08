import java.util.*;
class Swapping
{
 public static void main(String arg[])
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter two number for swapping");
   int a = sc.nextInt();
   int b = sc.nextInt();
   System.out.println("Before Swapping number " + a + " " +b);
   a = a+b;
   b = a-b;
   a = a-b;
   System.out.println("After Swapping number " + a + " " +b);
 }
}

