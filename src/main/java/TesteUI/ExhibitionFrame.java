/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TesteUI;

/**
 *
 * @author main
 */
import TesteUI.SetScoreFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExhibitionFrame extends JFrame {

    private JButton[] matchButtons; // Array to store the match buttons

    public ExhibitionFrame() {
        setTitle("Exhibition - 8 Teams Single Elimination Bracket");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        // Create a panel to hold the components
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Create a label for the title
        JLabel titleLabel = new JLabel("Exhibition - 8 Teams Single Elimination Bracket");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(titleLabel, BorderLayout.NORTH);

        // Create a panel for the bracket
        JPanel bracketPanel = new JPanel(new BorderLayout());
        bracketPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Create labels for the team names in the bracket
        final String[] teamNames = {
                "Team 1", "Team 2",
                "Team 3", "Team 4",
                "Team 5", "Team 6",
                "Team 7", "Team 8"
        };

        matchButtons = new JButton[teamNames.length / 2]; // Create match buttons array

        JPanel quarterFinalsPanel = new JPanel(new GridLayout(4, 1, 0, 10)); // Panel for quarter-finals matches

        for (int i = 0; i < teamNames.length; i += 2) {
            final String team1 = teamNames[i];
            final String team2 = teamNames[i + 1];

            // Create a panel for each match box
            JPanel matchPanel = new JPanel(new BorderLayout());
            matchPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            matchPanel.setBackground(Color.WHITE);

            // Create a formatted label for each team in the match
            JLabel team1Label = new JLabel(team1);
            team1Label.setFont(new Font("Arial", Font.PLAIN, 16));
            team1Label.setHorizontalAlignment(SwingConstants.CENTER);
            team1Label.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

            JLabel team2Label = new JLabel(team2);
            team2Label.setFont(new Font("Arial", Font.PLAIN, 16));
            team2Label.setHorizontalAlignment(SwingConstants.CENTER);
            team2Label.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

            // Add the team labels to the match panel
            matchPanel.add(team1Label, BorderLayout.NORTH);
            matchPanel.add(team2Label, BorderLayout.SOUTH);

            int matchIndex = i / 2;

            // Create a match button for each match
            matchButtons[matchIndex] = new JButton("Set Score");
            matchButtons[matchIndex].setFont(new Font("Arial", Font.PLAIN, 14));

            // Style the match button
            matchButtons[matchIndex].setBackground(new Color(0, 153, 51));
            matchButtons[matchIndex].setForeground(Color.WHITE);
            matchButtons[matchIndex].setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
            matchButtons[matchIndex].setFocusPainted(false);

            // Add action listener to the match button
            matchButtons[matchIndex].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    SetScoreFrame setScoreFrame = new SetScoreFrame(team1, team2);
                    setScoreFrame.setVisible(true);
                }
            });

            // Add the match button to the match panel
            matchPanel.add(matchButtons[matchIndex], BorderLayout.CENTER);

            // Add the match panel to the bracket panel
            quarterFinalsPanel.add(matchPanel);
        }

        // Add the quarter-finals panel to the bracket panel
        bracketPanel.add(quarterFinalsPanel, BorderLayout.WEST);

        panel.add(bracketPanel, BorderLayout.CENTER);

        setContentPane(panel);
        setVisible(true);
    }
}



