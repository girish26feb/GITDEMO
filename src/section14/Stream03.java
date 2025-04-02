package section14;

import java.util.ArrayList;
import java.util.List;

public class Stream03 {

	public static void main(String[] args) {
		//filtering element those startwith 'A' and use Limit 
	
		List<String> name = new ArrayList<String>();
		name.add("Amit");
		name.add("Ashish");
		name.add("Akash");
		name.add("pratik");
		
		name.stream().filter(p->p.startsWith("A")).sorted().limit(2).forEach(p->System.out.println(p));
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
