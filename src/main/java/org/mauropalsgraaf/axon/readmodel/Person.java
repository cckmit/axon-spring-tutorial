package org.mauropalsgraaf.axon.readmodel;

public class Person {

    private String firstName;
    private String infix;
    private String lastName;

    public Person(String firstName, String infix, String lastName) {
        this.firstName = firstName;
        this.infix = infix;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getInfix() {
        return infix;
    }

    public String getLastName() {
        return lastName;
    }
}
