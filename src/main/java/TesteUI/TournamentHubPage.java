/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TesteUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TournamentHubPage extends JFrame {

    public TournamentHubPage() {
        setTitle("Tournament Management");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        // Set the look and feel to a stylized theme (e.g., Nimbus)
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Create buttons for different tournament management options
        JButton createButton = new JButton("Create Tournament");
        JButton viewButton = new JButton("View Tournaments");
        JButton exhibitionButton = new JButton("Open Exhibition");

        // Customize button appearance
        Font buttonFont = new Font("Arial", Font.BOLD, 16);
        createButton.setFont(buttonFont);
        viewButton.setFont(buttonFont);
        exhibitionButton.setFont(buttonFont);

        // Add action listeners to the buttons
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Show a styled popup dialog to create a tournament
                showCreateTournamentDialog();
            }
        });

        viewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open the view tournaments page
                openViewTournamentsPage();
            }
        });

        exhibitionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open the exhibition frame
                openExhibitionFrame();
            }
        });

        // Add the buttons to the panel
        panel.add(createButton);
        panel.add(viewButton);
        panel.add(exhibitionButton);

        // Add the panel to the frame
        add(panel);

        // Make the frame visible
        setVisible(true);
    }

    private void openViewTournamentsPage() {
        // Implement the logic to open the view tournaments page
        System.out.println("Opening View Tournaments page...");
    }

    private void showCreateTournamentDialog() {
        // Create a styled popup dialog to create a tournament
        UIManager.put("OptionPane.background", new Color(255, 255, 255));
        UIManager.put("Panel.background", new Color(255, 255, 255));
        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.PLAIN, 16));

        ImageIcon icon = new ImageIcon("tournament-icon.png"); // Replace with your custom icon path

        JOptionPane.showMessageDialog(
                TournamentHubPage.this,
                "Create Tournament dialog will be shown",
                "Create Tournament",
                JOptionPane.INFORMATION_MESSAGE,
                icon
        );
    }

    private void openExhibitionFrame() {
        // Create an instance of the ExhibitionFrame class
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ExhibitionFrame();
            }
        });
    }
}
