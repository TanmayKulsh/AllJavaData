package utils;

import static com.app.Passbook.dt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.app.Passbook;

public class IOUtils2 {

	public static List<Passbook> readFiles2(String filename) throws IOException, NumberFormatException, ParseException {
		BufferedReader br = new BufferedReader(new FileReader(filename));
		//bufferreader to read lines
		String str = br.readLine();
		List<Passbook> list = new ArrayList<Passbook>();
		String[] arr = null;

		while ((str = br.readLine()) != null) {
			//spliting the string to store in array
			arr = str.split(",");
			//after spliting the values wii be converted and stored in array of strings
			list.add(new Passbook(LocalDate.parse(arr[0], dt), arr[1], Double.parseDouble(arr[2]),
					Double.parseDouble(arr[3])));
		}

		br.close();
		return list;
	}
	
	public static void storePassBook(List<Passbook> list,String filename) throws FileNotFoundException, IOException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File(filename)));	
		out.writeObject(list);
		System.out.println("stored");
	}
	public static List<Passbook> reStorePassbook(String filename) throws FileNotFoundException, Exception{
		File f = new File(filename);
		ObjectInputStream oin = new ObjectInputStream(new FileInputStream(f));
		return (List<Passbook>)oin.readObject();
	}
	
}
