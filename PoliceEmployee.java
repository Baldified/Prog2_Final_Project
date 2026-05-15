
import java.util.Objects;

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
    public String toString() {
        return employeeId + " " + firstName + " " + lastName + " " + getRoleCategory();
    }

    @Override
    public boolean equals(Object person) {
        if (this == person)
        return true;
    if (person == null)
        return false;
    if (getClass() != person.getClass())
        return false;
    
    final Person other = (Person) person;

    if (!Objects.equals(this.employeeId, other.employeeId))
        return false;
    if (!Objects.equals(this.firstName, other.firstName))
        return false;
     if (!Objects.equals(this.lastName, other.lastName))
        return false;
    if (this.age != other.age)
        return false;
    if (!Objects.equals(this.hireDate, other.hireDate))
        return false;
    if (!Objects.equals(this.phoneNumber, other.phoneNumber))
        return false;
    return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash += 53 * hash + Objects.hashCode(this.employeeId);
        hash += 7 * hash + Objects.hashCode(this.firstName);
        hash += 31 * hash + Objects.hashCode(this.lastName);
        hash += 53 * hash + Objects.hashCode(this.hireDate);
        hash += 41 * hash + Objects.hashCode(this.age);
        hash += 7 * hash + Objects.hashCode(this.phoneNumber);
        return hash;
    }
    
    @Override
    public double calculateMonthlyCompensation() {
        return (this.baseSalary * 8 * 30);
    }

    @Override
    public String getRoleCategory() {
        return "Police Employee";
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
        return calculateMonthlyCompensation() + (this.overtimeHours * this.baseSalary * 2);
    }
}
