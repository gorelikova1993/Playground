package concurrency.homework;

import static java.lang.Thread.currentThread;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(1000);



        Thread client1 = new Thread(new Runnable() {
            @Override
            public void run() {
                atm.withdraw("Max", 300);
            }
        });

        Thread client2 = new Thread(new Runnable() {
            @Override
            public void run() {
                atm.withdraw("John", 500);
            }
        });

        Thread client3 = new Thread(new Runnable() {
            @Override
            public void run() {
                atm.withdraw("Nick", 400);
            }
        });
        client1.start();
        client2.start();
        client3.start();

        String name= currentThread().getName();
    }
}
