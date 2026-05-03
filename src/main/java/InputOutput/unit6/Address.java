package InputOutput.unit6;

import java.io.Serializable;

public class Address implements Serializable {
    private String street;
    private int numberOfHouse;
    
    public Address(int numberOfHouse, String street) {
        this.numberOfHouse = numberOfHouse;
        this.street = street;
    }
    
    public String getStreet() {
        return street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }
    
    public int getNumberOfHouse() {
        return numberOfHouse;
    }
    
    public void setNumberOfHouse(int numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }
    
    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", numberOfHouse=" + numberOfHouse +
                '}';
    }
}
