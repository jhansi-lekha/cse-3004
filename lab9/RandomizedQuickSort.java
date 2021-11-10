import java.util.*;

class RandomizedQuickSort
{
public static void main(String args[])
{
   	Scanner sc=new Scanner(System.in);
	System.out.println("Enter length of array:");
        int n=sc.nextInt();
        System.out.println("Enter elements in array:");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

	sort(arr, 0, n-1);

	System.out.println("Sorted array");
	printArray(arr);
}
static void random(int arr[],int low,int high)
{

Random rand= new Random();
int pivot = rand.nextInt(high-low)+low;

int temp1=arr[pivot];
arr[pivot]=arr[high];
arr[high]=temp1;
}
static int partition(int arr[], int low, int high)
{
random(arr,low,high);
int pivot = arr[high];


int i = (low-1);
for (int j = low; j < high; j++)
{
if (arr[j] < pivot)
{
i++;
int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
}
}
int temp = arr[i+1];
arr[i+1] = arr[high];
arr[high] = temp;

return i+1;
}



static void sort(int arr[], int low, int high)
{
if (low < high)
{
int m = partition(arr, low, high);
sort(arr, low, m-1);
sort(arr, m+1, high);
}
}
static void printArray(int arr[])
{
int n = arr.length;
for (int i = 0; i < n; ++i)
System.out.print(arr[i]+" ");
System.out.println();
}
}