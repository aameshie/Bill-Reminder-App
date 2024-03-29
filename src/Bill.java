import java.time.LocalDate;
public class Bill {
    private String name;
    private LocalDate dueDate;
    private LocalDate reminderDate;


    public Bill(String name, LocalDate dueDate, LocalDate reminderDate) {
        this.name = name;
        this.dueDate = dueDate;
        this.reminderDate = reminderDate;
    }

    // Getters
    public String getName() {
        return name;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public LocalDate getReminderDate() {
        return reminderDate;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "name='" + name + '\'' +
                ", dueDate" + dueDate +
                ", reminderDate" + reminderDate +
                '}';
    }
}
