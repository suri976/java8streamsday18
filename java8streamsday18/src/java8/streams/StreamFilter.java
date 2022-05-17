package java8.streams;
import java.util.*;  
import java.util.stream.Collectors;

public class StreamFilter {

	
	
	    public static void main(String[] args) {
	    	
	        List<Integer> productsList = new ArrayList<>();  
	        //Adding 
	        productsList.add(234);
	        productsList.add(356);
	        productsList.add(456);
	        productsList.add(234);
	        productsList.add(567);
	        
	       //products >400
	        List<Integer> productPriceList2 = productsList.stream().filter(p -> (p > 400)).collect(Collectors.toList());
	        System.out.println(productPriceList2);
	        
	       // productsList.stream().forEach(System.out::println);
	        //products >300
	       List<Integer> p1= productsList.stream().filter(p-> (p>300)).collect(Collectors.toList());
	        System.out.println(p1);
	       
	    //..........terminal methods   
	        //max element 
	      int x= productsList.stream().max(Integer :: compare).get();	
	      System.out.println("Min Value:"+x);
	      
	      
	      //min value  
	   int minValue = productsList.stream().max(Comparator.reverseOrder()).get();
	   System.out.println("Max Value:"+minValue+"\n") ;   	
	    
	   //Max String in Sentence
	   List<String>Sentence = new ArrayList<>();
	   Sentence.add("Man is an");
	   Sentence.add("hazardous to environment");
	   System.out.println(Sentence);
	    String max= Sentence.stream().max(Comparator.comparing(String::valueOf)).get(); 
	    System.out.println("Max String in Sentence:"+max);
	    
	    //sum
	    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
	    Integer sum = integers.stream().mapToInt(Integer::intValue).sum();
	    System.out.println(sum);
	    
	    List<Double> doubles = Arrays.asList(1.2, 2.3, 3.3, 4.2, 5.0);
	    double doublesum = doubles.stream().mapToDouble(Double::floatValue).sum();
	    System.out.println("double sum :"+ doublesum);
	    
	                                     
	         
	    }  
	}  


