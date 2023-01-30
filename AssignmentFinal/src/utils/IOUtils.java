package utils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.Passbook;

public class IOUtils {
	
	public static List<Passbook> readFiles(String filename) throws Exception {
		List<Passbook> transactions = new ArrayList<>();
		File f = new File(filename);
		if (f.isFile() && f.canRead()) {
			try (Scanner fileR = new Scanner(f)) {
				while (fileR.hasNextLine()) {
					transactions.add(new Passbook(LocalDate.parse(fileR.next()), fileR.next(), fileR.nextDouble(),
							fileR.nextDouble()));
				}
				return transactions;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		throw new Exception("file either not exist or reading permission denied");
	}
	public static void storePassbook(List<Passbook> passbook, String filename)
			throws FileNotFoundException, IOException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File(filename)));
		out.writeObject(passbook);
		System.out.println("Stored");
	}
}





