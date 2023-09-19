package Scanner;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextInt();
        System.out.println("Enter c: ");
        c = sc.nextInt();
        sc.close();

        int maxNumber = getMaximumNumber(a, b, c);
        System.out.format("%d is a maximum number", maxNumber);
        System.out.println();
        int minNumber = getMinimumNumber(a, b, c);
        System.out.format("%d is a minimum number", minNumber);
        System.out.println();
        int midNumber = getMediumNumber(a, b, c);
        System.out.format("%d is the medium number", midNumber);
    }

    public static int getMaximumNumber(int a, int b, int c) {
        return a > b && a > c ? a : b > a && b > c ? b : c;
    }

    public static int getMinimumNumber(int a, int b, int c) {
        return a < b && a < c ? a : b < a && b < c ? b : c;

    }

    public static int getMediumNumber(int a, int b, int c) {
        return (a < b && b < c) || (c < b && b < a)? b : (b < a && a < c) || (c < a && a < b) ? a : c;
    }
}
