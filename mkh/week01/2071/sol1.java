import java.util.Scanner;
import java.io.FileInputStream;
class Solution
{
  public static void main(String args[]) throws Exception
  {
    Scanner sc = new Scanner(System.in);
    int T;
    T=sc.nextInt();
    for(int tc = 1; tc <= T; tc++)
    {
            double num_sum = 0;
      for ( int i = 1; i <=10; i++){
                double num = sc.nextDouble();
                num_sum +=  num;
            }

      System.out.println("#"+tc+" "+Math.round(num_sum/10));

    }
  }
}