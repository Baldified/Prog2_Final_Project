import java.util.ArrayList;
import java.util.List;

public class Division {

    private String divisionName;
    private List<PoliceEmployee> employees = new ArrayList<>();
    private PoliceEmployee supervisor;

    public Division() {
        employees = new ArrayList<>();
    }

    public Division(String divisionName, List<PoliceEmployee> employees, PoliceEmployee supervisor) {
        this.divisionName = divisionName;
        this.employees = employees;
        this.supervisor = supervisor;
    }

    public Division(Division other) {
        this.divisionName = other.divisionName;
        this.employees = new ArrayList<>(other.employees);
        this.supervisor = other.supervisor;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public void setEmployees(ArrayList<PoliceEmployee> employees) {
        this.employees = employees;
    }

    public PoliceEmployee getSupervisor() {
        return supervisor;
    }

    public void addEmployee(PoliceEmployee e) {
        employees.add(e);
    }

    public void setSupervisor(PoliceEmployee supervisor) {
        this.supervisor = supervisor;
    }

    public List<PoliceEmployee> getEmployees() {
        return employees;
    }
}
