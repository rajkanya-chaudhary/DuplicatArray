class Test 
{
public static void main(String arg[])
{
 String str = new String("Hello");
 String str1 = "Hello";
 String str2 = str.intern();
 if(str1 == str2)
 {
  System.out.println("ref match");
 }
else
{
 System.out.println("ref not match");
}
}
}
