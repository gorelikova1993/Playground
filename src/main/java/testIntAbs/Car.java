package testIntAbs;

@FunctionalInterface
public interface Car {
    void go();
    
    default void stop() {
        System.out.println("Car stopped");
    }
}
