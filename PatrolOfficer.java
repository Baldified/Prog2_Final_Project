public class PatrolOfficer extends SwornOfficer {
    
    public PatrolOfficer(String employeeId, String firstName, String lastName, int age, String hireDate, String address,
            String phoneNumber, String divisionName, int yearsOfService, double baseSalary, int trainingScore,
            int overtimeHours, int disciplineRecordCount, String rank, double hazardAllowance, String shift) {
        super(employeeId, firstName, lastName, age, hireDate, address, phoneNumber, divisionName, yearsOfService,
                baseSalary, trainingScore, overtimeHours, disciplineRecordCount, rank, hazardAllowance, shift);
    }
    public PatrolOfficer() { super(); }
    public PatrolOfficer(SwornOfficer other) { super(other); }
}