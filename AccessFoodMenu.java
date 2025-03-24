package session5;

public class AccessFoodMenu implements VegItems ,NonVegItems{

	@Override
	public void fry() {
	System.out.println("Chicken fry,Mutton fry,Fish fry, prawn fry,etc...");
		
	}

	@Override
	public void gravy() {
		System.out.println("chicken gravy, mutton gravy, etc....");
		
	}

	@Override
	public void breakFast() {
		System.out.println("Idly, Dosa, Pongal etc...");
		
	}

	@Override
	public void lunch() {
		System.out.println("Tomato rice, Curd rice, Meals etc..");
		
		
	}
	
	public static void main(String[] args) {
		AccessFoodMenu afm = new AccessFoodMenu();
		afm.breakFast();
		afm.lunch();
		afm.fry();
		afm.gravy();
	}

}
