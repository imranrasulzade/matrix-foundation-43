package lesson2.hw;


import java.util.Scanner;

public class Lesson2 {

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        System.out.println("Cekini daxil edin:");
//        float weightKg = input.nextFloat();
//        System.out.println("Boy daxil edin sm ile:");
//        float heightCm = input.nextFloat();
//        float heightM = heightCm / 100f;
//
//        float bmi = weightKg / (heightM * heightM);
//        System.out.println("BMI: " + bmi);
//
//        String category = null;
//        if (bmi < 18.5) {
//            System.out.println("Zeif Cekili");
//            category = "Zeif Cekili";
//        } else if (bmi >= 18.5 && bmi < 24.9) {
//            System.out.println("Normal");
//            category = "Normal";
//        } else if (bmi >= 24.9 && bmi < 29.9) {
//            System.out.println("Artiq cekili");
//            category = "Artiq cekili";
//        } else if (bmi >= 29.9) {
//            System.out.println("Obez");
//            category = "Obez";
//        }
//
//        System.out.println(category);


        Scanner sc = new Scanner(System.in);
        System.out.println("Neticeni saxil edin:");
        int gpa = sc.nextInt();
        char grade = '*';
        if (gpa < 0 || gpa > 100) {
            System.out.println("GPA uygun araliqda deyil!");
        } else if (gpa > 90) {
            grade = 'A';
        } else if (gpa > 80) {
            grade = 'B';
        }  else if (gpa > 70) {
            grade = 'C';
        }  else if (gpa > 60) {
            grade = 'D';
        }   else if (gpa > 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        System.out.println("Sizin netice: " + grade);



    }

}
