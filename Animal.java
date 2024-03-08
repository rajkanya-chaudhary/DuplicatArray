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
  public static void main(String arg[])
  {
   Animal al = new Fish();
   al.say();
}
}