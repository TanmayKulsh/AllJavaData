package tester;

import java.util.Scanner;
import static utils.IOutils.*;
import java.util.Map;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

import com.library.app.Book;

public class LibraryTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		try (Scanner sc = new Scanner(System.in);) {
			
			System.out.println("Enter the name to restore the data");
			String filename = sc.nextLine();

			// restore data
			Map<String, Book> library = reStoreLibraryDetails(filename);

			boolean exit = false;
			
			while(!exit){
				try {
					switch (sc.next())
					
				case 1:
				for(Book b : library.values())
					System.out.println(b);
					break;
			
				case 2:
					System.out.println("ENter the book title");
					Book removedBook = library.remove(sc.next());
					if(removedBook == null)
						throw new libraryHandlingException("");
					
					//remove a book
						break;
				}
				
			}
			
			
			
			
			
			
			
			
			
			

			//display map
			System.out.println("Lib contains ");
			for (Book b : library.values()) {
				System.out.println(b);
			}
			
			//Store books
			storeLibraryDetails(filename, library);
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
