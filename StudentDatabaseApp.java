package Database;

import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {

        // Ask how many users we want to add
        System.out.println("Enter number of new students to enroll: ");
        Scanner input = new Scanner(System.in);
        int numOfStudents = input.nextInt();
        Student[] students = new Student[numOfStudents];
        
        // Create number of new students
        for(int i = 0; i < numOfStudents; i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].toString());
        }

        for(int i = 0; i < numOfStudents; i++){
            System.out.println(students[i].toString());
        }
    }
}