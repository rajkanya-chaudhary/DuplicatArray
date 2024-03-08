import java.util.*;
class SecondHeightNumber
{
 public static void main(String arg[])
 {
  int arr[] = {2,4,6,8,9,2,7};
  int temp;
  for(int i = 0;i<arr.length;i++)
  {
   for(int j = i+1;j<arr.length;j++)
   {
    if(arr[i]<arr[j])
    {
     temp = arr[i];
     arr[i] = arr[j];
     arr[j] = temp;
    }
 }
  
}
     System.out.println("Second largest number = " + arr[1]);
}
} 