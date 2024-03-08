import java.util.*;
class TwoMatrix
{
 public static void main(String agr[])
 {
  // creating two set 
  int a[][] = {{1,3,4},{2,4,3},{3,4,3}};
  int b[][] = {{1,3,4},{2,4,3},{1,2,4}};
  // creating aaray to store result
  int c[][] = new int[3][3];
  // logic
  for(int i = 0;i<3;i++)
  {
  for(int j = 0;j<3;j++)
  {
   c[i][j] = a[i][j] + b[i][j];
   System.out.print(c[i][j] + " ");
  }
  System.out.println();
}
}
}