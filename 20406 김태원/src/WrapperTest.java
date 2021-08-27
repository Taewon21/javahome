package s20406_0827;

public class WrapperTest {

	public static void main(String[] args) {
		String s1 = "40";
		String s2 = "50";
		int i1 = Integer.parseInt(s1);//문자열을 int 형으로 변경해줌.
		int i2 = Integer.parseInt(s2);
		
		System.out.println(s1+"+"+s2+"="+(i1+i2));
		
		String s3 = "45.2";
		String s4 = "62.7";
		System.out.println(s3+"+"+s4+"="+(Double.parseDouble(s2)+Double.parseDouble(s3)));
		
		//기본타입 문자열로 바꾸기
		int a = 45;
		System.out.println(a+"");
		System.out.println(Integer.toString(a));
		
		double b = 48.2;
		System.out.println(Double.toString(b));
		
		boolean c = true;
		String ss4 = Boolean.toString(c);
		System.out.println(ss4);
		
		Integer in = 4;//AutoBoxing
		
	}

}
