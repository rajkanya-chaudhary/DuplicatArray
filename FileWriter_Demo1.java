import java.io.*;
class FileWriter_Demo1
{
 public static void main(String arg[]) throws IOException
 {
   FileWriter fw = new FileWriter("abc.txt");
   fw.write("Welcome to java");
   fw.close();
 }
}
   