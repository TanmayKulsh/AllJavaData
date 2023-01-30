package utils;

import static java.time.LocalDate.parse;
import java.util.HashMap;
import java.util.Map;
import static com.library.app.Category.*;
import custom_exceptions.*;
import com.library.app.Book;

public class LibUtils {

	public static Map<String, Book> populateLibrarMap() {
		Map<String, Book> map = new HashMap<>();
		map.put("sc-001", new Book("bk-005", SCIENCE, 540, parse("2022-01-29"), "Riya", 10));
		map.put("sc-005", new Book("bk-001", FICTION, 510, parse("2020-01-09"), "rishal", 70));
		map.put("sc-007", new Book("bk-009", TECHNOLOGY, 570, parse("2019-01-18"), "TANMAY", 60));
		map.put("sc-002", new Book("bk-003", FICTION, 509, parse("2020-01-17"), "Priya", 51));
		map.put("sc-009", new Book("bk-004", SCIENCE, 100, parse("2020-01-19"), "supriya", 50));
		return map;
	}
	
	public static void removeBook(Map<String, Book> books, String title) throws LibrabyHandlingException {
		if (books.containsKey(title)) {
			books.remove(books.containsKey(title));
			System.out.println("Book removed");
		}
		else {
			throw new LibrabyHandlingException("weong");
		}
	}

}
