import java.util.*;
import java.util.Scanner;
class ArrayPrint
{
 public static void main(String arg[])
  {
  int marks[]= new int[100];
  Scanner sc = new Scanner(System.in);
  marks[0] = sc.nextInt();
  marks[1] = sc.nextInt();
  marks[2] = sc.nextInt();
  System.out.println("physics marks = " +marks[0]);
  System.out.println("chemistry marks = " +marks[1]);
  System.out.println("Math marks = " +marks[2]);
}
}
   