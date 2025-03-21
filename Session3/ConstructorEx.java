package Session3;

public class ConstructorEx {
	
	public Constructor() {
		System.out.println("Default Constructor");
	}
	
	public ConstructorEx(String name, String age) {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Parameterized Constructor");
	}
	// Bottom of Approach
	public int sum(int a, int b) {
		int res = a + b;
		return res;
	}
	
	public static void main(String[] args) {
		ConstructorEx cx = new ConstructorEx();
		ConstructorEx ce = new ConstructorEx("abinaya", "18");
		System.out.println(ce.sum(5, 10));
	}
	

}
