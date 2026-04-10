import java.util.*;
public class LinkedHashSetImplementation {
      public static void main(String[] args) {
        Integer a=1;
        Set<Integer> set = new LinkedHashSet<>();
        set.add(a);
        System.out.println(set.hashCode());
        set.add(0);
        System.out.println(set);
        System.out.println(set.contains(1));
        Set<String> set1 = new LinkedHashSet<>();
        set1.add("yuva");
        set1.add("vig");
        set1.add("siva");
        set1.add("varun");
        System.out.println(set1);
        System.out.println(set1.hashCode());
        for(String s:set1){
            System.out.println(s);
        }
    }
    
}
