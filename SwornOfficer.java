public class SwornOfficer extends PoliceEmployee implements ShiftAssignable{

    protected String rank;
    protected double hazardAllowance;
    protected String shift;

    public SwornOfficer() {
        super();
    }

    public SwornOfficer(String employeeId, String firstName, String lastName,
                        int age, String hireDate, String address, String phoneNumber,
                        String divisionName, int yearsOfService, double baseSalary,
                        int trainingScore, int overtimeHours, int disciplineRecordCount,
                        String rank, double hazardAllowance, String shift) {

        super(employeeId, firstName, lastName, age, hireDate, address, phoneNumber,
              divisionName, yearsOfService, baseSalary,
              trainingScore, overtimeHours, disciplineRecordCount);

        this.rank = rank;
        this.hazardAllowance = hazardAllowance;
        this.shift = shift;
    }

    public SwornOfficer(SwornOfficer other) {
        super(other);
        this.rank = other.rank;
        this.hazardAllowance = other.hazardAllowance;
        this.shift = other.shift;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public double getHazardAllowance() {
        return hazardAllowance;
    }

    public void setHazardAllowance(double hazardAllowance) {
        this.hazardAllowance = hazardAllowance;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    @Override
    public double calculateMonthlyCompensation() {
        return (baseSalary * 8 * 30) + (overtimeHours * baseSalary * 2);
    }

    @Override
    public String getRoleCategory() {
        String a = "";
        return a;
    }

    @Override
    public void assignShift(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assignShift'");
    }
}