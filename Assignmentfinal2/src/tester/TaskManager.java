package tester;

import static enums.Status.valueOf;

import static util.Utils.parseAndValidateStatus;
import static util.Utils.populateTasks;
import static util.Utils.validateID;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.app.Task;

import enums.Status;

public class TaskManager {

	public static void main(String[] args) {

		int choice = 0;


			List<Task> tasks = populateTasks();

			do {
				Scanner sc = new Scanner(System.in);

				try {

				System.out.println("Enter your choice : ");
				System.out.println("1. for ADD a new task");
				System.out.println("2. for Delete a task");
				System.out.println("3. for UPDATE task status");
				System.out.println("4. Display all pending task for today");
				System.out.println("5. Display all tasks sorted by taskDate");
				System.out.println("6. Display all tasks sorted by Primary Key");
				System.out.println("7. Display all");
				System.out.println("10. for exit");
				choice = sc.nextInt();
				switch (choice) {

				case 1:
					System.out.println("Enter task name,description,task Date");
					tasks.add(new Task(sc.next(), sc.next(), LocalDate.parse(sc.next())));

					break;

				case 2:
					System.out.println("Enter the ID of task to be removed ");
					int id = validateID(sc.nextInt(), tasks);
					tasks.stream().filter(p -> p.getTaskId() == id).forEach(p -> p.setActive(false));
					break;

				case 3:
					System.out.println("Enter the ID ");
					int id2 = validateID(sc.nextInt(), tasks);
					System.out.println("Enter the new status");
					Status st = parseAndValidateStatus(sc.next());

					tasks.stream().filter(p -> p.getTaskId() == id2).forEach(p -> p.setStatus(st));
					break;

				case 4:
					st =  valueOf("PENDING");
					tasks.stream().filter(p -> p.getStatus().equals(st)).filter(p -> p.getTaskDate().equals(LocalDate.now())).forEach(p -> System.out.println(p));
					break;
					
				case 5:
					System.out.println("\n\n");
					tasks.stream().sorted((p1,p2) -> p1.getTaskDate().compareTo(p2.getTaskDate())).forEach(p -> System.out.println(p));
					break;
					
				case 6 : 
					System.out.println("\n");
					tasks.stream().sorted().forEach(p -> System.out.println(p));
					break;
				case 7:
					tasks.stream().forEach(p -> System.out.println(p));
				break;
				case 10:
					System.out.println("Exiting");
					sc.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
				String s = sc.nextLine();
			}
				
			} while (choice != 10);
		

	}
}
