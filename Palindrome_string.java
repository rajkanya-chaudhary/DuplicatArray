import java.util.*;
class Palindrome_string
{
 public static void main(String arg[])
 {
  String str = "madam";
  int i = 0;
  int j = str.length()-1;
  int flag = 0;
  while(str.charAt(i) != str.charAt(j))
  {
    flag = 1;
    break;
  }
   i++;
   j--;
  if(flag == 0)
  {
  System.out.println("palindrome String ");
  }
  else
  {
   System.out.println("not palindrome String");
  }
}
}

