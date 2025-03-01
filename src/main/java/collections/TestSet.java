package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        hashSet.add("mike");
        hashSet.add("Katy");
        hashSet.add("Georgy");
        hashSet.add("Tom");

        for (String name : hashSet) {
            System.out.println(name);
        }
    }
}
