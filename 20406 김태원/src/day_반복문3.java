import java.util.Scanner;

public class day_�ݺ���3 {

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
			System.out.println(N+ "�� 3�� ���" );
		else
			System.out.println(N + "�� 3�� ����ƴ�");
		}
		System.out.println("System down~");

	}

}
