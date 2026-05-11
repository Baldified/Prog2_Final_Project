import javax.swing.*;
import java.awt.BorderLayout;
public class PoliceDepartmentGUI extends JFrame {
    protected PoliceDepartmentManager pdm = new PoliceDepartmentManager();
    protected PoliceTextIO pTIO = new PoliceTextIO();
    
    public PoliceDepartmentGUI() {

        JTabbedPane jtp = new JTabbedPane();
        jtp.addTab("Add employee",createAddEmployee());
        jtp.addTab("Import / export employee",importExportEmployees());
        setTitle("Police Department");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(720,520);
        setLocationRelativeTo(null);
        
        add(jtp);

        setVisible(true);
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
        jp.setBorder(BorderFactory.createEmptyBorder(150,25,150,25));
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
        jp.setBorder(BorderFactory.createEmptyBorder(150,225,150,225));
        jp.add(importEmployee, BorderLayout.WEST);
        jp.add(exportEmployee,BorderLayout.EAST);

        return jp;
    }


    private void showInputError() {
        JOptionPane.showMessageDialog(this,
                "Duplicate employees.",
                "Input Error",
                JOptionPane.ERROR_MESSAGE);
    }

}
