package InputOutput.unit5;

import java.io.File;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) {
        File file = new File("file5.txt");
        try(RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw")) {
            randomAccessFile.seek(10);
            randomAccessFile.writeBytes("*****************************");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
