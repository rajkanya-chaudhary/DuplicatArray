import java.io.*;
import java.net.*;
class Server2
{
 public static void main(String arg[])
 {
  // create server socket
  ServerSocket ss = new ServerSocket(8888);
// connect it to client socket
Socket s= ss.accept();
System.out.println("connection established");
// to send data to the client 
PrintStream ps = new PrintStream(s.getOutputStream());
 BufferedReader br = new BufferedReader(new InputStreamReader(s.getOutputStream()));
// to read data comming from the client
BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStreamReader(System.in)));
while(true)
{
String str,str1;
while((str=br.readLine())!=null)
{
System.out.println(str);
str1 = kb.readLine();
ps.println(str1);
}
ps.close();
br.close();
kb.close();
ss.close();
s.close();
System.exit(0);
}
}
}





