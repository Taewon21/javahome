import java.util.Scanner;

public class day05_¹Ýº¹¹®1 {

	public static void main(String[] args) {
		for(int i =0 ; i< 5 ; i++)
			System.out.println(i);
		
		for(int i = 0 ; i<=10 ; i+=2)
			System.out.println(i);
		for(int i =10 ; i > 0; i -=2 )
			System.out.println(i);
		System.out.println("==========================");
	/*	int even_sum = 0, odd_sum =0;
		for(int i = 1; i <= 10 ; i++)
			if( i %2 == 0)
				even_sum +=i;
			else
				odd_sum += i;
		System.out.println("È¦¼öÀÇ ÇÕ" + odd_sum);
		System.out.println("Â¦¼öÀÇ ÇÕ" + even_sum);*/
		
		System.out.println("============================");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("N :");
		int N = sc.nextInt();
		int even_sum = 0, odd_sum =0;
		for(int i = 1 ; i<= N ; i++ )
			if(i % 2 == 0)
				even_sum += i;
			else
				odd_sum += i ;
		System.out.println("Â¦¼öÀÇ ÇÕ :" + even_sum);
		System.out.println("È¦¼öÀÇ ÇÕ :" + odd_sum);
		
	
	}

}
