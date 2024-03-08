class InternMethod
{
 public static void main(String arg[])
  {
  String s1 = "Hello";
  String s2 = s1.intern();
  String s3 = new String("Hello");
  String s4 = s3.intern();
  System.out.println(s1==s2);
  System.out.println(s1==s3);
  System.out.println(s1==s4);
}
}