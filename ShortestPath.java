import java.util.*;
class ShortestPath
{
 public static float shortpath(String path)
 {
 int x = 0,y = 0;
 for(int i = 0;i<path.length();i++)
 {
  char dir = path.charAt(i);
  // South
  if(dir == 'S')
  {
   y--;
  }
// North
  else if(dir == 'N')
   {
    y++;
   }
// West
  else if(dir == 'W')
   {
    x--;
   }
// East
   else
   {
    x++;
    }
 }
 int x2 = x*x;
 int y2 = y*y;
 return (float)Math.sqrt(x2+y2);
}    
 public static void main(String arg[])
 {
  String path="WNEENESENNN";
  System.out.println("Short displacement path = "+shortpath(path));
}
}