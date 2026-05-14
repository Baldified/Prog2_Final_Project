import java.util.ArrayList;
import java.util.List;

public class ShiftManager {
    protected List<ShiftManagedOfficer> smo;

    public ShiftManager() {
        smo = new ArrayList<>();
    }

    public void addShiftManagedOfficer(ShiftManagedOfficer a) {
        smo.add(a);
    }

    public boolean hasShiftConflict() {
        if (smo.size() > 1) {
            int j = 0;
            for (ShiftManagedOfficer a : smo) {
                for (int k = 1 + j; k < smo.size(); k++)
                    if ((a.getShiftRecord().getShiftType()).equalsIgnoreCase(smo.get(k).getShiftRecord().getShiftType()))
                        return true;
                j++;
            }
        }
        return false;
    }
}