package hw;
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("1.男性2.女性再輸入身高");
		float n = scn.nextFloat();
		float h = scn.nextFloat();
		System.out.print(fun(n,h));
		}
	public static float fun(float n , float h){
		float a = 0;
		if(n==1){
			a = (h-170)*0.6f+62;
		}
		if(n==2){
			a = (h-158)*0.5f+52;
		}
		return a;

	}

}
