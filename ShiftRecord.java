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

    public String getShiftType() {
        return shiftType;
    }

    public void setShiftType(String shiftType) {
        this.shiftType = shiftType;
    }

    public int getMonthlyShiftCount() {
        return monthlyShiftCount;
    }

    public void setMonthlyShiftCount(int monthlyShiftCount) {
        this.monthlyShiftCount = monthlyShiftCount;
    }
}   