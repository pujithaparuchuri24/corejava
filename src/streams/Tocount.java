package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Tocount {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("pujitha");
		a.add("hema");
		a.add("pujitha");
		Map<String, Long> s=a.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(s.keySet());// how many times repeat the string 
		Set<String> m= a.stream().collect(Collectors.collectingAndThen(Collectors.toSet(),Collections::<String>unmodifiableSet));
		//  m.remove("hema");//it is used for doing an additional operation afetr collecting the data (result)...
		System.out.println(m);
		Map<String,String> m1=m.stream().collect(Collectors.toMap(l->l.toString(), l->(String)l.toString().toUpperCase()));
		System.out.println(m1);
		String string="puji";
		//hi  
	}

}