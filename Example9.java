package Java_code;

import java.util.ArrayList;
import java.util.Collections;

public class Example9 {

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
		System.out.println(al);
	}

}
