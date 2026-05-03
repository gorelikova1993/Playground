package InputOutput.unit6.homework;

import InputOutput.unit6.User;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Whiskers", "Maine Coon", 4));
        cats.add(new Cat("Luna", "siamese", 2));
        cats.add(new Cat("Mochi", "Scottish Fold", 6));
        
        File file = new File("cats.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(cats);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            ArrayList<Cat> list = (ArrayList<Cat>) objectInputStream.readObject();
            for (Cat cat : list) {
                System.out.println(cat.getNickname());
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        
    }
}
