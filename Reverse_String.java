class Reverse_String
{
 public static void main(String arg[])
 {
  String str = "dimpal";
  String rev = " ";
  for(int i = str.length()-1;i>=0;i--)
  {
   rev = rev + str.charAt(i);
  }
  System.out.println(rev);
}
}