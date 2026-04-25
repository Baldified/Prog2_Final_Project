import java.util.Objects;

public abstract class Person {
    protected String employeeId;
	protected String firstName;
	protected String lastName;
	protected int age;
	protected String hireDate;
	protected String address;
    protected String phoneNumber;


    public abstract double calculateMonthlyCompensation();
    public abstract String getRoleCategory();

    public Person() {}

    public Person(String employeeId, String firstName, String lastName,
                  int age, String hireDate, String address, String phoneNumber) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hireDate = hireDate;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Person(Person other) {
        this(other.employeeId, other.firstName, other.lastName,
             other.age, other.hireDate, other.address, other.phoneNumber);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public String toString() {
        return employeeId + " " + firstName + " " + lastName;
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
}