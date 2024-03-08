class BufferMethod
{
 public static void main(String arg[])
 {
  StringBuffer sb = new StringBuffer("Hello");
 /* sb.append("java");*/
  sb.insert(1,"java");
  System.out.println(sb);
}
}