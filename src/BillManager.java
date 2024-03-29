import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class BillManager {
    private List<Bill> bills = new ArrayList<>();

    public void addBill(Bill bill) {
        bills.add(bill);
    }

    public void checkReminders() {
        LocalDate today = LocalDate.now();
        for(Bill bill : bills) {
            if(bill.getReminderDate().isEqual(today)) {
                System.out.println("Reminder: Pay your " +bill.getName() + " by " + bill.getDueDate() + "." );
            }
        }
    }
}
