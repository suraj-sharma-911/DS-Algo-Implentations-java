package dataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
import java.util.PriorityQueue;
import static java.util.stream.Collectors.toList;

//program to find k largest elements from given array
// takes 3 parameters N (number of integers), K(number large numbers to be picked) and N space separated integers.

public class priorityQ {
	public static void  main (String[] args)throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine());
		int k =Integer.parseInt(br.readLine());
		
		List<Integer>a=Stream.of(br.readLine().split(" ")).map(Integer::parseInt).collect(toList());
		
		Integer [] arr=a.toArray(new Integer[a.size()]);
		PriorityQueue<Integer> lgElements =new PriorityQueue<>(k);
		
		for(int i=0; i<arr.length; i++) {
			int temp = arr[i];
			if(i<k) {
				lgElements.add(arr[i]);
			}else {
				if(lgElements.element()<temp) {
					lgElements.remove();
					lgElements.add(temp);
					continue;
				}
			}
		}
		//for descending order
				ArrayList<Integer> ans =new ArrayList<>(lgElements);
				Collections.sort(ans, Collections.reverseOrder());
				for(int e: ans) {
					System.out.print(e+" ");
				}
		System.out.println();
		//default ascending order
		for(int i=0; i<k; i++) {
			System.out.print(lgElements.remove()+" ");
		}
		
		
		//System.out.println(lgElements.toString());
	}
}
