package java8.streams;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class TestStreams {

	public static void main(String[] args) {

ArrayList<String>list=new ArrayList();
list.add("Hello");
list.add("Nature");
list.add("Have a Good");
list.add("Day");

//using an iterator
Iterator<String>iter =list.iterator();
while(iter.hasNext())
{
	String element = iter.next();
	System.out.println(element);
}

System.out.println();


//by using streams without creating iterator or enchanced we 
//access the list
list.stream().forEach(System.out::println);
//stream has 3 operations 1 filter(Predicate Interface)
//2 map function (Function Interface) 3.terminal operation (Consumer Interface)
Consumer<String>consumer=(String str)->{System.out.println(str);};
Consumer<String>con1 = (String str)->{System.out.println(str);};



List<String>letterGlist =  list.stream().filter(e ->(e.charAt(0)=='g')).collect(Collectors.toList());

System.out.println(letterGlist);


Predicate<String>testG=(String str)->
{
	return (str.charAt(0)=='H');
};

letterGlist =  list.stream().filter(testG).collect(Collectors.toList());

System.out.println(letterGlist);
/*List<String>letterlengthlist = list.stream().filter(e ->(e.length()>4)).collect(Collectors.toList());

System.out.println(letterlengthlist);

list.stream().map(e->e.toUpperCase()).forEach(consumer);

Function<String,String>upperCaseFunction = (e)->{
	return e.toUpperCase();
};

list.stream().map(upperCaseFunction).forEach(consumer);

// first 3 characters in a string
list.stream().map(e->e.substring(0,3)).forEach(consumer);
*/





















	}

}
