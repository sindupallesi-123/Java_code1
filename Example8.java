package Java_code;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
				List<Integer>res=al.stream().sorted().collect(Collectors.toList());
				System.out.println(res);
	}

}
