package Session7;
import java.util.*; 

public class CollectionEx {

	//Adding and accessing Elements in a collection
	
	public static void main(String[] args) {
		//List example
		List<String> list = new ArrayList<>();
		
		list.add("java");
		list.add("Python");
		list.add("Node");
		
	
		System.out.println("List: "+list);
		
		
		list.add(1, "React");
		System.out.println("Original list: "+list);
		
		//add data in specific index
		list.add(1, "React");
		System.out.println("After adding: "+list );
		
		//Remove an element
		list.remove("Node");
		System.out.println("After removing: "+list);
		
		//Set Example
		
		Set<String> set = new HashSet<>();
		
		set.add("Yamaha");
		set.add("RE");
		set.add("Jawa");
		
		System.out.println("Set: "+set);
		
		//Map Example
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1,  "Mugilan");
		map.put(2,  "Moses sir");
		map.put(3, "Sudhesh");
		
		System.out.println("Map: "+map);
		
	
	}
}
