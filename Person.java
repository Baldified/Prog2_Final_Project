public abstract class Person {
    public int employeeId;
	public String firstName;
	public String lastName;
	public int age;
	public String hireDate;
	public String address;
    public String phoneNumber;


    public abstract int calculateMonthlyCompensation();
    public abstract String getRoleCategory();


    
}