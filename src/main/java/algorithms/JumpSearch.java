package algorithms;

import java.util.ArrayList;
import java.util.List;

public class JumpSearch {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");

        String elem = "G";

        int foundIndex = -1;

        int start = 0;
        int step = (int)Math.floor(Math.sqrt(list.size()));
        int end = step;

        while (list.get(end).compareTo(elem) < 0) {
            start = end;
            end += step;
            if(end > list.size() - 1)
                end = list.size(); //if right exceeds then bound the range
        }
        for (int i = start; i <= end; i++) {
            if(list.get(i).contains(elem))
                foundIndex = i;
        }

        System.out.println(foundIndex);

    }
}
