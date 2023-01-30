package util;

import static enums.Status.valueOf;
import static enums.Status.values;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.app.Task;

import custumException.TaskManagerException;
import enums.Status;

public class Utils {
	
	public static List<Task> populateTasks(){
		List<Task> list = new ArrayList<Task>();
		System.out.println("In populate list");
		list.add(new Task("football", "Game", LocalDate.parse("2022-10-22")));
		list.add(new Task("friends", "TV", LocalDate.parse("2021-01-12")));
		list.add(new Task("Account", "Bank", LocalDate.parse("2019-11-02")));
		list.add(new Task("Ac", "Appliance", LocalDate.parse("2020-05-03")));
		
		
		return list;
	}

	public static Status parseAndValidateStatus(String status) {
		values();
	    return valueOf(status);
	}
	
	public static Integer validateID (int id,List<Task> list) throws TaskManagerException {
		System.out.println("Validating Id");
		Task tk = new Task(id);
		if(list.contains(tk)) {
			return id;
		}
		else {
			throw new TaskManagerException("Invalid Id");
		}
	}
}
