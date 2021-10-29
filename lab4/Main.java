import java.util.*;
import java.io.*;


class Main{
    static int compute_refills(int dist,int tank,int stops[],int n){
            int current_refills=0;
            int num_refills=0;
            int last_refill=0;
            while(current_refills<=n){
                last_refill=current_refills;
                while ((current_refills!=stops.length - 1) && (stops[current_refills + 1]- stops[last_refill])<=tank)
                {
                    current_refills=current_refills + 1;
                }
                if(current_refills==last_refill)
                    return -1;
                if(current_refills<=n)
                    num_refills=num_refills + 1;
        }
        return num_refills;
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int m=sc.nextInt();
        int n=sc.nextInt();
        int stops[]=new int[n];
        for(int i=0;i<n;i++){
            stops[i]=sc.nextInt();
        System.out.println(compute_refills(d,m,stops,n));
        }
    
    }
}