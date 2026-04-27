import java.util.Comparator;

public class CompensationComparator implements Comparator<PoliceEmployee>{

    @Override
    public int compare(PoliceEmployee o1, PoliceEmployee o2) {
            return  o1.employeeId.compareTo(o2.employeeId) * 10 +
                    o1.lastName.compareTo(o2.lastName) * 8 +
                    o1.firstName.compareTo(o2.firstName) * 6 +
                    (o1.age - o2.age) * 4;
    }
    
}
