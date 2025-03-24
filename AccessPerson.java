package session5;

public class AccessPerson {
	
	public static void main(String[] args) {
		//original person Object
		person OriginalPerson = new person("Mugilan", 27);
		
	//Copied Person Object	
	 person copiedPerson = new person(OriginalPerson);  //Object Dependency 
	 
	 System.out.println("Original Person");
	OriginalPerson.displayInfo();
	
	System.out.println("Copied person");
	copiedPerson.displayInfo();
	}
	

}
