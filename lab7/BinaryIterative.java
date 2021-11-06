import java.util.*;
public class BinaryIterative
{
  public static void main(String args[])
  {
    int n,low=0,high,temp=0,mid;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array length: ");
    n=sc.nextInt();
    System.out.println("Enter array elements: ");
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    System.out.println("Enter search key value: ");
    int x=sc.nextInt();
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(a[i]>a[j]){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
    high=n-1;
    while(low<=high){
        mid=(low+high)/2;
        if(a[mid]==x){
            System.out.println("Element found at index "+ mid);
            System.exit(0);
        }
        else if(x<a[mid])
            high=mid-1;
        else if(x>a[mid])
            low=mid+1;
    }
    System.out.println(" Not found");
  }
}