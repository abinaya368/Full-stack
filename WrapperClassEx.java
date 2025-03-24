package session5;

public class WrapperClassEx {
	
	public static void main(String[] args) {
	
		//Converting Primitive to wrapper Class-->AutoBoxing
		
		int a = Integer.valueOf(50);
		
		Integer intObj = 50; //Equivelent to integer.value(50);
		
		Character charObj = 'A';
		
		double dObj = 25.35478;
		
		System.out.println(a);
		System.out.println(intObj);
		System.out.println(charObj);
		System.out.println(dObj);
		
		System.out.println("-----------------------------------");
		
		//Converting Wrapper class to primitive
		int value1 = intObj;
		char value2 = charObj;
		double value3 = dObj;
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		//Using Utility method from Wrapper class
		
		int parseInt = Integer.parseInt("123");
		double parseDouble = Double.parseDouble("25.364782");
		boolean parseBoolean = Boolean.parseBoolean("true");
		
		System.out.println(parseInt);
		System.out.println(parseDouble);
		System.out.println(parseBoolean); 
	}

}
