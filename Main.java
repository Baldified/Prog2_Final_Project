
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Division d = new Division();
        // PatrolOfficer po = new PatrolOfficer("employeeId", "firstName",  "lastName",
        //                    2,  "hireDate",  "address",  "phoneNumber",
        //                    d.getDivisionName(),  1, 30.00,
        //                    5,  4,  3,"Leuitenent", 5, "Monday");
        // Detective dec = new Detective();
        // Dispatcher dis = new Dispatcher();
        // SwornOfficer swo = new SwornOfficer();

        // po.setEmployeeId("p1");
        // po.setFirstName("bob");
        // po.setLastName("cob");

        // dec.setEmployeeId("dec1");
        // dec.setFirstName("bib");
        // dec.setLastName("cib");

        // dis.setEmployeeId("dis1");
        // dis.setFirstName("beb");
        // dis.setLastName("ceb");

        // swo.setEmployeeId("swo1");
        // swo.setFirstName("bub");
        // swo.setLastName("cub");

        // d.addEmployee(po);
        // d.addEmployee(dec);
        // d.addEmployee(dis);
        // d.addEmployee(swo);

        // System.out.println(d.getEmployees());
        // Division dcopy = d;
        // System.out.println(d.equals(dcopy));

        // new PoliceDepartmentGUI();




        //TEST delete if needed

        ShiftManagedOfficer smo = new ShiftManagedOfficer("a1", "Bruce", "Lam",
                        18, "2007-12-01", "1213123", "12312312",
                        "a3", 12, 1235,
                        1, 1, 1,
                        "high", 123, "now", 123,
                        "aco", 132);

        ShiftManagedOfficer smo1 = new ShiftManagedOfficer("a1", "Bruce", "Lam",
                        18, "2007-12-01", "1213123", "12312312",
                        "a3", 12, 1235,
                        1, 1, 1,
                        "high", 123, "now", 123,
                        "acto", 132);

        ShiftManagedOfficer smo2 = new ShiftManagedOfficer("a1", "Bruce", "Lam",
                        18, "2007-12-01", "1213123", "12312312",
                        "a3", 12, 1235,
                        1, 1, 1,
                        "high", 123, "now", 123,
                        "acro", 132);

        ShiftManagedOfficer smo3 = new ShiftManagedOfficer("a1", "Bruce", "Lam",
                        18, "2007-12-01", "1213123", "12312312",
                        "a3", 12, 1235,
                        1, 1, 1,
                        "high", 123, "now", 123,
                        "acyo", 132);
        
        ShiftManagedOfficer smo4 = new ShiftManagedOfficer("a1", "Bruce", "Lam",
                        18, "2007-12-01", "1213123", "12312312",
                        "a3", 12, 1235,
                        1, 1, 1,
                        "high", 123, "now", 123,
                        "aco", 132);

        // ShiftManagedOfficer smo5 = new ShiftManagedOfficer("a1", "Bruce", "Lam",
        //                 18, "2007-12-01", "1213123", "12312312",
        //                 "a3", 12, 1235,
        //                 1, 1, 1,
        //                 "high", 123, "now", 123,
        //                 null, 231231);

        List<ShiftManagedOfficer> a = new ArrayList<>();
        a.add(smo);
        a.add(smo1);
        a.add(smo2);
        a.add(smo3);
        a.add(smo4);
        // a.add(smo5);
        ShiftManager b = new ShiftManager(a);
        CoverageAnalyzer c = new CoverageAnalyzer(a);
        EmergencyShiftPlanner d = new EmergencyShiftPlanner();
        
        System.out.println(b.hasShiftConflict());
        System.out.println(c.hasShortage());
        d.suggestEmergencyReassignment(c);
    }
}