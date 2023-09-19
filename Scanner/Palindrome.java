package Scanner;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the numbers: ");
    num = sc.nextInt();
    int palindrome = checkPalindrome(num);
    System.out.println(palindrome);
    sc.close();
}
    public static int checkPalindrome(int num)
    {
        int r,temp,sum=0;
        temp=num;
        while(num>0)
        {
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if (temp==sum)
        System.out.println("is a palindrome number");
        else
        System.out.println("is not a palindrome number");
        return 0;
    }
    
}
