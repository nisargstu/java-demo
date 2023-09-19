package Patterns;

public class Pat11 {
    public static void main(String[] args) {
        //11111
        //00000
        //11111
        //00000
        //11111

        int i,j;
        int n=5;
        for(i=1;i<=5;i++)
        {
            for(j=1; j<=n; j++)
            {
                if(i%2==0)
                {
                    System.out.print("0");
                }
                else
                {
                    System.out.print("1");
                }
            }
            System.out.println("1");
        }
    }
}
