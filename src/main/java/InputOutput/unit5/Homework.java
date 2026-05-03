package InputOutput.unit5;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        File file = new File("homework5.txt");
        try(RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter next page or \"stop\" to exit");
            byte[] pageText = new byte[3000];
            String input = scanner.nextLine();
            while(!input.equals("stop")) {
                int page = Integer.parseInt(input);
                randomAccessFile.seek((page - 1) * pageText.length);
                int count = randomAccessFile.read(pageText);
                System.out.println(new String(pageText, 0, count));
                System.out.println("Enter next page or \"stop\" to exit");
                input = scanner.nextLine();
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
