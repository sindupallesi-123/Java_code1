package Java_code;

import java.util.ArrayList;

public class Example6 {

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
		long count=al.stream().filter(s->s.length()==5).count();             
		System.out.println(count);
		
	}

}
