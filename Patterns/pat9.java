package Patterns;

public class pat9 {
    public static void main(String[] args) {
    //12345
    //678910
    //11 12 13 14 15
    //16 17 18 19 20
    //21 22 23 24 25

     int i,j;
     int n=5;
     int count=1;
     for(i=1;i<=n;i++)
     {
         for(j=1;j<=n;j++)
         {
             System.out.print(count);
             count ++;
         }
         System.out.println("");
     }
    }
}
