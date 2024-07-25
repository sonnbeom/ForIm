import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		int num;
		
		T=sc.nextInt();
					
		for(int tc = 1; tc <= T; tc++){
			int sum = 0;
			for (int i = 0; i < 10; i++) {
				num = sc.nextInt();
				if (num % 2 ==1) {
					sum +=num;
				}
			}
            System.out.println("#" + tc + " " + sum);
		}
	}
}