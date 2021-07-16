
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_OLD kim = new Student_OLD();
		kim.school = "서울예고";
		System.out.println(kim.school);
		Student_OLD jang = new Student_OLD();
		Student_OLD choi = new Student_OLD();
		Student_OLD bak = new Student_OLD();
		System.out.println(bak.school);
		System.out.println("생성된 학생수는 " + kim.count);
	}

}
