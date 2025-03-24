package session5;

public class AbstractWEmployee1 extends AbstractEmployeeEx {
	
	
	public void futureDestination() {
		System.out.println("Full Stack Developer");
	}
	
	public static void main(String[] args) {
		AbstractWEmployee1 ae = new AbstractWEmployee1();
		ae.name();
		ae.destination();
		ae.futureDestination();
		
	}

}
