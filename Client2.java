import java.io.*;
import java.net.*;
class Client2
{
 public static void main(String arg[])throws Exception
 {
   Socket s = new Socket("localhost",8888);
// to send data to server
 DataOutputStream dos= new DataOutStream(s.getOutputStream());
 // to read data coming from server
 BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

// to read data from keybord
BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
 String str,str1;
 while(str=kb.readLine().equals("exit"))
{
 dos.writeBytes(str+"\n");
 str1=br.readLine();
 System.out.println(str1);
}
dos.close();
br.close();
kb.close();
s.close();
}
}

