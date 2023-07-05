/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TesteUI;

/**
 *
 * @author main
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewTournamentFrame extends JFrame {

    public NewTournamentFrame() {
        setTitle("New Tournament");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Create a panel to hold the components
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Create a label for the title
        JLabel titleLabel = new JLabel("New Tournament");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(titleLabel, BorderLayout.NORTH);

        // Create a panel for the form fields
        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);

        // Create labels and text fields for the form fields
        JLabel nameLabel = new JLabel("Tournament Name:");
        JTextField nameTextField = new JTextField();
        nameTextField.setPreferredSize(new Dimension(200, 25));

        JLabel teamsLabel = new JLabel("Number of Teams:");
        JTextField teamsTextField = new JTextField();
        teamsTextField.setPreferredSize(new Dimension(200, 25));

        JLabel startDateLabel = new JLabel("Start Date:");
        JTextField startDateTextField = new JTextField();
        startDateTextField.setPreferredSize(new Dimension(200, 25));

        JLabel endDateLabel = new JLabel("End Date:");
        JTextField endDateTextField = new JTextField();
        endDateTextField.setPreferredSize(new Dimension(200, 25));

        JLabel bracketLabel = new JLabel("Bracket Type:");

        // Create radio buttons for bracket type
        JRadioButton singleEliminationButton = new JRadioButton("Single Elimination");
        JRadioButton doubleEliminationButton = new JRadioButton("Double Elimination");

        // Create a button group for the radio buttons
        ButtonGroup bracketGroup = new ButtonGroup();
        bracketGroup.add(singleEliminationButton);
        bracketGroup.add(doubleEliminationButton);

        // Set vertical alignment for the radio buttons
        singleEliminationButton.setVerticalAlignment(SwingConstants.TOP);
        doubleEliminationButton.setVerticalAlignment(SwingConstants.TOP);

        // Add the labels, text fields, and radio buttons to the form panel
        constraints.anchor = GridBagConstraints.LINE_START;
        constraints.gridx = 0;
        constraints.gridy = 0;
        formPanel.add(nameLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        formPanel.add(nameTextField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        formPanel.add(teamsLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        formPanel.add(teamsTextField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        formPanel.add(startDateLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;
        formPanel.add(startDateTextField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        formPanel.add(endDateLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 3;
        formPanel.add(endDateTextField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 4;
        formPanel.add(bracketLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 4;
        constraints.anchor = GridBagConstraints.LINE_START;
        formPanel.add(singleEliminationButton, constraints);

        constraints.gridy = 5;
        formPanel.add(doubleEliminationButton, constraints);

        panel.add(formPanel, BorderLayout.CENTER);

        // Create a button for submitting the form
        JButton submitButton = new JButton("Create Tournament");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                int numTeams = Integer.parseInt(teamsTextField.getText());
                String startDate = startDateTextField.getText();
                String endDate = endDateTextField.getText();
                String bracketType = singleEliminationButton.isSelected() ? "Single Elimination" : "Double Elimination";

                // Perform validation and further processing of the form data
                // ...

                // Example: Display the form data in a dialog
                String message = "Tournament Name: " + name + "\n"
                        + "Number of Teams: " + numTeams + "\n"
                        + "Start Date: " + startDate + "\n"
                        + "End Date: " + endDate + "\n"
                        + "Bracket Type: " + bracketType;

                JOptionPane.showMessageDialog(NewTournamentFrame.this, message, "Tournament Created", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        panel.add(submitButton, BorderLayout.SOUTH);

        setContentPane(panel);
        setVisible(true);
    }
}



