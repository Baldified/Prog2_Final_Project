import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PoliceTextIO {

    void exportEmployees(PoliceDepartmentManager pdm) {
        File exported = new File("exported.txt");
        try (FileWriter fw = new FileWriter(exported, true)) {
            for (PoliceEmployee pe : pdm.getSortedEmployees()) {
                fw.write(pe.getClass().toString().toUpperCase() + " " +
                            pe.getEmployeeId() + " " +
                            pe.getFirstName() + " " +
                            pe.getLastName() + " " +
                            pe.getAge() + " " +
                            pe.getHireDate() + " " +
                            pe.getAddress() + " " +
                            pe.getPhoneNumber() + " " +
                            pe.getDivisionName() + " " +
                            pe.getYearsOfService() + " " +
                            pe.getBaseSalary() + " " +
                            pe.getTrainingScore() + " " +
                            pe.getOvertimeHours() + " ");
                switch (pe) {
                    case Detective dec ->
                            fw.write(dec.getRank() + " " + dec.getHazardAllowance() + " " + dec.getShift());
                    case Dispatcher dis -> fw.write(dis.getHourlyRate() + " " + dis.getMonthlyHours());
                    case PatrolOfficer po ->
                            fw.write(po.getRank() + " " + po.getHazardAllowance() + " " + po.getShift());
                    case SwornOfficer so ->
                            fw.write(so.getRank() + " " + so.getHazardAllowance() + " " + so.getShift());
                    default -> {
                    }
                }
                fw.write('\n');
            }
        } 
        catch (IOException e) {
        System.out.printf("%s: %s%n", e.getClass(), e.getMessage());
        }
    }
    PoliceDepartmentManager importPDM() {
        String imported = "export.txt";
        PoliceDepartmentManager pdm = new PoliceDepartmentManager();
        Scanner input;
        try {
            input = new Scanner(new File (imported));
        } catch (FileNotFoundException e) {
            return null;
        }
        while (input.hasNextLine()) {
                String classwd = input.next();
                String fill = input.next();
                String employeeId = input.next();
                String firstName = input.next();
                String lastName = input.next();
                int age = input.nextInt();
                String hireDate = input.next();
                String address = input.next();
                String phoneNumber = input.next();
                String divisionName = input.next();
                int yearsOfService = input.nextInt();
                double baseSalary = input.nextDouble();
                int trainingScore = input.nextInt();
                int overtimeHours = input.nextInt();
                int disciplineRecordCount = input.nextInt();
                switch (fill) {
                    case "DETECTIVE":
                        String rank = input.next();
                        double hazardAllowance = input.nextDouble();
                        String shift = input.next();
                        PoliceEmployee detective = new Detective(employeeId, firstName, lastName,age, hireDate, address,
                                                                    phoneNumber, divisionName, yearsOfService, baseSalary, 
                                                                    trainingScore, overtimeHours, disciplineRecordCount,rank,hazardAllowance,shift);
                        pdm.addEmployee(detective);
                        break;
                    case "DISPATCHER":
                        double hourlyRate = input.nextDouble();
                        int monthlyHours = input.nextInt();
                        PoliceEmployee Dispatcher = new Dispatcher(employeeId, firstName, lastName,age, hireDate, address,
                                                                    phoneNumber, divisionName, yearsOfService, baseSalary, 
                                                                    trainingScore, overtimeHours, disciplineRecordCount,hourlyRate,monthlyHours);
                        pdm.addEmployee(Dispatcher);
                        break;
                    case "PATROLOFFICER":
                        String rank1 = input.next();
                        double hazardAllowance1 = input.nextDouble();
                        String shift1 = input.next();
                        PoliceEmployee patrolOfficer = new PatrolOfficer(employeeId, firstName, lastName,age, hireDate, address,
                                                                    phoneNumber, divisionName, yearsOfService, baseSalary, 
                                                                    trainingScore, overtimeHours, disciplineRecordCount,rank1,hazardAllowance1,shift1);
                        pdm.addEmployee(patrolOfficer);
                        break;
                    case "SWORNOFFICER":
                        String rank2 = input.next();
                        double hazardAllowance2 = input.nextDouble();
                        String shift2 = input.next();
                        PoliceEmployee swornOfficer = new SwornOfficer(employeeId, firstName, lastName,age, hireDate, address,
                                                                    phoneNumber, divisionName, yearsOfService, baseSalary, 
                                                                    trainingScore, overtimeHours, disciplineRecordCount,rank2,hazardAllowance2,shift2);
                        pdm.addEmployee(swornOfficer);
                        break;
                    default:
                     break;
                }
                if (input.hasNextLine()) input.nextLine();
        }
        return pdm;
    }
}
