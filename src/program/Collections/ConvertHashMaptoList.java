package program.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConvertHashMaptoList {
public static void main(String[] args) {
	HashMap<Integer, String> map = new HashMap<>();
	map.put(1, "a");
    map.put(2, "b");
    map.put(3, "c");
    map.put(4, "d");
    map.put(5, "e");
    List<Integer> keys = new ArrayList<>(map.keySet());
    List<String> values = new ArrayList<>(map.values());
    
    System.out.println(keys);
    System.out.println(values);
}
}
