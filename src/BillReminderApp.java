import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BillReminderApp {
  public static void main(String[] args) {
    BillManager manager = new BillManager();
    Scanner scanner = new Scanner(System.in);
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    System.out.println("Bill Reminder App");
    System.out.println("Enter the number of bills you want to add: ");

    int numBills = scanner.nextInt();
    scanner.nextLine();

    for (int i = 0; i < numBills; i++) {
      System.out.println("Enter bill # " + (i + 1) + " information:");

      System.out.print("Name: ");
      String name = scanner.nextLine();
    }

    // Example bills
    manager.addBill(new Bill("Internet", LocalDate.of(2024, 4, 15), LocalDate.of(2024, 4, 10)));
    manager.addBill(new Bill("Electricity", LocalDate.of(2024, 4, 20), LocalDate.of(2024, 4, 15)));

    // Check for reminders
    manager.checkReminders();

  }
}
