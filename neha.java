import java.util.*;
import java.util.ArrayList;
class neha 
{
 public static void main(String arg[])
 {
  ArrayList al = new ArrayList();
  al.add("Ram");
  al.add("Sita");
  al.add("Rohan");
  al.add("Ramesh");
  al.add("Rohan");
  al.add("Roshan");
 System.out.println(al);
 Iterator itr = al.iterator();
 while(itr.hasNext())
{
 System.out.println(itr.next());
}
}
}