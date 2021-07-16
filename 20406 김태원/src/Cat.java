
public class Cat extends Animal {

	public static void main(String[] args) {
	
		Animal cat = new Cat();
		// 상위 <=== 하위 ;묵시적 ,upcasting
		cat.name ="미미";
		cat.toprint();
		
		Cat cat2=(Cat)cat;
		cat2.toprint(); 
	}

}
