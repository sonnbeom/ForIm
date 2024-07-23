import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 개수

        for (int t = 1; t <= T; t++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            
            String result;
            if (num1 < num2) {
                result = "<";
            } else if (num1 > num2) {
                result = ">";
            } else {
                result = "=";
            }
            
            System.out.println("#" + t + " " + result);
        }

        sc.close();
    }
}