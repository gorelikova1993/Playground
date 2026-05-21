package tasks.hackerrank;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Annagram {
    public static void main(String[] args) {
    
    }
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        char[] charsA = a.toLowerCase(Locale.ROOT).toCharArray();
        char[] charsB = b.toLowerCase(Locale.ROOT).toCharArray();
        Map<Character, Integer> mapA = new HashMap<>();
        Map<Character, Integer> mapB = new HashMap<>();
        
        for (char value : charsA) {
            if (mapA.containsKey(value)) {
                int count = mapA.get(value);
                count++;
                mapA.put(value, count);
            } else {
                mapA.put(value, 1);
            }
        }
        
        for (char c : charsB) {
            if (mapB.containsKey(c)) {
                int count = mapB.get(c);
                count++;
                mapB.put(c, count);
            } else {
                mapB.put(c, 1);
            }
        }
        return mapA.equals(mapB);

    }
}
