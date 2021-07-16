
public class Student_OLD {
	static String school = "ROBOT";
	private String name;
	private int grade ;
	static int count ;
	
	Student_OLD(){
		count++;
	}

//메소드
	void print() {
		System.out.println(name + grade + "학년");
	}
	String print(int Grade) {
		String str = grade + "학년" + name ;
		return str;
	}

// 캡슐화 구현
	void setGrade(int grade) {
		if(grade > 3)
			System.out.println("학년 범위를 확인하세요");
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
	