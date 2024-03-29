import java.time.LocalDate;
public class BillReminderApp {
    public static void main(String[] args) {
        BillManager manager = new BillManager();

        //Example bills
        manager.addBill(new Bill("Internet", LocalDate.of(2024, 4, 15), LocalDate.of(2024, 4, 10)));
        manager.addBill(new Bill("Electricity", LocalDate.of(2024, 4, 20), LocalDate.of(2024, 4, 15)));

        // Check for reminders
        manager.checkReminders();

    }
}
