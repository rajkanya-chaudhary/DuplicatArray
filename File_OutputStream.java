import java.io.*;
class File_OutputStream
{
 public static void main(String arg[])
 {
  try
   {
    FileOutputStream fout = new FileOutputStream("dimpalchaudhry.txt");
    String s = "India is a good country";
    byte b[] = s.getBytes();
    fout.write(b);
    System.out.println("Success.........hello ");
   }
   catch(Exception e)
   {
   System.out.println(e);
  }
 }
}