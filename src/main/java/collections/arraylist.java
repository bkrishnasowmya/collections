package collections;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class arraylist {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(10);//With intial Size 10
		int choice=0,pos;
		Scanner sc = new Scanner(System.in);
		String str;
		while(choice != 5) {
		System.out.println("1.adding a element\n2.removing an element\n3.fetching an element\n4.dispalying collection of list\n5.exit\n\nenter your choice:");
		choice = sc.nextInt();
		if(choice==1) {
			System.out.print("enter a string to add : ");
			str = sc.next();
			list.add(str);
		}
		else if(choice ==2 ){
			System.out.print("enter the position to remove an element : ");
			pos = sc.nextInt();
			list.remove(pos-1);
		}
		else if(choice == 3) {
			System.out.print("enter the position to fetch an element : ");
			pos = sc.nextInt();
			System.out.println("String at position "+pos + " is "+list.get(pos-1));
			
		}
		else if(choice == 4) {
			for (String h:list ) {
				System.out.println(h);
			}
		
		}
		else {
			System.exit(0);
		}
		}
	}
		
}


