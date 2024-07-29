import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int num_sum = 0;
        while (N > 0){
            num_sum += N%10;
            N /= 10;
        }
        System.out.println(num_sum);
		
		}
}