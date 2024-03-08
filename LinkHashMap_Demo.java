import java.util.*;
class LinkHashMap_Demo
{
 public static void main(String arg[])
  {
   LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer,String>();
   map.put(1,"dimpal");
   map.put(2,"kumkum");
   map.put(3,"neha");
   map.put(null,"jhunjhun");
   map.put(null,"Sachin");
 for(Map.Entry m:map.entrySet())
 {
  System.out.println(m.getKey()+" "+m.getValue());
}
}
}