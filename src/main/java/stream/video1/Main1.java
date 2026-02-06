package stream.video1;

public class Main1 {
    public static void main(String[] args) {
        new Thread(() -> System.out.println(1)).start();
    }
}
