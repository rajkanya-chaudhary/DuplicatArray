import java.util.stream.Stream;
import java.util.*;
class  Stream_hashSet
{
 public static void main(String arg[])
 {
  List<String>list = Arrays.asList("java","j2ee","Hibernet","java");
  // for set 
  Set<String> st = new HashSet<>(list);
  Stream<String>stream = st.stream();
  stream.forEach(System.out::println);

}
}