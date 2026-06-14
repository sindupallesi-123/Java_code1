package Java_code;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 {

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
		List<String>res=al.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(res);

	}

}
