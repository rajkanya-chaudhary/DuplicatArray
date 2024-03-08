import java.util.*;
class reverse8
{
 public static void reverseNumber(int arr[])
 {
   int first = 0,last = arr.length-1;
   while(first<last)
   {
     int temp = arr[last];
     arr[last] = arr[first];
     arr[first] = temp ;
     first++;
     last--;
   }
}
 public static void main(String arg[])
 { 
  int arr[]={2,4,6,8,8,19};
  reverseNumber(arr);
 for(int i = 0;i<arr.length;i++)
 {
  System.out.print(arr[i] +" ");
}
}
}

  
   