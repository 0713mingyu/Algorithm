package date20220113;

import java.util.Scanner;

public class baekjoon_10870 {
	public static void main(String[] args) {
		int input;
		
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt(); // �Է°��� 0 ~ 20����
		
		System.out.println(fibo(input));
		
	}
	// start ���۰�, input ã�� ��ġ, arr ��� ����
	public static int fibo(int input) {
		if(input == 0) {
			return 0;
		}else if(input == 1) {
			return 1;
		}
		return fibo(input-1) + fibo(input - 2);
	}
}
