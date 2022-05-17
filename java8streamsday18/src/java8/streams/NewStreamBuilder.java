package java8.streams;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NewStreamBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> fruits = new ArrayList();
		fruits.add("mango");
		fruits.add("grapes");
		fruits.add("aplpe");
		fruits.stream().forEach(System.out::println);
		
//fruits.stream(String str).filter(e->e.)
		
		
List list=new ArrayList();
		
		list.add(2000);
		list.add(34122);
		list.add(24752);
		list.add(2234);

		list.add(2000);
		
	list.stream().distinct().forEach(System.out::println);
		
	}

}
