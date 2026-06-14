package Java_code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;


public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>al=new ArrayList<String>();
		al.add("sachin");
		al.add("dhoni");
		al.add("rohith");
		al.add("mathisha");
		al.add("hardik");
		System.out.println(al);
		System.out.println("==========");
		Collections.sort(al);
		List<String>res=al.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(res);
	}

}