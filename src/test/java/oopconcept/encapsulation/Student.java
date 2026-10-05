package oopconcept.encapsulation;

public class Student {
    private String name;
    private int age;
    private double grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Grade must be between 0 and 100.");
        }
    }

    public String studentInformation() {
        return "The student's name is " + name + ", age is " + age + " and grade is " + grade;
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Aarav");
        student1.setAge(20);
        student1.setGrade(85.5);

        System.out.println(student1.studentInformation());
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getGrade());

        // Try invalid values to test validation
        student1.setAge(-5);
        student1.setGrade(150);
    }
}