class Test_demo
{
 public static void main(String arg[])
 {
  StringBuffer br = new StringBuffer("Hello");
  br.append("java");
  String s = "Hellojava";
  if(br==s)
  {
  System.out.println("ref match");
  }
  else
  {
  System.out.println(br);
}
}
}