import java.util.*;
public class OnlinebetNaive 
{
    private static int[] naive(int[] starts, int[] ends, int[] points) {
        int[] count = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < starts.length; j++) {
                if (starts[j] <= points[i] && points[i] <= ends[j]) {
                    count[i]++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int[] starts = new int[a];
        int[] ends = new int[a];
        int[] points = new int[b];
        for (int i = 0; i < a; i++) {
            starts[i] = sc.nextInt();
            ends[i] = sc.nextInt();
        }
        for (int i = 0; i < b; i++) {
            points[i] = sc.nextInt();
        }
        int[] cnt = naive(starts, ends, points);
	System.out.println("Output is:");
        for (int x : cnt) {
            System.out.print(x + " ");
        }
    }
}