package Problem;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int ans = 0;
        while (true) {
            System.out.println("Enter operator for operation and for exit use'x");
            char operation = scn.next().charAt(0);

            if (operation == '+' || operation == '-' || operation == '*' || operation == '/') {
                System.out.println("Enter First Number:");
                int firstnum = scn.nextInt();
                System.out.println("Enter Second Number:");
                int secondtnum = scn.nextInt();
                if (operation == '+') {
                    ans = firstnum + secondtnum;

                }
                if (operation == '-') {
                    ans = firstnum - secondtnum;

                }
                if (operation == '*') {
                    ans = firstnum * secondtnum;

                }
                if (operation == '/') {
                    ans = firstnum / secondtnum;

                }
            } else if (operation == 'x' || operation == 'X') {
                break;

            } else {
                System.out.println("Enter valid operation!");
            }
            System.out.println("Your answer is:" + ans);
        }

    }

}
