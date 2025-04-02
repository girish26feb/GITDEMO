package section14;

import java.util.ArrayList;
import java.util.List;

public class Strem02 {

	public static void main(String[] args) {
	
 //find words startswith 'A'from List
	
  List<String> name =new ArrayList<String>();
  name.add("Girish");
  name.add("Ashish");
  name.add("om");
  name.add("pratik");
  name.add("subhash");
  
  name.stream().filter(p->p.startsWith("A")).forEach(P->System.out.println(P));
  
  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
