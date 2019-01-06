
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println("Name: ");
            String studentName = reader.nextLine();

            if (studentName.length() == 0) {
                break;
            }

            System.out.println("StudentNumber: ");
            String studentNumber = reader.nextLine();

            students.add(new Student(studentName, studentNumber));
        }

        for (Student studentEntry : students) {
            System.out.println(studentEntry.toString());
        }

        System.out.println("Give search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("result: ");

        for (Student studentToMatch : students) {
            if (studentToMatch.getName().contains(searchTerm)) {
                System.out.println(studentToMatch);
            }
        }
    }
}