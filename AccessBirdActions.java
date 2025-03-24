package session5;

public class AccessBirdActions extends Bird implements Flyable{

	@Override
	public void fly() {
		System.out.println("Bird Flys...");
		
	}
	
	public static void main(String[] args) {
		
		 AccessBirdActions aba = new  AccessBirdActions();
		 aba.eat();
		 aba.fly();
		
	}

}
