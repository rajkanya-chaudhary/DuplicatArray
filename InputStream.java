import java.io.*;
class InputStream
{
public static void main(String args[]) throws Exception
{
 byte by[]={35,36,37,38};
 ByteArrayInputStream b = new ByteArrayInputStream(by);
 int k = 0;
  while((k=b.read())!=-1)
  {
  char ch = (char)k;
  System.out.println("ASCII VALUE OF CHARACTER IS :+ k +;SPCIAL CHARACTER IS :"+ch);
 }
}
}
