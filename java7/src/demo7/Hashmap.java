package demo7;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmap {
		public static void main(String[] args) {
			HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
			map.put(115, 10);
			map.put(215, 1);
			map.put(null, 21 );
			map.put(2,null);
			map.put(103, 18);
			map.put(345, 56);
			map.put(null,null);
			for(Entry <Integer, Integer> m : map.entrySet()) {
			System.out.println("Key: "+m.getKey()+ "Value: "+m.getValue());
			}
			map.remove(103);
			System.out.println(map);
			for(Entry <Integer, Integer> m : map.entrySet()) {
				System.out.println("Key: "+m.getKey()+ "Value: "+m.getValue());
			}
			}
		}

