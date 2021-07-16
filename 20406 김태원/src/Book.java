
public class Book {
	String name;
	String author;
	int price;
	private double discount = 0.1 ;
	
	Book(String name , String author , int price){
		this.name = name ;
		this.author= author ;
		this.price = price ;	
	}
	public Book() {}
	//메소드
	void printbook() {
		System.out.println(name + ""+author + "" +price);
		System.out.println("할인가격:"+ (price- price * discount));
	}
	
		

}
