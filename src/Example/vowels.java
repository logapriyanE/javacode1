package Example;
import java.util.*;

public class vowels {

	public static void main(String[] args) {
		String a="hello to java python";
		ArrayList<String> list =new ArrayList<>(Arrays.asList(a));
		System.out.println(list);
		long a1=list.stream().filter(c->"a"==c||"i"==c||"o"==c||"e"==c||"u"==c).count();

	}

}
