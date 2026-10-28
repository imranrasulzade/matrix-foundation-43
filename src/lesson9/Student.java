package lesson9;


public class Student {

    public Student() {

    }

    Student(String name, int age, boolean gender, double grade) {
        this.name = name;
        if (age < 18) {
            System.err.println("Age uygun deyil..");
        } else {
            this.age = age;
        }
        this.gender = gender;
        this.grade = grade;
    }

    String name;
    int age;
    boolean gender;
    double grade;

    static int COUNT;

    void printStudentData() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + (this.gender ? "Qadin" : "Kishi"));
        System.out.println("Grade: " + this.grade);
    }

    static int getCount() {
        return COUNT;
    }

    public void setName(String name) {
        if (name == null || name.length() > 2) {
            System.err.println("Name uygun deyil..");
        } else {
            this.name = name;
        }
    }

}
