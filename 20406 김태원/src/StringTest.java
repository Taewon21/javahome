package s20406_0827;

public class StringTest {

	public static void main(String[] args) {
		//string Ŭ���� : ���ڿ�
		String s1 = "�ڹ�";
		String s2 = "�ڹ�";
		String s3 = new String("JAVA");
		String s4 = new String("JAVA");
		
		if(s1==s2)
			System.out.println("������� : �����ϴ�.");
		else
			System.out.println("�������: �ٸ��ϴ�.");
		if(s3==s4)
			System.out.println("���������� : �����ϴ�.");
		else
			System.out.println("����������: �ٸ��ϴ�.");
		//���ں�
		if(s1.equals(s2)==true)
			System.out.println("����");
		else
			System.out.println("�ٸ�");
		
		//s2�� ��3�� ���� ���ؼ� ���
		if(s2.equals(s3)==true)
			System.out.println("����");
		else
			System.out.println("�ٸ�");
		System.out.println("�ȳ��ϼ���.".length());
		System.out.println("�ȳ��ϼ���.".charAt(2));
		String s5 = "����κ�����б�";     
		for(int i = 0 ; i<s5.length();i++) {
			System.out.println(s5.charAt(i));
		}	
			String s6 ="     �ȳ�  ȫ�浿   ";
			System.out.println(s6+"�ȳ�");
			System.out.println(s6.trim()+"�ȳ�");
			
			
			String s7 = "���� ����κ��� �л��Դϴ�.";
			System.out.println(s7.substring(3, 8));
			System.out.println(s7.substring(9));
			
			String man = "20040201-3";
			String yy = man.substring(0,2);
			String gu = man.substring(7,8);
			if(man.charAt(9)%2==1)
				System.out.println("�����Դϴ�");
			else
				System.out.println("�����Դϴ�");
			System.out.print(man.substring(0,4)+"��");
			System.out.print(man.substring(4, 6)+"��");
			System.out.println(man.substring(6,8)+"�Ͽ� �¾���ϴ�");
			if(gu.equals("1")||gu.equals("2"))
				yy ="19"+yy;
			else
				yy = "20" +yy;
			if(gu.equals("1")||gu.equals("3"))
				gu = "����";
			else if (gu.equals("2")||gu.equals("4"))
				gu ="����";
			else
				gu="�� ������?";
			System.out.println(yy+"��");
			
			
			
			
	}

}
