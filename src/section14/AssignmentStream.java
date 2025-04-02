package section14;

import java.util.Arrays;
import java.util.List;

public class AssignmentStream {

	public static void main(String[] args) {
		// unique number OR remove duplicate and aranged in assending then print firstthree.

		List<Integer> li = Arrays.asList(1, 2, 3, 4, 5, 5, 6, 6);
		li.stream().distinct().sorted().limit(03).forEach(p->System.out.println(p));
		
		
		
		
		
		
		
		
		

	}

}
