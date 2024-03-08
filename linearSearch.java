class Linearsearch
{
 public static void main(String arg[])
 {
   int arr[]={5,6,3,2,1,4};
   int key = 2;
   int temp = 0;
  for(int i = 0;i<arr.length;i++)
  {
   if(arr[i]==key)
   {
    System.out.println("key is present at  index Position " + i);
    temp = temp+1;
   }
  }
if(temp==0)
{
 System.out.println("key is not found in an array ");
}
}
}



  

   
   
 