package program.Collections;

import java.util.ArrayList;
import java.util.List;

public class JoinTwoLists {
public static void main(String[] args) {
	List<String> l1 = new ArrayList<String>();
	l1.add("ABDUL");
	ArrayList<String> l2 = new ArrayList<String>();
	l2.add("Badi");
	
	List<String> join = new ArrayList<String>();
	join.addAll(l1);
	join.addAll(l2);
	
	System.out.println(l1);
	System.out.println(l2);
	System.out.println(join);


}
}
