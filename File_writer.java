import.java.io.*;
class File_Writer
{
 public static void main (String args[])
 {
  try
  {
  FileReader fr = new FileReader("abcd.txt");
  int i;
   while((i=fr.read())!=-1)
  {
   System.out.println((char)i);
   }
}
  catch(Exception e)
  {
  System.out.println(e);
  }
}
}
