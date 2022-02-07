package date20220113;

import java.util.Scanner;

public class baekjoon_10872 {
	public static void main(String args[]) {
		int input = 0;
		long result = 0;
		
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		
		if(input == 0) {
			System.out.println(1);
		}else {
			result = main_process(1, input, 1);
			System.out.println(result);
		}
		sc.close();
		
		
	}
	
	public static long main_process(int start, int input, long result) {
		start++;
		if(start > input){ 
			return result;
		}else {
			result = result * start;
			return main_process(start, input, result);
		}
	}
}



//실행 단축키 ctrl + F7