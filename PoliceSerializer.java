import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PoliceSerializer {

    void saveManager(List<ShiftManagedOfficer> list) {
        File file = new File("managersave.txt");
        try (FileWriter fw = new FileWriter(file, false)) {
            for (ShiftManagedOfficer smo : list) {

                fw.write(
                    smo.getEmployeeId() + " " +
                    smo.getFirstName() + " " +
                    smo.getLastName() + " " +
                    smo.getAge() + " " +
                    smo.getHireDate() + " " +
                    smo.getAddress() + " " +
                    smo.getPhoneNumber() + " " +
                    smo.getDivisionName() + " " +
                    smo.getYearsOfService() + " " +
                    smo.getBaseSalary() + " " +
                    smo.getTrainingScore() + " " +
                    smo.getOvertimeHours() + " " +
                    smo.getDisciplineRecordCount() + " " +
                    smo.getRank() + " " +
                    smo.getHazardAllowance() + " " +
                    smo.getShift() + " " +
                    smo.getRank() + " " +
                    smo.getShift() + " " +
                    smo.getShiftRecord() +
                    "\n"
                );
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    List<ShiftManagedOfficer> loadManager() {
        List<ShiftManagedOfficer> list = new ArrayList<>();
        try {
            Scanner input = new Scanner(new File("managersave.txt"));
            while (input.hasNextLine()) {
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
                String rank = input.next();
                double hazardAllowance = input.nextDouble();
                String shift = input.next();
                int rankLevel = input.nextInt();
                String shiftType = input.next();
                int shiftRecord = input.nextInt();

                ShiftManagedOfficer smo = new ShiftManagedOfficer(
                    employeeId, firstName, lastName, age, hireDate,
                    address, phoneNumber, divisionName, yearsOfService,
                    baseSalary, trainingScore, overtimeHours, disciplineRecordCount,
                    rank, hazardAllowance, shift,
                    rankLevel, shiftType, shiftRecord
                );

                list.add(smo);
                if (input.hasNextLine()) input.nextLine();
            }
            input.close();
        } catch (FileNotFoundException e) {
            return null;
        }
        return list;
    }
}