import javax.swing.*;
public class PoliceDepartmentGUI {
    protected JFrame gui = new JFrame();
    protected PoliceDepartmentManager pdm = new PoliceDepartmentManager();
    
    public PoliceDepartmentGUI() {
        gui.setTitle("Police Department");
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(720,520);
        gui.setLocationRelativeTo(null);

        createAddEmployee();
        
        gui.setVisible(true);
    }

    private void createAddEmployee() {
        JButton AddE = new JButton("Add Employee");
        JTextField input = new JTextField();

        AddE.setSize(250, 100);
        AddE.setLocation(20, 50);
        input.setSize(150, 80);
        input.setLocation(250, 60);

        
        AddE.addActionListener(e -> {
            try {
                String id = input.getText().trim();
                pdm.addEmployee(pdm.findEmployeeById(id));
            }
            catch (DuplicateEmployeeException ex) {
                showInputError();
            }
        });

        gui.add(AddE);
        gui.add(input);
    }

    private void showInputError() {
        JOptionPane.showMessageDialog(gui,
                "Duplicate employees.",
                "Input Error",
                JOptionPane.ERROR_MESSAGE);
    }

}
