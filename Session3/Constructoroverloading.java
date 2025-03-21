package Session3;


public class Constructoroverloading {
	
	private String empname;
	private int empid;
	private String location;
	
	
	public Constructoroverloading(String empname, int empid, String location) {
		this.empname = empname;
		this.empid = empid;
		this.location= location;
		
	public Constructoroverloading(String empname, String location) {
		this(empname,0,location);
	}
	
	public Constructoroverloading(String empname, int empid) {
		this(empname,empid,null);
	}
	public void displayInfo() {
		System.out.println("EmpName: "+this.empname);
		System.out.println("EmpId: "+this.empid);
		System.out.println("Emp Location: "+this.location);
	}
	
	
	
	public static void main(String[] args) {
		Constructoroverloading cox = new Constructoroverloading("Abinaya",  908544, "vellore" ) ;
		Constructoroverloading cox1 = new Constructoroverloading("nithu", 1, "coimbatore");
		Constructoroverloading cox2 = new Constructoroverloading("mumu", 333, "trichy");
			cox.displayInfo();
			cox1.displayInfo();
			cox2.displayInfo();
		
	}	
		
	
	
	
	}
	}
