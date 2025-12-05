
package main.java.com.example.jdbc;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StudentDAO dao = new StudentDAO();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== STUDENT CRUD MENU ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. View All Students");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter option: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:  // Create
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Age: ");
                    int age = Integer.parseInt(sc.nextLine());
                    System.out.print("Address: ");
                    String address = sc.nextLine();

                    Student newStudent = new Student(name, age, address);
                    dao.addStudent(newStudent);

                    System.out.println("Student added with ID: " + newStudent.getId());
                    break;

                case 2: // Read one
                    System.out.print("Enter ID: ");
                    int id = Integer.parseInt(sc.nextLine());
                    Student s = dao.getStudent(id);
                    System.out.println(s != null ? s : "Student not found");
                    break;

                case 3: // Read all
                    List<Student> students = dao.getAllStudents();
                    for (Student st : students) System.out.println(st);
                    break;

                case 4: // Update
                    System.out.print("Enter ID to update: ");
                    int uid = Integer.parseInt(sc.nextLine());

                    Student existing = dao.getStudent(uid);
                    if (existing == null) {
                        System.out.println("Student not found.");
                        break;
                    }

                    System.out.print("New Name: ");
                    existing.setName(sc.nextLine());

                    System.out.print("New Age: ");
                    existing.setAge(Integer.parseInt(sc.nextLine()));

                    System.out.print("New Address: ");
                    existing.setAddress(sc.nextLine());

                    dao.updateStudent(existing);
                    System.out.println("Updated successfully.");
                    break;

                case 5: // Delete
                    System.out.print("Enter ID to delete: ");
                    int did = Integer.parseInt(sc.nextLine());
                    dao.deleteStudent(did);
                    System.out.println("Deleted.");
                    break;

                case 6:
                    System.out.println("Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
