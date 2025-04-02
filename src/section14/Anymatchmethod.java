package section14;

import java.util.ArrayList;
import java.util.List;

public class Anymatchmethod {

	public static void main(String[] args) {
	
	//use of anymatch method

List<String>names =new ArrayList<String>();
names.add("om");
names.add("shubham");
names.add("Amit");
names.add("manish");
names.add("chitra");

Boolean bb=names.stream().anyMatch(p->p.startsWith("A"));
System.out.println(bb);



























	}

}
