
public class ShoppingMallMain {

	public static void main(String[] args) {
		ShoppingMall tv = new ShoppingMall("LG 651");
		tv.addTotal(10);
		tv.subTotal(4);
		
		ShoppingMall mp3 = new ShoppingMall("아이러버");
		mp3.addTotal(100);
		mp3.subTotal(200);
	}

}
