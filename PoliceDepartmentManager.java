import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PoliceDepartmentManager {
    private Map<String, Division> divisions = new HashMap<>();
    private Set<PoliceEmployee> employees = new HashSet<>();

    public void addDivision(String name) {
        divisions.put(name, new Division());
    }
    public void addEmployee(PoliceEmployee e) {
        if(!employees.contains(e)) employees.add(e);
        else throw new DuplicateEmployeeException();
    }

    public void assignSupervisor(String divisionName, PoliceEmployee supervisor) throws DivisionNotFoundException, InvalidSupervisorAssignmentException {
        if(!getDivisions().containsKey(divisionName)) throw new DivisionNotFoundException();
        Division d = divisions.get(divisionName);
        d.setSupervisor(supervisor);
    }

    public PoliceEmployee findEmployeeById(String id) {
        for (PoliceEmployee e : employees) {
            if (e.employeeId.equals(id)) return e;
        }
        return null;
    }

    public List<PoliceEmployee> getSortedEmployees() {
        List<PoliceEmployee> list = new ArrayList<>(employees);
        Collections.sort(list);
        return list;
    }
    public Map<String, Division> getDivisions() {
        return divisions;
    }
    public void setDivisions(Map<String, Division> divisions) {
        this.divisions = divisions;
    }
    public Set<PoliceEmployee> getEmployees() {
        return employees;
    }
    public void setEmployees(Set<PoliceEmployee> employees) {
        this.employees = employees;
    }
    
}
