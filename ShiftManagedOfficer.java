
import java.util.Objects;

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
              
        if (shiftType == null)
            monthlyShiftCount = 0;
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
    public String getShift() {
        return shift;
    }

    @Override
    public void assignShift(String string) {
        this.shift = string;
    }

    @Override
    public double calculateMonthlyCompensation() {
        return (this.baseSalary * 8 * 30) + (this.overtimeHours * this.baseSalary * 2);
    }

    @Override
    public String getRoleCategory() {
        return "Shift Managed Officer";
    }

    @Override
    public double computePayRoll() {
        return calculateMonthlyCompensation() + (this.overtimeHours * this.baseSalary * 2);
    }
}