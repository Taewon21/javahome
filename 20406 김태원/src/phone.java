
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
	//�޼ҵ�
	 String toprint() {
		 System.out.println("������� �� "+ total + "���� ������");
		 return(price+"����¥��" + model + " ����Ʈ��");
		 
	 }
	 
	 
	 
}
