class largest7
{
 public static void main(String arg[])
 {
   int arr[] = {3,6,8,5,1,10};
  /* int largest = arr[0];
   for(int i = 1;i<arr.length;i++)
   {
    if(arr[i]>largest)
    {
     largest = arr[i];
    }
   }
   System.out.println(largest);
 */
  // second largest number
  int arr[] = {3,6,8,5,1,10};
   int temp = 0;
   int i ,j;
  for(i = 0;i<arr.length;i++)
  {
    for(j = i+1;j<arr.length;j++)
    {
     if(arr[i] < arr[j])
     {
      temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
   }
   }
  }
  System.out.println("Second largest number " +arr[i]);
 }
}
