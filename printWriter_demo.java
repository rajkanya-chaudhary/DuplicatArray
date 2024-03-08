import java.io.*;
class printWriter_demo
{
 public static void main(String args[])
  {
   String data = "This is a text inside the file";
    try
    {
     PrintWriter pw = new PrintWriter("abc.txt");
     pw.print(data);
     pw.close();
    }
     catch(Exception e)
     {
     System.out.println(e);
     }
    }
    } 