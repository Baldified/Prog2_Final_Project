public class PoliceAdvancedAI { //idk how to depend
    void predictRetentionRisk() {}
    void getTopSupervisorCandidates() {}
    void generateStaffingAlert(PoliceDepartmentManager pdm) {
        for(PoliceEmployee pe : pdm.getSortedEmployees()) {
            PoliceEmployee temp = null;
            if(temp == pe) throw new DuplicateEmployeeException();
            temp = (PoliceEmployee) pe;
        }
    }
}
