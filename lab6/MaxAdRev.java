import java.util.*;
public class MaxAdRev{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of Profit array:");
        int n=sc.nextInt();
        int total;
        int profit[]=new int[n];
        System.out.println("Clicks of array:");
        int clicks[]=new int[n];
        int temp=0;
        int sum=0;
        for(int i=0;i<profit.length;i++){
            profit[i]=sc.nextInt();
        }
        for(int i=0;i<clicks.length;i++){
            clicks[i]=sc.nextInt();
        }
          for (int i = 0; i < profit.length; i++) {     
            for (int j = i+1; j < profit.length; j++) {     
               if(profit[i] < profit[j]) {    
                   temp = profit[i];    
                   profit[i] = profit[j];    
                   profit[j] = temp;    
               }     
            }     
        } 
        for (int i = 0; i < clicks.length; i++) {     
            for (int j = i+1; j < clicks.length; j++) {     
               if(clicks[i] < clicks[j]) {    
                   temp = clicks[i];    
                   clicks[i] = clicks[j];    
                   clicks[j] = temp;    
               }     
            }     
        } 

        for(int i=0;i<n;i++){
            sum=sum+(profit[i]*clicks[i]);
            
        }
	System.out.println(sum);
        System.out.print(sum + "=");
        for(int i=0;i<clicks.length;i++){
            if(i==clicks.length-1){
                System.out.print(profit[i] + "." + clicks[i]);
            }
            else{
                System.out.print(profit[i] + "." + clicks[i] + "+");
            }
        }
    }
}