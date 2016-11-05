package hw;
import java.util.Scanner;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("先輸入溫度再輸入1:華視轉攝氏2:攝氏轉華視");
		float v1 = scn.nextFloat();
		float type = scn.nextFloat();
		System.out.println(fun(v1, type));
		}
	public static float fun(float v1, float type){
		float a = 0;
		if(type == 1){
			a = (v1-32)*5/9;
			
		}else{
			if(type == 2){
				a = (v1*(9/5)+32);
			}
			
			
		}
		return a;
	

}}
