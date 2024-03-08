import java.util.*;
class StringlatterPrint
{
 public static void main(String arg[])
 {
  StringBuilder sb = new StringBuilder("");
  for(char ch = 'a';ch<='z';ch++)
  {
   sb.append(ch);
  }
  System.out.println(" " +sb);
}
}
