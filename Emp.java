import java.io.*;
class Emp
{
 String name;
 int id,age;
 Emp(String,name,int id,int age)
 {
  this.name=name;
  this.id=id;
  this.age=age;
}
void disp()
{
System.out.println(name);
System.out.println(id);
System.out.println(age);
}
}
class Main
{
public static void main(String arg[])throws IOException
{
 BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Enter your name : ");
 String name= br.readLine();
 System.out.println("Enetr your age : ");
 int age = Integer.parseInt(br.readline());
 System.out.println("Enetr your id : ");
 int id = Integer.parseInt(br.readline());
 Emp e = Emp(name,id,age);
 e.dish();
}
}
}
}

