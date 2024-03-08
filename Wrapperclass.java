class Wrapperclass
{
 public static void main(String arg[])
 {
 // primitive type value is convert wrapper class Autoboxingwrapper class 
/*
   int a = 10;
  Integer b = a;
  System.out.println(a);
  System.out.println(b);
*/
// conver an object at a wrapper type into primitive 
 /*Integer a = new Integer(10);
 int  b = a;
 System.out.println(a);
 System.out.println(b);*/
Integer a=new Integer(3);    
int i=a.intValue();//converting Integer to int explicitly  
int j=a;//unboxing, now compiler will write a.intValue() internally    
    
//System.out.println(a+" "+i+" "+j);  
System.out.println(a);
System.out.println(j); 
System.out.println(i);  



}
}