package InputOutput.unit2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class Homework {
    public static void main(String[] args) {
        File file = new File("folder1/file.txt");
        File dic = new File("folder1");
        
        try {
            dic.mkdir();
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String s = "Chris, Mark, John";
        try (OutputStream outputStream = new FileOutputStream(file)) {
            outputStream.write(s.getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try(InputStream inputStream = new FileInputStream(file)) {
            int a = inputStream.read();
            while (a != -1) {
                System.out.print((char) a);
                a = inputStream.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        
    }
}
