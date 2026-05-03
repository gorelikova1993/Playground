package InputOutput.unit6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        File file = new File("users.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        User user = new User("John", "Smith", 25, new Address(1, "Lenin street"));
//        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
//            objectOutputStream.writeObject(user);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            User user = (User) objectInputStream.readObject();
            System.out.println(user);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
