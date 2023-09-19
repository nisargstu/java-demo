package Patterns;

public class pat12 {
    public static void main(String[] args) {
        int i,j;
        int n=5;
        for(i=1;i<=4;i++)
        {
            for(j=1; j<n; j++)
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
