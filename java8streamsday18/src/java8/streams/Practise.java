package java8.streams;

import java.util.Arrays;
import java.util.List;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> value = Arrays.asList(1,2,3,4,5,6,7);
		
		for(int i:value)
		{
			System.out.println(i);
		}
		
		System.out.println("with new");
		
		for(int i=0;i<value.size();i++)
		{
			System.out.println(value.get(i));
		}
		
		
		
		
		
	}

}
