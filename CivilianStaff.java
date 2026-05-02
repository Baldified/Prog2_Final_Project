public class CivilianStaff extends PoliceEmployee {
    
    protected double hourlyRate;
    protected int monthlyHours;

    public CivilianStaff() {
        super();
    }

    public CivilianStaff(String employeeId, String firstName, String lastName,
                         int age, String hireDate, String address, String phoneNumber,
                         String divisionName, int yearsOfService, double baseSalary,
                         int trainingScore, int overtimeHours, int disciplineRecordCount,
                         double hourlyRate, int monthlyHours) {

        super(employeeId, firstName, lastName, age, hireDate, address, phoneNumber,
              divisionName, yearsOfService, baseSalary,
              trainingScore, overtimeHours, disciplineRecordCount);

        this.hourlyRate = hourlyRate;
        this.monthlyHours = monthlyHours;
    }

    public CivilianStaff(CivilianStaff other) {
        super(other);
        this.hourlyRate = other.hourlyRate;
        this.monthlyHours = other.monthlyHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getMonthlyHours() {
        return monthlyHours;
    }

    public void setMonthlyHours(int monthlyHours) {
        this.monthlyHours = monthlyHours;
    }

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