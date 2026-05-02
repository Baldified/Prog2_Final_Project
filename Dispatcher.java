public class Dispatcher extends CivilianStaff {
    public Dispatcher() { super(); }
    public Dispatcher(CivilianStaff other) { super(other); }

    @Override
    public double calculateMonthlyCompensation() {
        return (this.baseSalary * 8 * 30) + (this.overtimeHours * this.baseSalary * 2);
    }

    @Override
    public String getRoleCategory() {
        String a = "";
        return a;
    }
}