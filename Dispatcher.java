public class Dispatcher extends CivilianStaff {
    
    public Dispatcher(String employeeId, String firstName, String lastName, int age, String hireDate, String address,
            String phoneNumber, String divisionName, int yearsOfService, double baseSalary, int trainingScore,
            int overtimeHours, int disciplineRecordCount, double hourlyRate, int monthlyHours) {
        super(employeeId, firstName, lastName, age, hireDate, address, phoneNumber, divisionName, yearsOfService,
                baseSalary, trainingScore, overtimeHours, disciplineRecordCount, hourlyRate, monthlyHours);
    }
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