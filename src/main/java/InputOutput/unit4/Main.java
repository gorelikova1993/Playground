package InputOutput.unit4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        File dic = new File("folder4");
        File file = new File(dic , "file4.txt");
        try(OutputStream outputStream = new FileOutputStream(file)) {
            String s = "John Mike Yulia Arthur Bob Tim Anna Elizabeth";
            outputStream.write(s.getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
