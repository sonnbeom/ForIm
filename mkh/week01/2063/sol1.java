import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.io.FileInputStream;
class Solution
{
  public static void main(String args[]) throws Exception
  {
    Scanner sc = new Scanner(System.in);
    int T;
    T=sc.nextInt();
    ArrayList arr = new ArrayList();
    for(int tc = 1; tc <= T; tc++)
    {
      arr.add(sc.nextInt());
    }
    arr.sort(Comparator.naturalOrder());
    System.out.println(arr.get((T-1)/2));
  }
}