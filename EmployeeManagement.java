import java.io.*;
import java.util.Scanner;

class Employee implements Serializable {
    String name;
    String id;
    String designation;
    double salary;

    Employee(String name, String id, String designation, double salary) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
    }
}

class AppendableObjectOutputStream extends ObjectOutputStream {
    AppendableObjectOutputStream(OutputStream out) throws IOException { super(out); }
    protected void writeStreamHeader() throws IOException {}
}

public class EmployeeManagement {
    static Scanner sc = new Scanner(System.in);
    static String fileName = "employees.dat";

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Employee\n2. Display All Employees\n3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) addEmployee();
            else if (choice == 2) displayEmployees();
            else break;
        }
    }

    static void addEmployee() {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Designation: ");
        String des = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        Employee emp = new Employee(name, id, des, salary);
        try {
            FileOutputStream fos = new FileOutputStream(fileName, true);
            ObjectOutputStream oos;
            if (new File(fileName).length() == 0) oos = new ObjectOutputStream(fos);
            else oos = new AppendableObjectOutputStream(fos);
            oos.writeObject(emp);
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void displayEmployees() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
            while (true) {
                Employee emp = (Employee) ois.readObject();
                System.out.println("Name: " + emp.name + ", ID: " + emp.id + ", Designation: " + emp.designation + ", Salary: " + emp.salary);
            }
        } catch (EOFException e) {}
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}