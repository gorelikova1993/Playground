package InputOutput.unit3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        File file = new File("file1.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (InputStream inputStream = new FileInputStream(file)) {
            long before = System.currentTimeMillis();
            byte[] arr = new byte[1000];
            int count = inputStream.read(arr);
            StringBuilder sb = new StringBuilder();
            while( count > 0) {
                sb.append(new String(arr));
                count = inputStream.read(arr);
            }
            System.out.println(sb);
            long after = System.currentTimeMillis();
            System.out.println(after - before);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
