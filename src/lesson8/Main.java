package lesson8;

import lesson9.Student;

import java.util.Random;

public class Main {

    static void sayHello() {
        System.out.println("Hello");
    }

    static int getOtpCode() {
        Random rand = new Random();
        int otp = rand.nextInt(8999) + 1000;
        return otp;
    }

    static int plus(int a, int b) {
        return a + b;
    }

    static int plus(int a, int b, int c) {
        return plus(a, b) + c;
    }

    static String getFullName(String a, String b) {
        return a + " " + b;
    }

    static void test(String name) {
        System.out.println("My name is " + name);
    }



    static void printArray(int[] array) {
        for (int a : array) {
            System.out.print(a + ", ");
        }
        System.out.println();
    }

    static void findAverage(int[] array) {
        int sum = 0;
        for (int a : array) {
            sum += a;
        }
        System.out.println("The average is " + sum / array.length);
    }


    public static void main(String[] args) {

        sayHello();

        int number = getOtpCode();

        System.out.println(number);


        int sum = plus(6, 98);

        int s = plus(77, 99, 6);


        test("Aydan");

        test("Rehim");


        String f = getFullName("Aydan", "Akberova");
        String g = getFullName("Akberova", "Aydan");

        System.out.println("Imran".replace('a', 'v'));
        System.out.println(f);
        System.out.println(g);




    }
}
