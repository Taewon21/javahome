
public class Dog {
	Dog(){
		System.out.println("강아지 객체를 생성");
	}
	// 생성자
	Dog(String breed, int age , String color){
		this();
		this.breed = breed ;
		this.age = age;
		this.color= color;
	}
	
	
	// 멤버 변수
	String breed;
	int age;
	String color ;
	
	//메소드
	
	void barking() {
		System.out.println(breed + "is  barking");
	}
	void hungry() {
		System.out.println(breed + "is hungry");	
	}
	void sleeping(){
		System.out.println(breed + "is sleeping");
	}
	
	String toPrint( ) {
		String str ;
		str = "(" + breed + "," + age + ","  + color + ")";
		return str ;
	}
}
