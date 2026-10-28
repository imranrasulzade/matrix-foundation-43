package lesson8;

import java.util.Arrays;
import java.util.Scanner;

public class HW {

    static void bonusTask() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int count = 0;

        while (number != 1) {
            count++;
            if (number % 2 == 0) {
                number /= 2;
            } else {
                number++;
            }
        }

        System.out.println(count);
    }

    static void task1() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Arrayi doldur...");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] % 6 == 0) {
                sum += array[i];
                count++;
            }
        }

        System.out.println("Cem: " + sum);
        System.out.println("Say: " + count);
    }

    public static void main(String[] args) {

        bonusTask();



//
//
//


//        String[] array = {"Elza", "Aydan", "Fidan", "Afaq", "Rehim", "Nigar", "Ayten"};
//
//
////        for (int i = 0; i < array.length; i++) {
////            if (array[i].startsWith("A")) {
////                array[i] = array[i].toUpperCase();
////            }
////        }
//
//        for (String e : array) {
//            if (e.startsWith("A")) {
//                e = e.toUpperCase();
//            }
//        }
//
//        for (String element : array) {
//            System.out.println(element);
//        }
//
//
//        int[] arr = {54, 6, 6, 2, 45, 4};
//
//        for (int a : arr) {
//            System.out.println(a);
//        }


    }

}
