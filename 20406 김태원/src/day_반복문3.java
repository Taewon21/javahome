import java.util.Scanner;

public class day_반복문3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.print("N :");
		int N ;
		N = sc.nextInt();
		if(N == 3|| N== 6 || N==9)
			continue;
		if(N == 0)
			break;
		else if(N%3==0)
			System.out.println(N+ "은 3의 배수" );
		else
			System.out.println(N + "은 3의 배수아님");
		}
		System.out.println("System down~");

	}

}
