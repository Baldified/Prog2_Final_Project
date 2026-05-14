public class EmergencyShiftPlanner {
    public EmergencyShiftPlanner() {}
    
    public void suggestEmergencyReassignment(CoverageAnalyzer a) {
        if (a.hasShortage())
            System.out.println("Emergency reassingment needed");
        else
            System.out.println("No emergency reassingment needed");
    }
}