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
import java.util.ArrayList;
import java.util.List;

public class TeamCreationFrame extends JFrame {

    private List<String> teamNames;
    private List<JLabel> teamLabels;

    public TeamCreationFrame() {
        setTitle("Team Creation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Create a panel to hold the components
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Create a label for the title
        JLabel titleLabel = new JLabel("Team Creation");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(titleLabel, BorderLayout.NORTH);

        // Create a button for team creation
        JButton createTeamButton = new JButton("Create Team");
        createTeamButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (teamNames.size() < 8) {
                    // Create a new frame for team registration
                    TeamRegistrationFrame registrationFrame = new TeamRegistrationFrame(TeamCreationFrame.this);
                    registrationFrame.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(TeamCreationFrame.this, "Maximum number of teams reached.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        panel.add(createTeamButton, BorderLayout.CENTER);

        // Create a panel to display the registered team names
        JPanel teamsPanel = new JPanel(new GridLayout(8, 1, 10, 10));
        panel.add(teamsPanel, BorderLayout.SOUTH);

        teamNames = new ArrayList<>();
        teamLabels = new ArrayList<>();

        // Create labels to display the team names
        for (int i = 0; i < 8; i++) {
            JLabel teamLabel = new JLabel();
            teamLabel.setHorizontalAlignment(SwingConstants.CENTER);
            teamLabels.add(teamLabel);
            teamsPanel.add(teamLabel);
        }

        setContentPane(panel);
        setVisible(true);
    }

    public void registerTeam(String teamName) {
        if (teamNames.size() < 8) {
            teamNames.add(teamName);
            updateTeamLabels();
        }
    }

    private void updateTeamLabels() {
        for (int i = 0; i < teamNames.size(); i++) {
            teamLabels.get(i).setText("Team " + (i + 1) + ": " + teamNames.get(i));
        }
    }
}

class TeamRegistrationFrame extends JFrame {

    private JTextField teamNameTextField;

    private TeamCreationFrame creationFrame;

    public TeamRegistrationFrame(TeamCreationFrame creationFrame) {
        this.creationFrame = creationFrame;

        setTitle("Team Registration");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        // Create a panel to hold the components
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Create a label for team name
        JLabel teamNameLabel = new JLabel("Team Name:");
        panel.add(teamNameLabel, BorderLayout.WEST);

        // Create a text field for team name
        teamNameTextField = new JTextField();
        panel.add(teamNameTextField, BorderLayout.CENTER);

        // Create a button for team registration
        JButton registerButton = new JButton("Register");
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String teamName = teamNameTextField.getText();
                if (!teamName.isEmpty()) {
                    creationFrame.registerTeam(teamName);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(TeamRegistrationFrame.this, "Please enter a team name.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        panel.add(registerButton, BorderLayout.SOUTH);

        setContentPane(panel);
    }
}
