package concurrency;

public class MultifunctionalDevice {
    private final Object monitor1 = new Object();
    private final Object monitor2 = new Object();

    public void print(int pages) {
        synchronized (monitor1) {
            for (int i = 1; i <= pages; i++) {
                System.out.println("Отпечатано " + i + "стр");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void scan(int pages) {
        synchronized (monitor2) {
            for (int i = 1; i <= pages; i++) {
                System.out.println("Отсканировано " + i + "стр");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
