package Patterns;

public class pat10 {
    public static void main(String[] args) {
        //10101
        //10101
        //10101
        //10101
        //10101

        int i,j;
        int n=4;
        for(i=1;i<=5;i++)
        {
            for(j=1; j<=n; j++)
            {
                if(j%2==0)
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
