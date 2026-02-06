package concurrency;

public class MainABC {
    public static void main(String[] args) {
        PrintABC abc = new PrintABC();
        Thread A = new Thread(new Runnable() {
            @Override
            public void run() {
                abc.printA();
            }
        });
        Thread B = new Thread(new Runnable() {
            @Override
            public void run() {
                abc.printB();
            }
        });
        Thread C = new Thread(new Runnable() {
            @Override
            public void run() {
                abc.printC();
            }
        });


            A.start();
            B.start();
            C.start();

    }
}
