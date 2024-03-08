import java.util.*;
class Test_Queue
{
 public static void main(String arg[])
 {
  PriorityQueue<String> q = new PriorityQueue<String>();
  q.add("Amit");
  q.add("Vijay");
  q.add("Sachin");
  q.add("Ram");
  Sysyem.out.prinltn("Head: " + q.element());
  Sysyem.out.prinltn("Head: " + q.peek());
  Sysyem.out.prinltn("ietrting the queue element ");
  Iterator itr = q.iterator();
  while(itr.hashNext())
  { 
  Sysyem.out.prinltn(itr.next());
  }
  q.remove();
  q.poll();
  Sysyem.out.prinltn("After removing two element");
  Iterator itr1 = q.iterator();
  while(itr1.hasNext());
  {
  Sysyem.out.prinltn(itr1.next());
}
}
}




