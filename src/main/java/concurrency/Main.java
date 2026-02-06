package concurrency;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (Thread.currentThread().isInterrupted()) {
                        break;
                    }
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        myThread.start();
        for (int i = 0; i < 100; i++) {
            if (i == 100) {
                myThread.interrupt();
            }
            System.out.print("M");
        }
        System.out.println("\nFinish");
    }
}
