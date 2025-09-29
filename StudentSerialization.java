
import java.io.*;

class Student implements Serializable {
    String studentID;
    String name;
    double grade;

    Student(String studentID, String name, double grade) {
        this.studentID = studentID;
        this.name = name;
        this.grade = grade;
    }
}

public class StudentSerialization {
    public static void main(String[] args) {
        Student s = new Student("S101", "Alice", 9.5);
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"));
            oos.writeObject(s);
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"));
            Student retrieved = (Student) ois.readObject();
            ois.close();

            System.out.println("ID: " + retrieved.studentID);
            System.out.println("Name: " + retrieved.name);
            System.out.println("Grade: " + retrieved.grade);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}