
public class day06_학생관리 {

	public static void main(String[] args) {
		student s1 = new student();
		student s2 = new student();
		s2.name = "뮨인원";
		s2.age = 18 ;
		s2.hakbun = "20408";
		s1.name = "김태현";
		s1.hakbun= "20406";
		s1.age  = 18;
		
		//s1.printStudent(s1.name, s1.hakbun, 17);
		s1.printStudent();
		s2.printStudent();
		
		//3번째
		student s3 = new student("나밀환", "20300", 17);
		s3.printStudent();
		
		Book mybook = new Book("어린왕자 " ,"생텍쥐베리 " , 15000);
		mybook.printbook();
				
		
	}

}
