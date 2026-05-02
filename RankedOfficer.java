public class RankedOfficer extends SwornOfficer {
    protected int rankLevel;

    public RankedOfficer() {
        super();
    }

    public RankedOfficer(String employeeId, String firstName, String lastName,
                        int age, String hireDate, String address, String phoneNumber,
                        String divisionName, int yearsOfService, double baseSalary,
                        int trainingScore, int overtimeHours, int disciplineRecordCount,
                        String rank, double hazardAllowance, String shift, int rankLevel) {

        super(employeeId, firstName, lastName, age, hireDate, address, phoneNumber,
              divisionName, yearsOfService, baseSalary,
              trainingScore, overtimeHours, disciplineRecordCount,
              rank, hazardAllowance, shift);
        
        this.rankLevel = rankLevel;
    }

    public RankedOfficer(RankedOfficer other) {
        super(other);
        this.rankLevel = other.rankLevel;
    }

    @Override
    public double calculateMonthlyCompensation() {
        return (this.baseSalary * 8 * 30) + (this.overtimeHours * this.baseSalary * 2);
    }
}