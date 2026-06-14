package Java_code;

import java.util.ArrayList;

public class Example11 {

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
		String min=al.stream().min((s1,s2)->s1.compareTo(s2)).get();
		System.out.println("the min valued String is="+min);
		System.out.println("==========");
		String max=al.stream().max((s1,s2)->s1.compareTo(s2)).get();
		System.out.println("the max valued String is="+max);
		

	}

}
