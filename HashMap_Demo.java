import java.util.*;
class HashMap_Demo
{
 public static void main(String arg[])
  {
   HashMap<Integer,String> map = new HashMap<Integer,String>();
   map.put(1,"dimpal");
   map.put(2,"kumkum");
   map.put(3,"neha");
   map.put(4,"jhunjhun");
   map.put(5,"Sachin");
 for(Map.Entry m:map.entrySet())
 {
  System.out.println(m.getKey()+" "+m.getValue());
}
}
}
