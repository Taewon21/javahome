package s20406_0827;

public class StringTest {

	public static void main(String[] args) {
		//string 클래스 : 문자열
		String s1 = "자바";
		String s2 = "자바";
		String s3 = new String("JAVA");
		String s4 = new String("JAVA");
		
		if(s1==s2)
			System.out.println("상수정의 : 같습니다.");
		else
			System.out.println("상수정의: 다릅니다.");
		if(s3==s4)
			System.out.println("생성자정의 : 같습니다.");
		else
			System.out.println("생성자정의: 다릅니다.");
		//글자비교
		if(s1.equals(s2)==true)
			System.out.println("같음");
		else
			System.out.println("다름");
		
		//s2와 ㄴ3의 글자 비교해서 출력
		if(s2.equals(s3)==true)
			System.out.println("같음");
		else
			System.out.println("다름");
		System.out.println("안녕하세요.".length());
		System.out.println("안녕하세요.".charAt(2));
		String s5 = "서울로봇고등학교";     
		for(int i = 0 ; i<s5.length();i++) {
			System.out.println(s5.charAt(i));
		}	
			String s6 ="     안녕  홍길동   ";
			System.out.println(s6+"안녕");
			System.out.println(s6.trim()+"안녕");
			
			
			String s7 = "저는 서울로봇고 학생입니다.";
			System.out.println(s7.substring(3, 8));
			System.out.println(s7.substring(9));
			
			String man = "20040201-3";
			String yy = man.substring(0,2);
			String gu = man.substring(7,8);
			if(man.charAt(9)%2==1)
				System.out.println("남자입니다");
			else
				System.out.println("여자입니다");
			System.out.print(man.substring(0,4)+"년");
			System.out.print(man.substring(4, 6)+"월");
			System.out.println(man.substring(6,8)+"일에 태어났습니다");
			if(gu.equals("1")||gu.equals("2"))
				yy ="19"+yy;
			else
				yy = "20" +yy;
			if(gu.equals("1")||gu.equals("3"))
				gu = "남자";
			else if (gu.equals("2")||gu.equals("4"))
				gu ="여자";
			else
				gu="넌 누구니?";
			System.out.println(yy+"년");
			
			
			
			
	}

}
