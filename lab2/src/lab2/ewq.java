package lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ewq<T extends Number & Comparable<T>> extends JFrame {
    private ArrayList<T> myList = new ArrayList<>();
    private JTextField inputField;  // JTextField for input
    private ArrayList<T> massiv = new ArrayList<>();  // ArrayList for storing input numbers

    public ewq() {
        setTitle("Generic List");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton addButton = new JButton("Add Element");
        JButton displayButton = new JButton("Display Elements");
        JButton removeButton = new JButton("Remove Element");
        JButton sortButton = new JButton("Sort Elements");
        JButton checkEmptyButton = new JButton("Check if Empty");
        JButton sumButton = new JButton("Get Sum");

        inputField = new JTextField();  // Initialize the JTextField

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addElement();
            }
        });

        displayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayElements();
            }
        });

        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                removeElement();
            }
        });

        sortButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sortElements();
            }
        });

        checkEmptyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkEmpty();
            }
        });

        sumButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getSum();
            }
        });

        setLayout(new GridLayout(4, 2));  // Increased the grid layout to accommodate the new JTextField
        add(new JLabel("Enter Number:"));  // Add label
        add(inputField);  // Add the JTextField
        add(addButton);
        add(displayButton);
        add(removeButton);
        add(sortButton);
        add(checkEmptyButton);
        add(sumButton);
    }

    private void addElement() {
        String input = inputField.getText();  // Get input from JTextField
        try {
            T element = (T) Double.valueOf(input);
            myList.add(element);
            massiv.add(element);  // Store the input number in the 'massiv'
            JOptionPane.showMessageDialog(this, "Element added.");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter a numeric value.");
        }
    }

    // Other methods remain unchanged

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ewq<Double>().setVisible(true);
            }
        });
    }
}
