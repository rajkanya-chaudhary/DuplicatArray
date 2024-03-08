import java.util.*;
class Toatalword
{
 public static void main(String arg[])
 {
   String str = new String();
   Scanner sc = new Scanner(System.in);
   System.out.println("enter any String");
   str = sc.nextLine();
   int i ,count = 1;
  for(i =0;i<str.length();i++)
  {
   if(str.charAt(i) == ' ' && str.charAt(i+1) != ' ')
   {
    count++;
   }
   }
   System.out.println("Total word = s " + count);
}
}
   
   