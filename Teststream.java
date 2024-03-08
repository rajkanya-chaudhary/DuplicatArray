import java.io.*;
class Teststream
{
public static void main(String arg[])
{
  try
  {
   FileOutputStream fout = new FileOutputStream("abc.txt");
   String s = "I love my india";
   byte b[] = s.getBytes();
   fout.write(b);
   System.out.println("success");
   }
  catch(Exception e)
   {
   System.out.println(e);
  }
}
}