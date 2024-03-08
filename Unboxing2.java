class Unboxing2 
{
 public static void main(String arg[])
 {
   //Integer a=new Integer(3); 
   Integet a = 6;   
   int i=a.intValue();//converting Integer to int explicitly  
   int j=a;//unboxing, now compiler will write a.intValue() internally    
    
   System.out.println(a+" "+i+" "+j);    
}
}   