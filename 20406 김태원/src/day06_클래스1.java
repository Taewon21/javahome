
public class day06_Ŭ����1 {

	public static void main(String[] args) {
			Car myCar1 = new Car();
			myCar1.������ = "���¿�" ;
			myCar1.����  = "BLUE";
			myCar1.����ȸ��= "����";
			myCar1.�����ϴ�();
			myCar1.�޸���();

			Car redCar = new Car();
			redCar.������ =  "���±�" ;
			redCar.���� = "RED" ;
			redCar.�޸���();
			
			myCar1.�޸���();
			redCar.�޸���();
	}

}



//--------------------------------

class Car{
	String ������;
	String ����;
	String ����ȸ��;
	
	//�޼ҵ�
	void �޸���() {
		System.out.println(������ + ����+"�޸��� ��");
	}
	
	void �����ϴ�() {
		System.out.println(������ + ����+"������");
	}
}