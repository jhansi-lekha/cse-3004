import java.util.*;
public class Nearest_neighbor{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int p[][] = new int[n][2];
    for(int i =0;i<n;i++){
      for(int j=0;j<2;j++){
        p[i][j]=sc.nextInt();
      }
    }
    double min=Double.MAX_VALUE;
    double dist;
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        dist=Math.sqrt((p[j][0]-p[i][0])*(p[j][0]-p[i][0]) + (p[j][1]-p[i][1])*(p[j][1]-p[i][1]));
          if(dist<min){
            min=dist;
          }
      }
    }
    System.out.println(min);
  }
}
