package concurrency;

public class MultifunctionalDeviceApp {
    public static void main(String[] args) {
        MultifunctionalDevice multifunctionalDevice = new MultifunctionalDevice();
        new Thread(new Runnable() {
            @Override
            public void run() {
                multifunctionalDevice.scan(10);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                multifunctionalDevice.print(23);
            }
        }).start();
    }
}
