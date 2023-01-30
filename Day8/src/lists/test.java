package lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		String[] data = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "three", "six","four" };
		
		// creating a new array list named strList
		ArrayList<String> strList = new ArrayList<String>();

		// populating the arrayList
		for (String i : data) {
			strList.add(i);
		}
		System.out.println("elements of AL : "+strList);
//		Collections.sort(strList);
//		System.out.println("elements of AL after sorting : "+strList);
		
		//displaying elements of list using for each loop
		for(String s: strList) {
			System.out.println(s);
		}
		
		//Accept a sti=ring from the user (Using Scanner)
		// if it exists in the list, display the index of its 1'st occurance.
		//Otherwise print a mesg : doesn't exist
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to be checked in the list");
		String str = sc.next();
		System.out.println(strList.contains(str)? "index of element : "+strList.indexOf(str):"doesn't exist");
		
		
		//Upper case all the Strings from the arrayList ,which starts with  char 't'
		//Display the list contents again
		for(int i=0;i<strList.size();i++) {
			if(strList.get(i).startsWith("t")){
				strList.set(i, strList.get(i).toUpperCase());
			}
		}
		System.out.println("elements of AL after ops 4.4 : "+strList);
		
		
//		//4.5 Accept index from user
//		Remove the string at a specified index.
		System.out.println("enter the index from you want to remove element");
		int index = sc.nextInt();
		if(index<strList.size())
		strList.remove(index);
		else
			System.out.println("invalid index");
		System.out.println("elements of AL after removing the element at index "+index+"  : \n"+strList);
		
		
//		4.6 Create another arraylist , having the same contents of the earlier list
//		Display it's contents
		ArrayList<String> strList2 = new ArrayList<>(strList);
		System.out.println("thisssssssssssssssssssssss");
		System.out.println("elements of AL 2 : "+strList2);

		
//		4.7 Sort 1st arraylist.
//		Display contents of both of the arraylist
		Collections.sort(strList);
		System.out.println("sorted AL 1 : "+strList);
		
		//BY ITERATING
//		4.8 Remove all the strings from the 2nd list , containing a char 'e'
//		Display it !
		
//		for(int i=0;i<strList.size();i++) {
//			if(strList.get(i).contains("e") || strList.get(i).contains("E")){
//				strList.remove(i);
//				i--;
//			}
//		}
//		System.out.println("elements of AL after deleting all string containing 'e' or 'E': \n"+strList);
		
		//by itrable class
		

		Iterable<String> Yo = new Iterable<String>() {

			@Override
			public Iterator<String> iterator() {
				// TODO Auto-generated method stub
				return null;
			}
			
			
		};
		
		
		
		
		
		
		
	}
}