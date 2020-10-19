import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner gradeInput = new Scanner(System.in);
        System.out.println("Please enter your grade");
        int grade = gradeInput.nextInt();

        switch (grade) {

            case 100,99,98,97,96,95,94,93,92,91,90:
                System.out.println("You have received an A! Excellent!");
                break;
            case 89, 88, 87, 86, 85, 84, 83, 82, 81, 80:
                System.out.println("You have received a B! Not bad.");
                break;
            case 79, 78, 77, 76, 75, 74, 73, 72, 71, 70:
                System.out.println("You have received a C! Eh.");
                break;
            case 69, 68, 67, 66, 65, 64, 63, 62, 61, 60:
                System.out.println("You have received a D! Please re-examine all relevant chapters.");
                break;
            case 59:
                break;
        }


//        if (grade > 89) {
//            System.out.println("You have received an A! Excellent!");
//        } else if ( grade > 79) {
//            System.out.println("You have received a B! Not bad.");
//        } else if (grade > 69) {
//            System.out.println("You have received a C! Eh.");
//        } else if (grade > 59) {
//            System.out.println("You  have received a D! Please re-examine all relevant chapters.");
//        } else if (grade > 0) {
//            System.out.println ("You have received an F! Please re-examine all chapters.");
//        } else {
//            System.out.println("How was this even possible, you are now the teacher.");
//        }
    }
}
