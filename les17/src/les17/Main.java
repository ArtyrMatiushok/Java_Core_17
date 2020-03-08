package les17;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter array length: ");
		int length = in.nextInt();
		Integer[] arr = new Integer[length];
		for (int i = 0 ; i < arr.length; i++)
			arr[i] = (int)(Math.random()*200 - 100);
		System.out.println(Arrays.toString(arr));
		
		Collection coll = new Collection(arr);
		
		Iterator it1 = coll.createForward();
		
		while (it1.hasNext())
			it1.next();
		System.out.println();
		
		
		Iterator it2 = coll.createBackward();
		
		while (it2.hasNext())
			it2.next();
		System.out.println();
		
		Iterator it3 = coll.anonym();
		
		while (it3.hasNext())
			it3.next();
		System.out.println();
		
		Iterator it4 = coll.local();
		
		while (it4.hasNext())
			it4.next();
		System.out.println();
		
		Iterator it5 = coll.staticIterator();
		
		while (it5.hasNext())
			it5.next();
		
	}

}
