package collections;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
    public static void main(String[] args) {
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);
        Person person4 = new Person(4);


        Queue<Person> people = new LinkedList<>();
        people.add(person3);
        people.add(person2);
        people.add(person4);
        people.add(person1);




        
    }
}

class Person {
    private int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                "}";
    }
}
