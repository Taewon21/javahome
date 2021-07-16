
public class ShoppingMall {
	
	String code;
	static int total;
	
	//생성자
	ShoppingMall(String code){
		this.code = code ;
		System.out.println(code + "등록");
	}
	//기능
	void addTotal(int count){
		total+= count ;
		System.out.println("현재 총 개수: " + total);
		
		
	}
	void subTotal(int count) {
		total -= count;
		System.out.println("현재 총 개수: " + total);
		if(count > total) {
			System.out.println("수량이 부족합니다");
			return ;
		}else {
			total -= count;
			System.out.println("현재 총 재고 : " + total);
		}
	}
	
}
