class Singleton
{
 private static Singleton single_instance = null; 
 public String s;
 private Singleton()
 {
   s = "Hello I Am string part of Singleton class ";
 }
  public static Singleton Singleton()
  {
    if(single_instance == null)
    {
     single_instance = new singleton();
    }
   return single_instance;
}
}
class GFG{
     public static void main(String arg[])
     {
      SingleTon x = Singleton.Singleton();
      SingleTon y = Singleton.Singleton();
      SingleTon z = Singleton.Singleton();
      x.s = (x.s).toupperCase();
    System.out.println("String from x is " + x.s);
    System.out.println("String from x is " + y.s);
    System.out.println("String from x is " + z.s);
    System.out.println("\n");
     z.s = (z.s).toLowerCase();
    System.out.println("String from x is " + x.s);
    System.out.println("String from x is " + y.s);
    System.out.println("String from x is " + z.s);
}
}

      




