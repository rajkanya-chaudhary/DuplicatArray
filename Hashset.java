/*
import java.util.*;

public class Hashset{
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
*/
import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(Integer.parseInt("1"));
        set.add(Integer.parseInt("2"));
        Iterator<Integer> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}


