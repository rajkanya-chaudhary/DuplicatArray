import java.util.*;
class StringPalindrome
{
 public static void main(String arg[])
 {
  String str = "madam";
  int i = 0;
  int j = str.length()-1;
  int flag = 0;
  while(i<j && flag == 0)
  {
   if(str.charAt(i) != str.charAt(j))
    {
      flag = 1;
       break;
   }
   i++;
   j--;
  }
   if(flag==0)
    System.out.println("Palindrome");
  else
   System.out.println("not palindrome ");
 }
}
