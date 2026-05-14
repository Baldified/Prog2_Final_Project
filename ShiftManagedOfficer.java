public class ShiftManagedOfficer extends SwornOfficer{

    protected ShiftRecord shiftRecord;

    public ShiftManagedOfficer() {
        super();
    }

    public ShiftManagedOfficer(String employeeId, String firstName, String lastName,
                        int age, String hireDate, String address, String phoneNumber,
                        String divisionName, int yearsOfService, double baseSalary,
                        int trainingScore, int overtimeHours, int disciplineRecordCount,
                        String rank, double hazardAllowance, String shift, int rankLevel,
                        String shiftType, int monthlyShiftCount) {

        super(employeeId, firstName, lastName, age, hireDate, address, phoneNumber,
              divisionName, yearsOfService, baseSalary,
              trainingScore, overtimeHours, disciplineRecordCount,
              rank, hazardAllowance, shift);
        
        this.shiftRecord = new ShiftRecord(shiftType, monthlyShiftCount);  //COMPOSITION
    }

    public ShiftManagedOfficer(ShiftManagedOfficer other) {
        super(other);
        this.shiftRecord = other.shiftRecord;
    }

    public ShiftRecord getShiftRecord() {
        return shiftRecord;
    }

    public void setShiftRecord(ShiftRecord shiftRecord) {
        this.shiftRecord = shiftRecord;
    }

    @Override
    public double calculateMonthlyCompensation() {
        return (this.baseSalary * 8 * 30) + (this.overtimeHours * this.baseSalary * 2);
    }

}