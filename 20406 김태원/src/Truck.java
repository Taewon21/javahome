//자식 
public class Truck extends Cars{
	String name = " 율" ;
	Truck(){}
	Truck(String name){
		super(name);
		System.out.println("Truck 기본생성자");
		System.out.println("SUPER" + super.name);
	}
	public static void main(String[] args) {
		Truck bonggo = new Truck("봉고");
		System.out.println("내꺼"+bonggo.name);

	}

}
