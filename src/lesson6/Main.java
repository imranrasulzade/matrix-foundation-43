package lesson6;

public class Main {
    public static void main(String[] args) {
        String name = "Elza";
        String name1 = "Nigar";
        String name2 = "Fidan";
        String name3 = "Afaq";
        String name4 = "Cavid";
        String name5 = "Rehim";
        String name6 = "Aydan";

        String[] names = {name, name1, name2, name3, name4, name5, name6};

//        System.out.println(names[6]);


        int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 9;
        numbers[2] = 99;
        numbers[3] = 45;
        numbers[4] = 23;
        numbers[5] = 76;
        numbers[6] = 67;
        numbers[7] = 234;
        numbers[8] = 45;
        numbers[9] = 55;


//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }

//        int i = 0;
//        while (i < numbers.length) {
//            System.out.print(numbers[i] + " ");
//            i++;
//        }


        int[] array  = {4, 6, 9, 3};

        System.out.println(array[2]);

        int[][] multiArray = {
                {8, 9, 5},
                {6, 1, 4},
                {3, 2, 7}
        };


        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }







    }
}
