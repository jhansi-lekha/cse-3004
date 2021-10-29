import java.util.Scanner;
public class MoneyChange
{
   static int rep[]=new int[40];
    static int minCoins(int coins[], int m, int n)
    {
        int count=0;
        if (n == 0) 
        return 0;
     
       
       int res = Integer.MAX_VALUE;
     
       for (int i=0; i<m; i++)
       {
         if (coins[i] <= n)
         {
             int sub = minCoins(coins, m, n-coins[i]);
     
             rep[sub]=coins[i];
             if (sub != Integer.MAX_VALUE && sub + 1 < res)
                res = sub + 1;
               
         }
       }
       return res;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       int coins[] =  {1,5,10};
       int m = coins.length;
       int n = sc.nextInt();
       int miniCount=minCoins(coins, m,n);
       System.out.println( miniCount );
       for(int i=0;i<miniCount;i++){
       	    System.out.print(" " +rep[i]+" " );
       }
       
    }
}
