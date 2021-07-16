
public class phone {
	
	String model;
	int price;
	static int total;
	phone(){ total++;}
	phone(String model , int price){
		total++;
		this.model = model ;
		this.price = price ;
		
	}
	//메소드
	 String toprint() {
		 System.out.println("현재까지 총 "+ total + "개의 폰있음");
		 return(price+"만원짜리" + model + " 스마트폰");
		 
	 }
	 
	 
	 
}
