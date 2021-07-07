
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Create class that calculates travel expenses

public class TravelExpenses extends JFrame {

    private JLabel messageLabel;           // To reference a label
    private JTextField kiloTextField;      // To reference a text field
    private JButton calcButton;            // To reference a button

    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JPanel panel6;
    private JPanel panel7;
    private JPanel panel8;
    private JPanel panel9;
    private JPanel panel10;
    private JPanel panel11;
    private JLabel instructLabel;
    private JLabel unitsLabel;
    private JTextField inputTextField1;
    private JTextField inputTextField2;
    private JTextField inputTextField3;
    private JTextField inputTextField4;
    private JTextField inputTextField5;
    private JTextField inputTextField6;
    private JTextField inputTextField7;
    private JTextField inputTextField8;
    private JTextField inputTextField9;
    private JTextField inputTextField10;
    private JTextField inputTextField11;


    private JTextField outputTextField;
    private JButton convertButton;
    private JButton exitButton;


    // Constructor

    public TravelExpenses() {

        // Set the window title
        super("Travel Expenses");

        // Set the border layout to default
        setLayout(new GridLayout(11, 1));

        // Set the width (500) and height (500) of window
        setSize(500, 500);
        // Set the windows to close when the close button is pressed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Call the createPanel1 method
        createPanel1();
        createPanel2();
        createPanel3();
        createPanel4();
        createPanel5();
        createPanel6();
        createPanel7();
        createPanel8();
        createPanel9();
        createPanel10();
        createPanel11();

        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);
        add(panel5);
        add(panel6);
        add(panel7);
        add(panel8);
        add(panel9);
        add(panel10);
        add(panel11);


        // Make the window visible to the user
        setVisible(true);
    }


    private void createPanel1() {

        // Create a new label, prompting the user to input day
        instructLabel = new JLabel("Number of days on the trip");

        // Create a new text field, measured at 10 characters long
        inputTextField1 = new JTextField(10);


        // Create a new panel, using the panel reference
        panel1 = new JPanel();

        // Add label, text field, to panel
        panel1.add(instructLabel);
        panel1.add(inputTextField1);
    }

    private void createPanel2() {

        // Create a new label, prompting the user to input airfare
        instructLabel = new JLabel("Amount of airfare (if any)");

        // Create a new text field, measured at 10 characters long
        inputTextField2 = new JTextField(10);


        // Create a new panel, using the panel reference
        panel2 = new JPanel();

        // Add label, text field, to panel
        panel2.add(instructLabel);
        panel2.add(inputTextField2);
    }

    private void createPanel3() {

        // Create a new label, prompting the user to input rental charges
        instructLabel = new JLabel("Amount of car rental charges (if any)");

        // Create a new text field, measured at 10 characters long
        inputTextField3 = new JTextField(10);


        // Create a new panel, using the panel reference
        panel3 = new JPanel();

        // Add label, text field, to panel
        panel3.add(instructLabel);
        panel3.add(inputTextField3);
    }

    private void createPanel4() {

        // Create a new label, prompting the user to input miles
        instructLabel = new JLabel("Number of miles driven in personal car (if any)");

        // Create a new text field, measured at 10 characters long
        inputTextField4 = new JTextField(10);


        // Create a new panel, using the panel reference
        panel4 = new JPanel();

        // Add label, text field, to panel
        panel4.add(instructLabel);
        panel4.add(inputTextField4);
    }

    private void createPanel5() {

        // Create a new label, prompting the user to input parking fees
        instructLabel = new JLabel("Amount of parking fees (if any)");

        // Create a new text field, measured at 10 characters long
        inputTextField5 = new JTextField(10);


        // Create a new panel, using the panel reference
        panel5 = new JPanel();

        // Add label, text field, and button to panel
        panel5.add(instructLabel);
        panel5.add(inputTextField5);
    }

    private void createPanel6() {

        // Create a new label, prompting the user to input taxi charges
        instructLabel = new JLabel("Amount of taxi charges (if any)");

        // Create a new text field, measured at 10 characters long
        inputTextField6 = new JTextField(10);


        // Create a new panel, using the panel reference
        panel6 = new JPanel();

        // Add label, text field, and button to panel
        panel6.add(instructLabel);
        panel6.add(inputTextField6);
    }

    private void createPanel7() {

        // Create a new label, prompting the user to input tolls
        instructLabel = new JLabel("Amount of tolls (if any)");

        // Create a new text field, measured at 10 characters long
        inputTextField7 = new JTextField(10);


        // Create a new panel, using the panel reference
        panel7 = new JPanel();

        // Add label, text field, and button to panel
        panel7.add(instructLabel);
        panel7.add(inputTextField7);
    }

    private void createPanel8() {

        // Create a new label, prompting the user to input conference fees
        instructLabel = new JLabel("Conference or seminar fees (if any)");

        // Create a new text field, measured at 10 characters long
        inputTextField8 = new JTextField(10);


        // Create a new panel, using the panel reference
        panel8 = new JPanel();

        // Add label, text field, to panel
        panel8.add(instructLabel);
        panel8.add(inputTextField8);
    }

    private void createPanel9() {

        // Create a new label, prompting the user to input meal charges
        instructLabel = new JLabel("Meal charges");

        // Create a new text field, measured at 10 characters long
        inputTextField9 = new JTextField(10);


        // Create a new panel, using the panel reference
        panel9 = new JPanel();

        // Add label, text field, to panel
        panel9.add(instructLabel);
        panel9.add(inputTextField9);
    }

    private void createPanel10() {

        // Create a new label, prompting the user to input lodge charges
        instructLabel = new JLabel("Lodging charges");

        // Create a new text field, measured at 10 characters long
        inputTextField10 = new JTextField(10);


        // Create a new panel, using the panel reference
        panel10 = new JPanel();

        // Add label, text field, to panel
        panel10.add(instructLabel);
        panel10.add(inputTextField10);
    }

    private void createPanel11() {

        // Create a new button, allows user to start calculation
        convertButton = new JButton("Calculate");
        // Create a new action listener, allows program to start calculation
        convertButton.addActionListener(new ConvertHandler());


        // Create a new panel, using the panel reference
        panel11 = new JPanel();

        // Add button to panel
        panel11.add(convertButton);
    }


    private class ConvertHandler implements ActionListener {


        public void actionPerformed(ActionEvent e) {

            double totalExpenses = 0;
            double allowableExpenses = 0;
            double excessExpenses = 0;

            double meal;
            double parking;
            double taxi;
            double lodging;

            // Create double array and place text values into array

            double[] input = new double[10];

            // Assign each text box to their respective order on the list
            input[0] = Double.parseDouble(inputTextField1.getText());
            input[1] = Double.parseDouble(inputTextField2.getText());
            input[2] = Double.parseDouble(inputTextField3.getText());
            input[3] = Double.parseDouble(inputTextField4.getText());
            input[4] = Double.parseDouble(inputTextField5.getText());
            input[5] = Double.parseDouble(inputTextField6.getText());
            input[6] = Double.parseDouble(inputTextField7.getText());
            input[7] = Double.parseDouble(inputTextField8.getText());
            input[8] = Double.parseDouble(inputTextField9.getText());
            input[9] = Double.parseDouble(inputTextField10.getText());

            // iterate through each valid cost, starting at airfare

            for (int i = 1; i < input.length; i++) {

                // Exclude number of miles driven in personal car
                if (i != 3) {

                    // Add text entry to total
                    totalExpenses = (totalExpenses + (input[i]));
                }

            }

            // Calculate maximum possible reimbursements

            if (input[8] < input[0] * 37) {
                meal = input[8];
            }
            else {
                meal = input[0] * 37;
            }

            if (input[4] < input[0] * 10) {
                parking = input[4];
            }
            else {
                parking = input[0] * 10;
            }

            if (input[5] < input[0] * 20) {
                taxi = input[5];
            }
            else {
                taxi = input[0] * 20;
            }

            if (input[9] < input[0] * 95) {
                lodging = input[9];
            }
            else {
                lodging = input[0] * 95;
            }

            // Total up all allowable expenses
            allowableExpenses = ((input[3] * 0.27) + meal + parking + taxi + lodging);


            // Subtract reimbursements from total expenses
            excessExpenses = (totalExpenses - allowableExpenses);
            // When the excess expenses are below 0...
            if (excessExpenses < 0) {
                // ...the excess expenses are set to zero
                excessExpenses = 0;
            }


            // Place results into string, rounded to 2 decimals
            String results = String.format("Total expenses: $%.2f\nAllowable expenses: $%.2f\nExcess expenses to be paid by employee: $%.2f", totalExpenses, allowableExpenses, excessExpenses);

            // Display the result
            JOptionPane.showMessageDialog(null, results);

        }
    }
}