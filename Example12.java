package Java_code;

import java.util.ArrayList;

public class Example12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(34);
		al.add(65);
		al.add(78);
		al.add(76);
		al.add(98);
		al.add(765);
		al.add(764);
		System.out.println(al);
		System.out.println("==========");
		al.stream().forEach(i->System.out.println(i));
		System.out.println("===========");
		al.stream().forEach(System.out::println);
		
	}

}
