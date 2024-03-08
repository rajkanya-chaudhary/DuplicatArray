class largest
{
 public static void main(String arg[])
  {
   int number[] = {4,6,8,2,1,9};
   int largest = number[0];
    for(int i =0 ;i<number.length;i++)
    {
     if(largest < number[i])
      {
       largest = number[i];
      }
    }
   System.out.println("largest number of an array = " +largest);
}
}
