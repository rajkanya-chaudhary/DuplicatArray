import java.util.*;
class DuplicatArray
{
 public static void main(String arg[])
 {
   int arr[] = {1,2,3,4,5,3,4};
   for(int i = 0;i<arr.length-1;i++)
   {
    for(int j = i+1;j<arr.length;j++)
    {
     if(arr[i]==arr[j] && (i!=j))
     {
      System.out.println("Duplicate array = " + arr[j]);
    }
  }
}
}
}
     