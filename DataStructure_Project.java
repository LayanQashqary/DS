package datastructure_project;
import java.util.*;

/**
 * This project is about a game for kids to learn the alphabet of English
 * language easily, in a fun and exciting way so kids will never get bored of
 * learning!
 */

public class DataStructure_Project {

    public static void main(String[] args) {
        
        /**
         * Declare object (input) from type Scanner
         */
        Scanner in = new Scanner(System.in);

        /**
         * Declare object (cir) from type circular_linked_list
         */
        circular_linked_list cir = new circular_linked_list();

        //This is array consist of the students that are in class now
        student[] students = new student[]{
            new student(1, "Ahmed"),
            new student(2, "Khalid"),
            new student(3, "Kamal"),
            new student(4, "Wasselah"),
            new student(5, "Abdulaziz"),
            new student(6, "Mohammed"),
            new student(7, "Yara"),
            new student(8, "Layan"),
            new student(9, "Lina"),
            new student(10, "Samah"),
            new student(11, "Dhuha"),
            new student(12, "Manar"),
            new student(13, "Shahad")};

        for (int i = 0; i < students.length; i++) {
            cir.addlast(students[i]);
        }

        //array consist of the English alphabet to use it in comparasion 
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        boolean flag = true;
        int num = 0;

        while (num != 7) {
            System.out.println("➤ Chose from the menu: "
                    + "\n * * * * * * * * * * * * * * * * * * * "
                    + "\n1- Add a student: "
                    + "\n2- Delete a student: "
                    + "\n3- Show all scores: "
                    + "\n4- START TEST: "
                    + "\n5- Show OUR SUPERHERO!!!: "
                    + "\n6- Show all students: "
                    + "\n7- exit!"
                    + "\n * * * * * * * * * * * * * * * * * * * " + "\n");

            num = in.nextInt();

            switch (num) {
                case 1: {
                    System.out.println("➤ Enter the number of student you want to ADD: ");
                    int userNum = in.nextInt();
                    System.out.println("➤ Enter the name of student you want to ADD: ");

                    String userName = in.next();
                    student s = new student(userNum, userName);
                    cir.addlast(s);
                    System.out.println("☑ The student has been added");

                    break;
                }

                case 2: {
                    System.out.println("➤ Enter the student ID to DELETE: ");
                    int id = in.nextInt();
                    cir.delete(id);
                    cir.display();
                    break;
                }

                case 3: {
                    cir.scores();
                    System.out.println("These are the students in the class: ");
                    break;
                }

                case 4:
                    System.out.println("How many question do you want for each student ?");
                    int number_of_q = in.nextInt();
                    int j = 0;
                    for (int i = 0; j < cir.size * number_of_q; i = (i + 1) % alphabet.length) {
                        cir.rotate(alphabet[i]);
                        j++;
                    }
                    break;

                case 5: {
                    cir.heighestScore();
                    break;
                }
                case 6: {
                    cir.display();
                    break;
                }
                case 7: {
                    flag = false;
                    break;
                }

                default: {
                    System.err.println(" ✘ YOU'VE ENTERD A WRONG NUMBER! ENTER A NUMBER BETWEEN 1 - 7");
                    break;
                }
            }//END of switch
        }//END of WHILE
    }//END of main
}//END of (DataStructure_Project) class


