class minAndmax
{
 public static void main(String args[])
  {
   int array[]={2,4,5,6,29,15};
    int max= array[0];
    int min= array[0];
   for(int i = 0;i<array.length;i++)
   {
   if(max < array[i])
   {
     max = array[i];
    }
   if(min > array[i])
   {
    min = array[i];
   }
}
System.out.println("largest number of array = " +max);
System.out.println("largest number of array = " +min);
}
}
