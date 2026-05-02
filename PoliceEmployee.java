public class PoliceEmployee extends Person implements PayRoll,Comparable<PoliceEmployee>{

    protected String divisionName;
    protected int yearsOfService;
    protected double baseSalary;
    protected int trainingScore;
    protected int overtimeHours;
    protected int disciplineRecordCount;

    public PoliceEmployee() {
        super();
    }

    public PoliceEmployee(String employeeId, String firstName, String lastName,
                          int age, String hireDate, String address, String phoneNumber,
                          String divisionName, int yearsOfService, double baseSalary,
                          int trainingScore, int overtimeHours, int disciplineRecordCount) {
        super(employeeId, firstName, lastName, age, hireDate, address, phoneNumber);
        this.divisionName = divisionName;
        this.yearsOfService = yearsOfService;
        this.baseSalary = baseSalary;
        this.trainingScore = trainingScore;
        this.overtimeHours = overtimeHours;
        this.disciplineRecordCount = disciplineRecordCount;
    }

    public PoliceEmployee(PoliceEmployee other) {
        super(other);
        this.divisionName = other.divisionName;
        this.yearsOfService = other.yearsOfService;
        this.baseSalary = other.baseSalary;
        this.trainingScore = other.trainingScore;
        this.overtimeHours = other.overtimeHours;
        this.disciplineRecordCount = other.disciplineRecordCount;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getTrainingScore() {
        return trainingScore;
    }

    public void setTrainingScore(int trainingScore) {
        this.trainingScore = trainingScore;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public int getDisciplineRecordCount() {
        return disciplineRecordCount;
    }

    public void setDisciplineRecordCount(int disciplineRecordCount) {
        this.disciplineRecordCount = disciplineRecordCount;
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

    @Override
    public int compareTo(PoliceEmployee o) {
        return  this.employeeId.compareTo(o.employeeId) * 10 +
                this.lastName.compareTo(o.lastName) * 8 +
                this.firstName.compareTo(o.firstName) * 6 +
                (this.age - o.age) * 4;
    }

    @Override
    public double computePayRoll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'computePayRoll'");
    }
}
