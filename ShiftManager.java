import java.util.ArrayList;
import java.util.List;

public class ShiftManager {
    protected List<ShiftManagedOfficer> sMO;

    public ShiftManager() {
        sMO = new ArrayList<>();
    }

    public ShiftManager(List<ShiftManagedOfficer> a) {
        sMO = a;
    }

    public void addShiftManagedOfficer(ShiftManagedOfficer a) {
        sMO.add(a);
    }

    public boolean hasShiftConflict() {
        if (sMO.size() > 1) {
            int j = 0;
            for (ShiftManagedOfficer a : sMO) {
                for (int k = 1 + j; k < sMO.size(); k++)
                    if ((a.getShiftRecord().getShiftType()).equalsIgnoreCase(sMO.get(k).getShiftRecord().getShiftType()))
                        return true;
                j++;
            }
        }
        return false;
    }
}