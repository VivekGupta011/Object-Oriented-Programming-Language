package Array;

public class Reverse {
    public static void main(String[] args) {
        int[] arry = { 3, 5, 6, 78, 56, 5656, 5656, 56 };

        for (int i = 0; i<arry.length; i++) {
            System.out.print(arry[i]+" ");
        }
        System.out.println();
        for (int i = arry.length - 1; i >= 0; i--) {
            System.out.print(arry[i] + " ");
        }
    }

}
