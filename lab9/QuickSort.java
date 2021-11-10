import java.util.*;
class QuickSort{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n=sc.nextInt();
        System.out.println("Enter elements in array:");
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        QuickSort obj = new QuickSort();
        obj.quickSort(a,0,n-1);
	System.out.println("Sorted array is:");
        for(int j=0;j<n;j++)
        {
            System.out.print(a[j] + " ");
        }
    }
    void quickSort(int A[], int l, int r)
    {
        if (l < r)
        {
            int m = partition(A, l, r);
            quickSort(A, l, m - 1);
            quickSort(A, m + 1, r);
        }
    }
    int partition (int a[], int l, int r)
    {
        int x = a[r];
        int i = (l - 1);
        for (int j = l; j <= r - 1; j++)
        {
            if (a[j] < x)
            {
                i++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t = a[i+1];
        a[i+1] = a[r];
        a[r] = t;
        return (i + 1);
    }
}


