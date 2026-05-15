import java.util.ArrayList;
import java.util.List;

public class PoliceAdvancedAI {

    public PoliceAdvancedAI() {}

    public void predictRetentionRisk(PoliceDepartmentManager pdm) {
        System.out.println("Score list:");
        for (PoliceEmployee pe : pdm.getSortedEmployees()) {
            int riskScore = 0;
            if (pe.getOvertimeHours() > 50) riskScore += 30;
            else if (pe.getOvertimeHours() > 30) riskScore += 15;
            if (pe.getDisciplineRecordCount() > 3) riskScore += 25;
            if (pe.getTrainingScore() < 60) riskScore += 20;
            System.out.println(pe.getFirstName() + " " + pe.getLastName() + " got a score of" + riskScore);
        }
    }
    public void getTopSupervisorCandidates(PoliceDepartmentManager pdm) {
        System.out.println("Top candidates:");
        List<PoliceEmployee> candidates = new ArrayList<>(pdm.getSortedEmployees());
        candidates.sort((a, b) -> {
            int scoreA = a.getYearsOfService() * 10 + a.getTrainingScore();
            int scoreB = b.getYearsOfService() * 10 + b.getTrainingScore();
            return Integer.compare(scoreB, scoreA);
        });
        for (int i = 0; i < Math.min(3, candidates.size()); i++) {
            PoliceEmployee pe = candidates.get(i);
            System.out.println(pe.getFirstName() + " " +  pe.getLastName() + " " + pe.getYearsOfService() + " " + pe.getTrainingScore());
        }
    }

    public void generateStaffingAlert(PoliceDepartmentManager pdm) {
        if (pdm == null) return;

        int totalEmployees = pdm.getEmployees().size();
        int divisionCount = pdm.getDivisions().size();

        if (divisionCount > 0 && totalEmployees / divisionCount < 5) {
            System.out.println("Low employee-to-division ratio");
            System.out.println("Total employees: " + totalEmployees);
            System.out.println("Divisions: " + divisionCount);
            System.out.println("Recommended: Hire " + (divisionCount * 5 - totalEmployees) + " more employees");
        } else {
            System.out.println("Staffing levels adequate");
        }
    }
}
