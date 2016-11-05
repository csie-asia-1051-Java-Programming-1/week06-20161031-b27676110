package ex;
/*
 * Topic: 使用者輸入兩個整數，透過函數呼叫輸出排列組合函數 C(m,n)。公式: C(m,n) = m!/n!(m-n)!

 * Date: 2016/10/31
 * Author: 105021036 鄭東欣
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		fun1(m,n);}
		public static void fun1(int m,int n){
			int sum = 1;
			int val = 1;
			int fun = 1;
			for(int i =1;i<=m;i++){
				sum = sum*i;
			}
			for(int i = 1;i<=n;i++){
				val = val*i;
			}
			for(int i = 1;i<=m-n;i++){
				fun = fun*i;
			}
			System.out.println(sum/(val*fun));
		}

}


