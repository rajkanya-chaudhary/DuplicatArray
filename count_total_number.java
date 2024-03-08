import java.util.Scanner;
import java.util.*;
class count_total_number
{
 public static void main(String arg[])
 {
  String str = new String();
  System.out.println("enter any String check for count word ");
  Scanner sc = new Scanner(System.in);
  str = sc.nextLine();
  int i, count = 1;
  for(i = 0;i<str.length()-1;i++)
  {
    char c , d;
   c = str.charAt(i);
   d = str.charAt(i+1);
  if(c == ' ' && d != ' ')
  {
   count++;
  }
 }
 System.out.println("total count of String = " +count);
 }
}
  
  
  