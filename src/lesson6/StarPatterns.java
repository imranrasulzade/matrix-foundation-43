package lesson6;

public class StarPatterns {
    public static void main(String[] args) {
        // Artan ulduzlar
        System.out.println("Artan ulduzlar:");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println();
        
        // Azalan ulduzlar
        System.out.println("Azalan ulduzlar:");
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
           *
          **
         ***
        ****
       *****
      ******


     */
}