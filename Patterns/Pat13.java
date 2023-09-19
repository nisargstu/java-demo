package Patterns;

public class Pat13 {


    public static void main(String[] args) {
    //54321
    //5432
    //543
    //54
    //5 

    int i,j;
    int n=5;
    for(i=1; i<=n; i++)
    {
        for(j=5;j>=i;j--)
        {
            System.out.print(j);
        }
        System.out.println("");
    }
    }
}
