public class ShiftRecord extends ShiftManagedOfficer {

    protected String shiftType;
    protected int monthlyShiftCount;

    public ShiftRecord() {
        super();
    }

    public ShiftRecord(String shiftType, int monthlyShiftCount) {
        this.shiftType = shiftType;
        this.monthlyShiftCount = monthlyShiftCount;
    }
    
    public ShiftRecord(ShiftRecord other) {
        this.shiftType = other.shiftType;
        this.monthlyShiftCount = other.monthlyShiftCount;
    }
}   