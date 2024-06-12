import java.util.Scanner;

public class Student {
    String USN;
    String Name;
    String Branch;
    String Phone;

    // Parameterized constructor to initialize student attributes
    Student(String reg, String Name, String Branch, String Phone) {
        this.USN = reg;
        this.Name = Name;
        this.Branch = Branch;
        this.Phone = Phone;
    }

    // Method to display student details
    void displayRecord() {
        System.out.println(USN + "\t\t" + Name + "\t\t" + Branch + "\t\t" + Phone);
    }

    public static void main(String[] args) {
        // Create an array to store Student objects
        Student s[] = new Student[100];

        System.out.println("Enter the number of students");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter students details");
        // Input details for each student and create Student objects
        for (int i = 0; i < n; i++) {
            String USN = sc.next();
            String Name = sc.next();
            String Branch = sc.next();
            String Phone = sc.next();
            s[i] = new Student(USN, Name, Branch, Phone);
        }

        // Display headings for the student details table
        System.out.println("USN\t\tName\t\tBranch\t\tPhone");
        // Display details for each student
        for (int j = 0; j < n; j++) {
            s[j].displayRecord();
        }
    }
}

