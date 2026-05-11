import javax.swing.*;
import java.awt.BorderLayout;
public class PoliceDepartmentGUI {
    protected JFrame gui = new JFrame();
    protected PoliceDepartmentManager pdm = new PoliceDepartmentManager();
    protected PoliceTextIO pTIO = new PoliceTextIO();
    
    public PoliceDepartmentGUI() {
        gui.setTitle("Police Department");
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(720,520);
        gui.setLocationRelativeTo(null);

        gui.add(createAddEmployee());
        gui.add(importExportEmployees());

        gui.setVisible(true);
    }

    private JPanel createAddEmployee() {
        JButton AddE = new JButton("Add Employee");
        JTextField input = new JTextField();

        AddE.setSize(250, 100);
        AddE.setLocation(20, 50);
        input.setSize(150, 80);
        input.setLocation(250, 60);

        
        AddE.addActionListener(_ -> {
            try {
                String id = input.getText().trim();
                pdm.addEmployee(pdm.findEmployeeById(id));
            }
            catch (DuplicateEmployeeException ex) {
                showInputError();
            }
        });
        JPanel jp = new JPanel(new BorderLayout(10,10));
        jp.add(AddE,BorderLayout.WEST);
        jp.add(input,BorderLayout.CENTER);
        return jp;
    }

    private JPanel importExportEmployees() {
        JButton importEmployee = new JButton("Import");
        JButton exportEmployee = new JButton("Export");

        importEmployee.setSize(40,40);
        exportEmployee.setSize(40,40);

        importEmployee.addActionListener(_ -> pdm = pTIO.importPDM());
        exportEmployee.addActionListener(_ -> pTIO.exportEmployees(pdm));

        JPanel jp = new JPanel(new BorderLayout(10,10));
        jp.add(importEmployee, BorderLayout.NORTH);
        jp.add(exportEmployee,BorderLayout.SOUTH);

        return jp;
    }


    private void showInputError() {
        JOptionPane.showMessageDialog(gui,
                "Duplicate employees.",
                "Input Error",
                JOptionPane.ERROR_MESSAGE);
    }

}
