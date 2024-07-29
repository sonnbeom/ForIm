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
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      if (n1 > n2) {
        System.out.print("#" + tc + " " + ">"+'\n');
          }else if (n1==n2){
        System.out.print("#" + tc + " " + "="+'\n');
          }else {
        System.out.print("#" + tc + " " + "<"+'\n');
          }

    }
  }
}