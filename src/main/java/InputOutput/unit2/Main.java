package InputOutput.unit2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) {
        File file = new File("file1.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (InputStream inputStream = new FileInputStream(file)) {
            int a = inputStream.read();
            while( a != -1) {
                System.out.print((char)a);
                a = inputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
