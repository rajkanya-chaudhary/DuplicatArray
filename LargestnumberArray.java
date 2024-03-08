class LargestnumberArray
{
 public static void main(String arg[])
 {
   int arr[]={88,34,7,18,9};
/*
   int largest = arr[0];
 for(int i = 1;i<arr.length;i++)
 {
  if(arr[i]>largest)
  {
   largest = arr[i];
  }
 }
System.out.println("largest number of array = " + largest);
*/
int min = arr[0];
for(int i = 1;i<arr.length;i++)
 {
  if(arr[i]<min)
  {
   min= arr[i];
  }
}
System.out.println("Min number of array = " + min );    
}
}
  
