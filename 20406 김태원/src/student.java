
public class student {
	
	// ������ - ��������
	student(String name , String hakbun , int age){
		this.name = name ;
		this.hakbun = hakbun;
		this.age =age;
	}
	public student() {}
	//�Ӽ�
	String name ;
	String hakbun;
	int age;
	private String jumin;
	// �޼ҵ�
	void printStudent(String name , String hakbun , int age){
		System.out.println("�л��̸� :" +name);
		System.out.println("�й� :" +hakbun);
		System.out.println("���� :" + age);
		
	}
	
	void printStudent() {
		System.out.println("�л��̸� :" + name);
		System.out.println("�й� :" + hakbun);
		System.out.println("����:" + age);
	}
}
