import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BillReminderApp {
  public static void main(String[] args) {
    BillManager manager = new BillManager();
    Scanner scanner = new Scanner(System.in);
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    System.out.println("Bill Reminder App");
    System.out.println("Enter The # Of Bills You Want To Add: ");

    int numBills = scanner.nextInt();
    scanner.nextLine();

    for (int i = 0; i < numBills; i++) {
      System.out.println("Enter Bill # " + (i + 1) + " information:");

      System.out.print("Name: ");
      String name = scanner.nextLine();

      System.out.print("Due Date (YYYY-MM-DD): ");
      String dueDateStr = scanner.nextLine();
      LocalDate dueDate = LocalDate.parse(dueDateStr, dateFormatter);

      System.out.print("Reminder Date (YYYY-MM-DD): ");
      String reminderDateStr = scanner.nextLine();
      LocalDate reminderDate = LocalDate.parse(reminderDateStr, dateFormatter);

      manager.addBill(new Bill(name, dueDate, reminderDate));

    }
    scanner.close();

    // Check for reminders
    System.out.println("\nChecking For Reminders");
    manager.checkReminders();

    // Display all bills
    manager.displayAllBills();
  }
}
