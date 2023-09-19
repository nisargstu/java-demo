package Scanner;

import java.util.Scanner;

public class Oddeven {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();

        if (num%2==0)
        {
            System.out.println("IT is a even number");
        }
        else
        {
            System.out.println("It is a odd number");
        }
    }
}
