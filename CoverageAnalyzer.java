
import java.util.ArrayList;
import java.util.List;

public class CoverageAnalyzer {
    protected List<ShiftManagedOfficer> sMO;

    public CoverageAnalyzer() {
        sMO = new ArrayList<>();
    }

    public CoverageAnalyzer(List<ShiftManagedOfficer> a) {
        sMO = a;
    }

    public void addShiftManagedOfficer(ShiftManagedOfficer a) {
        sMO.add(a);
    }

    public boolean hasShortage() {
        if (!sMO.isEmpty())
            for (ShiftManagedOfficer a : sMO)
                if (a.getShiftRecord().getShiftType() == null 
                    && a.getShiftRecord().getMonthlyShiftCount() == 0)
                    return false;
        return true;
    }
}