
public class Dog_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog  dog1 = new Dog();
		dog1.breed ="푸들" ;
		dog1.age = 1 ;
		dog1.color ="오렌지" ;
		
	    Dog dog2 = new Dog();
	    dog2.breed ="불독";
	    dog2.age = 4 ;
	    dog2.color ="검정";
	    
	    System.out.println(dog1.toPrint());
	    System.out.println(dog2.toPrint());
	    
	    dog1.barking();
	    dog2.hungry();
	    dog1.sleeping();
	    
	    Dog dog3 = new Dog("치와와" , 2 , "갈색");
	    dog3.hungry();
	    

		
	}

}
