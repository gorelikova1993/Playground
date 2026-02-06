package concurrency;

public class PrintABC {

    private final Object monitor = new Object();
    private int turn = 0;

    public void printA() {
        for (int i = 0; i < 5; i++) {
            synchronized (monitor) {
                while (turn != 0) {
                    try {
                        monitor.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.print("A");
                turn = 1;
                monitor.notifyAll();
            }

        }
    };

    public void printB() {
        for (int i = 0; i < 5; i++) {
            synchronized (monitor) {
                while (turn != 1) {
                    try {
                        monitor.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.print("B");
                turn = 2;
                monitor.notifyAll();
            }

        }
    };

    public void printC() {
        for (int i = 0; i < 5; i++) {
            synchronized (monitor) {
                while (turn != 2) {
                    try {
                        monitor.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.print("C");
                turn = 0;
                monitor.notifyAll();
            }

        }
    };
}
