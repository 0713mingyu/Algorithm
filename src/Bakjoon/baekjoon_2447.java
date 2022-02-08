package Bakjoon;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon_2447 {
	static char[][] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		arr = new char[n][n];
		
		for(int i = 0; i < n ; i++) {
			Arrays.fill(arr[i], ' ');
		}
		
		solve(0, 0, n);
		
		StringBuilder sb = new StringBuilder();
		
		
		
		for(int i = 0; i < n; i ++) {
			for(int j = 0; j < n; j++) {
				sb.append(arr[i][j]);
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	public static void solve(int x, int y, int n) {
		if(n == 1) {
			arr[x][y] = '*';
			return;
		}
		
		int value = n/3;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == 1 && j == 1) {
					continue;
				}else {
					solve(x + i*value, y + j*value , value);
				}
			}
		}
	}
}
