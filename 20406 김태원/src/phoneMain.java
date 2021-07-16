
public class phoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		phone p1 = new phone();
		p1.model = "S21" ;
		p1.price = 200 ;
		System.out.println(p1.toprint());
		
		phone p2 = new phone();
		p2.model = "v50";
		p2.price = 85;
		System.out.println(p2.toprint());
		
		phone p3 = new phone("NOTE21" , 120);
		System.out.println(p3.toprint());
	}

}
