class Leapyear
{
 public static void main(String arg[])
 {
  int year = 2014;
  if((year%400==0)||(year%4==0 && year%100!=0))
  {
  System.out.println("Leap year");
  }
  else
  {
   System.out.println("not Leap year");
  }
}
}
  