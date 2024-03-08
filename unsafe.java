class Reserve implements Runnable
{
 // avilable birth is 1
 int avilable = 1;
 int wanted;
 Reserve(int i)
 {
  wanted = i;
  }
public void run()
{
 synchronized(this)
 {
 System.out.println("Avilable birth = " +avilable);
 if(avilable>=wanted)
 {
  String name = Thread.currentThread().getName();
  System.out.println(wanted+"birth reserved for " + name);
  try
  {
  Thread.sleep(1000);// wait for print for ticket
  avilable = avilable-wanted;
 }
catch(InterruptedException e)
 {
 System.out.println(e);
 }
}
else
System.out.println("Sorry,so birth avilable");
}
}
//close in say
}
class unsafe
{
public static void main(String arg[])
{
 Reserve obj = new Reserve(1);
 // attach first thread to object
Thread t1 = new Thread(obj);
// attach Second Thread to object
Thread t2= new Thread(obj);
// take the thread name as person name
t1.setName("Dimpal");
t2.setName("Kumkum");
// send request for birth
t1.start();
t2.start();
}
}


