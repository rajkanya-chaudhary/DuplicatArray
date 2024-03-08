import java.io.*;
class ArroutStream
{
 public static void main (String args[])throws Exception
 {
 FileOutputStream fout1 = new FileOutputStream("abc1.txt");
 FileOutputStream fout2 = new FileOutputStream("abc2.txt");
 ByteArrayOutputStream bout= new ByteArrayOutputStream();
  bout.write(100);
  bout.writeTo(fout1);
  bout.writeTo(fout2);
  bout.flush();
 System.out.println(" hello dimpal don't warry you are Success ");
}
}


