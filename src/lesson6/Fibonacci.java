package lesson6;

public class Fibonacci {
//
//       1 2 3
//       0 1 1 2 3 5 8 13 21 34 55
//         1 2 3

    public static void main(String[] args) {
        int count = 13;

        int birinci = 0;
        int ikinci = 1;
        for (int i = 1; i <= count; i++) {
            System.out.print(birinci + " ");
            int ucuncu = birinci + ikinci;
            birinci = ikinci;
            ikinci = ucuncu;
        }


    }

}
