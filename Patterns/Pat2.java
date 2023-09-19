package Patterns;

public class Pat2 {
    public static void main(String[] args) {
        //  * * * * *
        //  * * * *
        //  * * *
        //  * * 
        //  *
        int i;
        for( i=1; i<6; i++)
        {
            for (int j = 5; j>=i ; j--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
    }
}
