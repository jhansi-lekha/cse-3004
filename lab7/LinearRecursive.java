import java.util.*;
class LinearRecursive
{
	int reclinsearch(int arr[], int start, int last, int x)
	{
	     if (last < start)
	        return -1;
	     if (arr[start] == x)
	        return start;
	     return reclinsearch(arr, start+1, last, x);
	}
    public static void main(String args[])
    {
	    LinearRecursive ref=new LinearRecursive();
	    int i,len, key, array[];
	    Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array length:");
        len = sc.nextInt(); 
        array = new int[len]; 
        System.out.println("Enter " + len + " elements");
        for (i = 0; i < len; i++)
      	{
        	array[i] = sc.nextInt();
      	}
      	System.out.println("Enter search key value:");
        key = sc.nextInt();
        int index=ref.reclinsearch(array,0,len-1,key);
        if (index!=-1) 
        {
           System.out.println(key+" is present at location "+(index+1));
        }
      	else{
	        System.out.println(key + " not found");
   	    }
    }
}