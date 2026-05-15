
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
         Division de = new Division();
         de.setDivisionName("Ghost");
        
         PatrolOfficer patrolOfficer = new PatrolOfficer(
        "P001",
        "Bob",
        "Cobb",
        22,
        "2024-01-01",
        "123_Main_Street",
        "514-555-1234",
        de.getDivisionName(),
        160,
        30.00,
        5,
        4,
        3,
        "Lieutenant",
        5.0,
        "Monday"
        );

        Detective detective = new Detective(
                "D001",
                "Bib",
                "Cib",
                43,
                "2023-05-12",
                "456_Oak_Avenue",
                "514-555-5678",
                de.getDivisionName(),
                170,
                40.00,
                7,
                2,
                5,
                "Sergeant",
                7.5,
                "Tuesday"
        );

        Dispatcher dispatcher = new Dispatcher(
                "DIS001",
                "Beb",
                "Ceb",
                21,
                "2022-03-15",
                "789_Pine_Road",
                "514-555-9999",
                de.getDivisionName(),
                150,
                25.00,
                6,
                2,
                3,
                34.5,
                90
        );

        SwornOfficer swornOfficer = new SwornOfficer(
                "SO001",
                "Bub",
                "Cub",
                34,
                "2021-08-20",
                "321 Maple Drive",
                "514-555-7777",
                de.getDivisionName(),
                165,
                35.00,
                6,
                3,
                4,
                "Captain",
                6.0,
                "Friday"
        );


        de.addEmployee(swornOfficer);
        de.addEmployee(detective);
        de.addEmployee(dispatcher);
        de.addEmployee(patrolOfficer);
        de.setSupervisor(swornOfficer);
        System.out.print(de);

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
        PoliceSerializer ps = new PoliceSerializer();
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
        ps.saveManager(a);
        PoliceDepartmentManager pdm = new PoliceDepartmentManager();

        
        System.out.println(b.hasShiftConflict());
        System.out.println(c.hasShortage());
        d.suggestEmergencyReassignment(c);
        new PoliceDepartmentGUI();
    }
}