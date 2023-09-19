package Patterns;

public class Pat17 {
    public static void main(String[] args) {
        //1
        //21
        //321
        //4321
        //54321
        int count=1;
        for(int i=1; i<=5; i++)
        {
            count=i;
            for(int j=1; j<=i; j++)
            {
                System.out.print(count);
                count--;
            }
            System.out.println("");
        }
    }
}
