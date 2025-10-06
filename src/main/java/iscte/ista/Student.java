package iscte.ista;

public class Student {
    private final String name;
    private final int number;
    public Student(String name, int number) {
        this.name = name;
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public int getNumber() {
        return number;
    }
}
