class ScdLargest
{
 public static void main(String arg[])
 {
   int arr[] = {3,6,8,5,1,10};
   int temp = 0;
   int i, j;
   for(i = 0; i < arr.length; i++) {
       for(j = i + 1; j < arr.length; j++) {
          if(arr[i] < arr[j]) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
System.out.println("Second largest number " + arr[i]);
}
}
