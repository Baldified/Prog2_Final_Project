public class Detective extends SwornOfficer {
    public Detective(String employeeId, String firstName, String lastName, int age, String hireDate, String address,
            String phoneNumber, String divisionName, int yearsOfService, double baseSalary, int trainingScore,
            int overtimeHours, int disciplineRecordCount, String rank, double hazardAllowance, String shift) {
        super(employeeId, firstName, lastName, age, hireDate, address, phoneNumber, divisionName, yearsOfService,
                baseSalary, trainingScore, overtimeHours, disciplineRecordCount, rank, hazardAllowance, shift);
        }
    public Detective() { super(); }
    public Detective(SwornOfficer other) { super(other); }

    @Override
    public double calculateMonthlyCompensation() {
        return (this.baseSalary * 8 * 30) + (this.overtimeHours * this.baseSalary * 2);
    }
}