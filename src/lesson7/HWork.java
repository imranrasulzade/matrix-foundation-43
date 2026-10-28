package lesson7;

import java.util.Scanner;

public class HWork {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ededi daxil et:");
        int number = input.nextInt();
        int orjNumber = number;
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }

        //123

        int[] digits = new int[count];
        for (int i = 0; i < digits.length; i++) {
            int qaliq = orjNumber % 10;
            digits[i] = qaliq;
            orjNumber /= 10;
        }

        int symmetryCount = 0;
        for (int i = 0; i <= digits.length / 2; i++) {
            if (digits[i] == digits[digits.length - 1 - i]) {
                symmetryCount++;
            }
        }

        System.out.println(symmetryCount);


    }
}
