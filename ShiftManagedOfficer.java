public class ShiftManagedOfficer extends SwornOfficer{

    protected ShiftRecord shiftRecord;

    public ShiftManagedOfficer() {
        super();
        this.shiftRecord = new ShiftRecord();  //COMPOSITION
    }

    @Override
    public double calculateMonthlyCompensation() {
        return (baseSalary * 8 * 30) + (overtimeHours * baseSalary * 2);
    }
}