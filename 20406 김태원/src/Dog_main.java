
public class Dog_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog  dog1 = new Dog();
		dog1.breed ="Ǫ��" ;
		dog1.age = 1 ;
		dog1.color ="������" ;
		
	    Dog dog2 = new Dog();
	    dog2.breed ="�ҵ�";
	    dog2.age = 4 ;
	    dog2.color ="����";
	    
	    System.out.println(dog1.toPrint());
	    System.out.println(dog2.toPrint());
	    
	    dog1.barking();
	    dog2.hungry();
	    dog1.sleeping();
	    
	    Dog dog3 = new Dog("ġ�Ϳ�" , 2 , "����");
	    dog3.hungry();
	    

		
	}

}
