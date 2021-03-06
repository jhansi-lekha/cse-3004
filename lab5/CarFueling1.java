import java.util.Scanner;
public class CarFueling1{
    static int carrefuling(int distance,int tank,int stops[],int n) {
        int currentrefills=0;
        int numrefills=0;
        int lastrefills=0;
        while(currentrefills<=n-1) {
            lastrefills=currentrefills;
            while((currentrefills<=n-1) && stops[currentrefills+1]-stops[lastrefills]<=tank) {
                currentrefills=currentrefills+1;
            }
            if(distance<=tank)
                return 0;
            if(currentrefills==lastrefills)
                return -1;
            if(currentrefills<=n)
                numrefills=numrefills+1;
        }
        return numrefills;  
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int distance=sc.nextInt();
        int tank=sc.nextInt();
        int n=sc.nextInt();
        int remain=0;
        int stops[]=new int[n*n*n];
        for(int i=0;i<n;i++) {
            stops[i]=sc.nextInt();
        }
        remain=distance-stops[3];
        System.out.println(carrefuling(distance,tank,stops,n));
        System.out.println("Remain:"+remain);
    }
}
