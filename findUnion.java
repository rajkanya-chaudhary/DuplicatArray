import java.util.*;
class findUnion
{
 public static int union_Col(int arr1[],int arr2[],int m,int n)
 {
  int i = 0,j = 0;
  while(i<m && j < n)
  {
  if(arr1[i] < arr2[j])
  System.out.println(arr1[i++]+" ");
  else if(arr2[j]<arr1[i])
  System.out.print(arr2[j++]+" ");
  else
  {
   System.out.print(arr2[j++]+" ");
   i++;
  }
}
 // println remaining element of the layer array
  while(i<m)
  System.out.print(arr1[i++]+" ");
  while(i<n)
  System.out.print(arr2[j++]+" ");
  return 0;
}
 public static void main(String arg[])
 {
   int arr1[] = {1,2,3,4,5,6};
   int arr2[] = {2,3,5,7};
   int m = arr1.length;
   int n = arr2.length; 
   union_Col(arr1,arr2,m,n);
}
}







