package Method;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a Number:");
        // int userInput = sc.nextInt();
        // ArmstrongCheck(userInput);
        for (int i = 100; i < 1000; i++) {
            if (ArmstrongCheck(i)) {
                System.out.println("armstrong:" + i+"");
            }else{
                System.out.println("Not armstrong:" + i+"");

            }
        }

    }

    /**
     * 
     */
     static boolean ArmstrongCheck(int userInput) {
        int ArmstrongNum = 0;
        int Original = userInput;
        while (userInput > 0) {
            int rem = userInput % 10;
            ArmstrongNum = ArmstrongNum + rem * rem * rem;
            userInput = userInput / 10;
        }

        return ArmstrongNum==Original;

    }
}
