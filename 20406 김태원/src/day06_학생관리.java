
public class day06_�л����� {

	public static void main(String[] args) {
		student s1 = new student();
		student s2 = new student();
		s2.name = "���ο�";
		s2.age = 18 ;
		s2.hakbun = "20408";
		s1.name = "������";
		s1.hakbun= "20406";
		s1.age  = 18;
		
		//s1.printStudent(s1.name, s1.hakbun, 17);
		s1.printStudent();
		s2.printStudent();
		
		//3��°
		student s3 = new student("����ȯ", "20300", 17);
		s3.printStudent();
		
		Book mybook = new Book("����� " ,"�����㺣�� " , 15000);
		mybook.printbook();
				
		
	}

}
