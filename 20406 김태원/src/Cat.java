
public class Cat extends Animal {

	public static void main(String[] args) {
	
		Animal cat = new Cat();
		// ���� <=== ���� ;������ ,upcasting
		cat.name ="�̹�";
		cat.toprint();
		
		Cat cat2=(Cat)cat;
		cat2.toprint(); 
	}

}
