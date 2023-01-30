package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.io.File;

import com.library.app.Book;

public class IOutils {
	public static void storeLibraryDetails(String filename, Map<String, Book> books) throws IOException {

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
			out.writeObject(books);
			System.out.println("Stored book details successfully !");

		}
	}

	// add a static method to return populated map having sample data if file doesnt
	// exist
	// ow ret the map restored from bin file
	@SuppressWarnings("unchecked")
	public static Map<String, Book> reStoreLibraryDetails(String filename) throws ClassNotFoundException, IOException {

		File f1 = new File(filename);
		if (f1.isFile() && f1.canRead()) {
			try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(f1))) {
				return (Map<String, Book>) in.readObject(); // rets map with data from bin file
			}
		} else
			return LibUtils.populateLibrarMap();
	}
}
