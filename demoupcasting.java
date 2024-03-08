class Animal
{
 String name;
  void say()
  {
  System.out.println("Animal");
  }
}
class Fish extends Animal
{
  String color;
  void say()
  {
  System.out.println("I am Aquatic Animal");
 }
}
class demoupcasting
{
public static void main(String arg[])
 {
   Animal al = new Fish();
   Fish s1 = (Fish)al;
   s1.say();
   s1.say();
   
}
}