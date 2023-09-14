package bit701.day0914;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex8_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Set<String> set=new HashSet<>();
		Set<String> set=new TreeSet<>();//순서대로 나옴
		set.add("red");
		set.add("blue");
		set.add("red");
		set.add("red");
		set.add("green");
		set.add("yellow");
		set.add("blue");
		set.add("red");
		set.add("yellow");
		set.add("green");
		set.add("red");
		System.out.println(set.size());//중복된거 뺴고 4개
		
		for(String s:set)
			System.out.println(s);
	}

}
