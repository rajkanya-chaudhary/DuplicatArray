class smallest
{
public static void main(String args[])
{
  int arr[]={3,5,7,8,1,9};
  int min = arr[0];
  for(int i=0;i<arr.length;i++)
  {
   if(min > arr[i])
   {
    min = arr[i];
    }
  }
  System.out.println("smallest number of array = "+ min);
}
}

   