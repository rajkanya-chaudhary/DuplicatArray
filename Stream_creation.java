import java.util.stream.Stream;
import java.util.*;
class  Stream_creation
{
 public static void main(String arg[])
 {
  // for list 
 //List<String>list = Arrays.asList("java","j2ee","Hibernet");
//Stream<String> stream = list.stream();
  //stream.forEach(System.out::println);

  List<String>list = Arrays.asList("java","j2ee","Hibernet","java");
  Stream<String> stream = list.stream();
  // for set 
  Set<String> st = new HashSet<>(list);
  Stream<String>stream = st.stream();
  stream.forEach(System.out::println);

}
}