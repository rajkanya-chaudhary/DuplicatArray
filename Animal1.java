class Animal1
 {
  void eat()
  {
   System.out.println("i am eating");
  }
}
 class Dog extends Animal1
 {
 
   public static void main(String arg[])
   {
     Dog d = new Dog();
      d.eat();
    }
 }
    