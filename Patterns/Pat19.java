package Patterns;

public class Pat19 {
    public static void main(String[] args) {
        //   *
        //  ***
        // *****
        //  ***
        //   *

        for(int i=0; i<=2; i++)
        {
            for(int j=0; j<3-i-1; j++)
            {
                System.out.print(" ");
            }
            for(int k=0; k<2*i+1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        
        for(int i=0; i<=2; i++)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print("  ");
            }
            for(int k=0; k<2*(2-i)-1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
