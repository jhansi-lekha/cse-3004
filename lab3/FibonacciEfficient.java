import java.util.Scanner;

class FibonacciEfficient {

static int fib(int n)
{
int f[] = new int[n + 2];

int i;
f[0] = 0;
f[1] = 1;

for (i = 2; i <= n; i++) {
f[i] = f[i - 1] + f[i - 2];
}

return f[n];
}

public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int N=in.nextInt();
System.out.print(fib(N-1));
}
}