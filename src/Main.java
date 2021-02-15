import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner grades = new Scanner(System.in);
        int myGrades = grades.nextInt();

        String result = switch (myGrades) {
            case 1:
                yield "Very good";
            case 2:
                yield "Good";
            case 3:
                yield "Satisfactory";
            case 4:
                yield "Sufficient";
            case 5:
                yield "Not sufficient";
            default:
                yield "This isn't a grade";
        };
    }
}