package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double weight;
    private String hairColour;
    private double height;


    public Person(String firstName, String lastName, int age) {
        this.firstName= firstName;
        this.lastName= lastName;
        this.age=age;
    }
    public Person(String firstName, String lastName, int age, double weight, double height,String hairColour) {
        this(firstName, lastName, age);
        this.weight=weight;
        this.height=height;
        this.hairColour=hairColour;
    }


    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public boolean isTeen() {
     if( age>= 13 && age<=19) {
         return true;
        } else {
         return false;
        }
    }
}
