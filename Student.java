package Database;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses = null;
    private int balance;
    private static int costCourse = 600;
    private static int id = 1000;
    
    // Constructor
    public Student() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student's first name: ");
        this.firstName = input.nextLine();

        System.out.print("Enter student's last name: ");
        this.lastName = input.nextLine();

        System.out.print("Enter student's year level: ");
        this.gradeYear = input.nextInt();

        setStudentId();
        
    }

    // Generate id
    private void setStudentId(){
        // Grade level + ID
        id++;
        this.studentId = gradeYear + "" + id;
    }

    // Enroll in courses
    public void enroll(){

        do {
            System.out.print("Enter course to enroll, Q to quit: ");
            Scanner input = new Scanner(System.in);
            String course = input.nextLine();

            if (!course.equals("Q")){
                courses = courses + "\n" + course;
                balance = balance + costCourse;
            }
            else { 
                break; 
            }
        } while (1 != 0);

    }

    //View Balance
    public void viewBalance(){
        System.out.println("Your balance is: $"+ balance);
    }
    // Pay tuition and view balance
    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment: ");
        Scanner input = new Scanner(System.in);
        int payment = input.nextInt();
        balance = balance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    // Show status
    public String toString() {
        return "\n" + "Name: " + firstName + " " + lastName + 
            "\nGrade level: " + gradeYear +  
            "\nStudent ID: " + studentId + 
            "\nCourses Enrolled: " + courses +
            "\nBalance: $ " + balance;
    }
}
