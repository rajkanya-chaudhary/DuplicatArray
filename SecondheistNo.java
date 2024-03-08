class SecondheistNo
{
public static void main(String arg[])
{
  int arr[]={22,67,57,66,50};
  int temp = 0;
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
System.out.println("Second height number in array = " + arr[1]);
}
}
  
  