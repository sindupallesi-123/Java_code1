package Java_code;
import java.util.ArrayList;

public class Example3 {

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
		ArrayList<String>res=new ArrayList<String>();
		for(int i=0;i<al.size();i++) {
			res.add(al.get(i).toUpperCase());
			
		}
		System.out.println(res);
		

	}

}
