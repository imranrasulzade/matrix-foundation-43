package lesson3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        int dayOfWeek = input.nextInt();

//        String dayOfWeekName = null;

//        if (dayOfWeek == 1) {
//            dayOfWeekName = "Monday";
//        } else if (dayOfWeek == 2) {
//            dayOfWeekName = "Tuesday";
//        }  else if (dayOfWeek == 3) {
//            dayOfWeekName = "Wednesday";
//        }  else if (dayOfWeek == 4) {
//            dayOfWeekName = "Thursday";
//        }   else if (dayOfWeek == 5) {
//            dayOfWeekName = "Friday";
//        }   else if (dayOfWeek == 6) {
//            dayOfWeekName = "Saturday";
//        } else  if (dayOfWeek == 7) {
//            dayOfWeekName = "Sunday";
//        } else {
//            dayOfWeekName = "Invalid day of week";
//        }

//        switch (dayOfWeek) {
//            case 1 -> dayOfWeekName = "Monday";
//            case 2 -> dayOfWeekName = "Tuesday";
//            case 3 -> dayOfWeekName = "Wednesday";
//            case 4 -> dayOfWeekName = "Thursday";
//            case 5 -> dayOfWeekName = "Friday";
//            case 6 -> dayOfWeekName = "Saturday";
//            case 7 -> dayOfWeekName = "Sunday";
//            default -> dayOfWeekName = "Invalid day of week";
//        }

//        String dayOfWeekName = switch (dayOfWeek) {
//            case 1 -> "Monday";
//            case 2 -> "Tuesday";
//            case 3 -> "Wednesday";
//            case 4 -> "Thursday";
//            case 5 -> "Friday";
//            case 6 -> "Saturday";
//            case 7 -> "Sunday";
//            default -> "Invalid day of week";
//        };
//        System.out.println("Day of week: " + dayOfWeekName);


        System.out.println("birinci ededi daxil et:");
        int a = input.nextInt();
        System.out.println("ikinci ededi daxil et:");
        int b = input.nextInt();

        System.out.println("Emeliyyati daxil et:");
        char operation = input.next().charAt(0);

        int result = switch (operation) {
            case '+' -> {
                int c = a + b;
                yield c;
            }
            case '-' -> {
                int c = a - b;
                yield c;
            }
            case '*' -> {
                int c = a * b;
                yield c;
            }
            case '/' -> {
                int c = a / b;
                yield c;
            }
            default -> '#';
        };

        System.out.println(result);


    }
}
