public class RankedOfficer extends SwornOfficer {
    protected int rankLevel;

    public RankedOfficer() {
        super();
    }

    @Override
    public double calculateMonthlyCompensation() {
        return (baseSalary * 8 * 30) + (overtimeHours * baseSalary * 2);
    }
}