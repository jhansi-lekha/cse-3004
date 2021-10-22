import java.util.*;
public class GCD
{
    static int gcd(int a,int b)
    {
        if(a==0)
            return b;
        if(b==0)
            return a;
        
        if(a==b)
            return a;
        return gcd(b%a,a);
    }
    public static void main (String []args){
    Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        System.out.println("GCD of " +a+" and "+b+" is " +gcd(a,b));
    }
}