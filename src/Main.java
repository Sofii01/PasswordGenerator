
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        // Booleans to keep track of options
        final Boolean[] lowerCase = {false};
        final Boolean[] upperCase = {false};
        final Boolean[] specialChar = {false};
        final Boolean[] numbers = {false};


        JFrame frame = new JFrame("Password Generator");
        JLabel passwordLabel = new JLabel();
        JLabel labelOption = new JLabel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setLayout(new FlowLayout());



        JButton generateButton = new JButton("Generate Password");

        //buttons to choose how to generate password
        JButton lowerButton = new JButton("With lowercase");
        JButton upperButton = new JButton("With uppercase");
        JButton specialCharButton = new JButton("With special characters");
        JButton numberButton = new JButton("With numbers");

        lowerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lowerCase[0] = !lowerCase[0];
                lowerButton.setText(lowerCase[0] ? "Without lowercase": "With lowercase");
            }
        });
        upperButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                upperCase[0] = !upperCase[0];
                upperButton.setText(upperCase[0] ? "Without uppercase" : "With uppercase");
            }
        });
        specialCharButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                specialChar[0] = !specialChar[0];
                specialCharButton.setText(specialChar[0] ? "Without special characters": "With special characters");
            }
        });
        numberButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numbers[0] = !numbers[0];
                numberButton.setText(numbers[0] ? "Without numbers" : "With numbers");
            }
        });

        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String password = PasswordGenerator.generator(lowerCase[0], upperCase[0], numbers[0], specialChar[0]);
                passwordLabel.setText(password);
            }
        });

        // Add components to the frame
        frame.add(lowerButton);
        frame.add(upperButton);
        frame.add(specialCharButton);
        frame.add(numberButton);
        frame.add(generateButton);
        frame.add(passwordLabel);
        frame.setVisible(true);


    }
}