
public class Student_OLD {
	static String school = "ROBOT";
	private String name;
	private int grade ;
	static int count ;
	
	Student_OLD(){
		count++;
	}

//�޼ҵ�
	void print() {
		System.out.println(name + grade + "�г�");
	}
	String print(int Grade) {
		String str = grade + "�г�" + name ;
		return str;
	}

// ĸ��ȭ ����
	void setGrade(int grade) {
		if(grade > 3)
			System.out.println("�г� ������ Ȯ���ϼ���");
		this.grade =grade ;
	}
	int  getGrade() {
		return this.grade;
	}
	
	void setName(String name) {
		this.name = name ;
	}
	String getName() {
		return this.name ;
	}
}
	