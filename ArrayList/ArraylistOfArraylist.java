package ArrayList;

import java.util.*;
public class ArraylistOfArraylist{
	public static void main(String[] args)
	{
		int n = 3;

		// Here aList is an ArrayList of ArrayLists
		ArrayList<ArrayList<Integer> > aList =
				new ArrayList<ArrayList<Integer> >(n);

		// Create n lists one by one and append to the
		// master list (ArrayList of ArrayList)
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		aList.add(a1);

		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(5);
		aList.add(a2);

		ArrayList<Integer> a3 = new ArrayList<Integer>();
		a3.add(10);
		a3.add(20);
		a3.add(30);
		aList.add(a3);

		ArrayList<Integer> a4 = new ArrayList<Integer>();
		a4.add(20);
		a4.add(10);
		a4.add(30);
		aList.add(a4);

        // System.out.println("Ans:"+aList);

		for (int i = 0; i < aList.size(); i++) {
			for (int j = 0; j < aList.get(i).size(); j++) {
				System.out.print(aList.get(j) + " ");
			}
			System.out.println();
		}
	}
}
