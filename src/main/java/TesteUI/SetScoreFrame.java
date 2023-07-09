/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TesteUI;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author main
 */
public class SetScoreFrame extends JFrame {
        final private String team1;
        final private String team2;
        private JButton team1ScoreButton;
        private JButton team2ScoreButton;
        final private JLabel scoreLabel;

        public SetScoreFrame(String team1, String team2) {
            this.team1 = team1;
            this.team2 = team2;
            setTitle("Set Match Score");
            setSize(300, 200);
            setLayout(new BorderLayout());
            setLocationRelativeTo(null);

            JPanel panel = new JPanel(new BorderLayout());
            panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

            JLabel titleLabel = new JLabel("Best of Three Match");
            titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            scoreLabel = new JLabel("Score: 0 - 0");
            scoreLabel.setFont(new Font("Arial", Font.PLAIN, 16));
            scoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(scoreLabel, BorderLayout.CENTER);

            JPanel buttonPanel = new JPanel(new GridLayout(1, 2, 10, 0));

            team1ScoreButton = new JButton(team1);
            team1ScoreButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    incrementScore(team1ScoreButton, team2ScoreButton);
                }
            });
            buttonPanel.add(team1ScoreButton);

            team2ScoreButton = new JButton(team2);
            team2ScoreButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    incrementScore(team2ScoreButton, team1ScoreButton);
                }
            });
            buttonPanel.add(team2ScoreButton);

            panel.add(buttonPanel, BorderLayout.SOUTH);

            setContentPane(panel);
        }

        private void incrementScore(JButton winningTeamButton, JButton losingTeamButton) {
            int winningScore = Integer.parseInt(winningTeamButton.getText());
            int losingScore = Integer.parseInt(losingTeamButton.getText());

            if (winningScore < 2) {
                winningScore++;
                winningTeamButton.setText(Integer.toString(winningScore));
                updateScoreLabel(winningScore, losingScore);
            }

            if (winningScore == 2) {
                JOptionPane.showMessageDialog(SetScoreFrame.this, winningTeamButton.getText() + " wins!");
                dispose();
            }
        }

        private void updateScoreLabel(int score1, int score2) {
            scoreLabel.setText("Score: " + score1 + " - " + score2);
        }
    }
