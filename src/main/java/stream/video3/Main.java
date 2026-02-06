package stream.video3;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Alex", 35));
        users.add(new User("Max", 22));
        users.add(new User("John", 17));
        users.add(new User("Andrew", 33));
        users.add(new User("Jack", 44));
        users.add(new User("Nick", 80));
        users.add(new User("Alice", 46));
        users.add(new User("Helen", 11));

        users.stream()
                .filter(user -> user.getAge() < 40)
                .sorted(Comparator.comparing(User::getName))
                .limit(3)
                .map(User::getName)
                .forEach(System.out::println);
        System.out.println("---------------------------------------");
        Optional<User> oldest = users.stream()
     //           .filter(user -> user.getAge() < 5)
                .max((Comparator.comparingInt(User::getAge)));

       oldest.ifPresentOrElse(System.out::println, () -> System.out.println("User not found"));

        System.out.println("-----------------------------------------");

      users.stream()
               .filter(user1 -> user1.getName().contains("l"))
               .findFirst()
               .ifPresentOrElse(System.out::println, () -> System.out.println("User not found"));

    }
}
