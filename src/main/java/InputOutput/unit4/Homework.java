package InputOutput.unit4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        File dic = new File("folder4Homework");
        File file = new File("homework4.txt");
        try(OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file, true))) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter name or \"stop\" to exit: ");
            String next = scanner.nextLine();
            while (!next.equals("stop")) {
                outputStream.write(next.getBytes());
                outputStream.write("\n".getBytes());
                next = scanner.nextLine();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        try(InputStream inputStream = new BufferedInputStream(new FileInputStream(file))) {
            byte[] arr = new byte[128];
            int count = inputStream.read(arr);
            StringBuilder sb = new StringBuilder();
            while (count > 0) {
                sb.append(new String(arr, 0, count));
                count = inputStream.read(arr);
            }
            System.out.println(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
