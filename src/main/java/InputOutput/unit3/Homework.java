package InputOutput.unit3;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        File file = new File("fileForUnit3.txt");
        try (Reader reader = new InputStreamReader(new FileInputStream(file))) {
            char[] arr = new char[128];
            int count = reader.read(arr);
            StringBuilder sb = new StringBuilder();
            while(count > 0) {
                sb.append(new String(arr,0,count));
                count = reader.read(arr);
            }
            String[] names = sb.toString().split(" ");
            Arrays.stream(names)
                    .filter(name -> name.startsWith("A"))
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
