package lesson6;

public class Palindrome {
    public static void main(String[] args) {

        int number = 123421;

        int orjNumber = number;

        int reverseNumber = 0;

        while (number != 0) {
            int qaliq = number % 10;
            reverseNumber = reverseNumber * 10 + qaliq;
            number /= 10;
        }

        if (orjNumber == reverseNumber) {
            System.out.println("Number is palindrome");
        } else  {
            System.out.println("Number is not palindrome");
        }









    }
}
