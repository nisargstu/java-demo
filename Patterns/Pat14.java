package Patterns;
public class Pat14 {
    public static void main(String[] args) {
        //12345
        //2345
        //345
        //45
        //5

        int i,j;
        int n=5;
        for(i=1;i<=n;i++)
        {
            for(j=i;j<=n;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
