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
      double max_num;
      max_num = Double.NEGATIVE_INFINITY;
      for (int i = 1; i<=10; i++){
         double num = sc.nextDouble();
         if (num > max_num) {
           max_num = num;
         }
        
      }
        int intValue = (int) max_num;
	    System.out.println("#" + tc + " " + intValue);


    }
  }
}