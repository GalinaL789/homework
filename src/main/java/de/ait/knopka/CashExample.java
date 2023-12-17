package de.ait.knopka;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CashExample {

    private JFrame frame;
    private JTextArea inputField;
    private JTextArea displayArea;
    private JTextField productsField; // Добавлено новое поле для отображения продуктов


    private String currentInput = "";

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                new CashExample().initialize();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    private void initialize() {
        frame = new JFrame("Cash Register");
        frame.setSize(700, 600); // Увеличил размер фрейма
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        panel.add(new JScrollPane(displayArea), BorderLayout.CENTER);

        inputField = new JTextArea();
        inputField.setEditable(false);
        inputField.setText(" Здесь будет выведен товар и цена! ");
        panel.add(inputField, BorderLayout.CENTER);

        productsField = new JTextField();
        productsField.setEditable(true);
//productsField.setText("Введите название товара");
        panel.add(new JScrollPane(productsField), BorderLayout.SOUTH); // Отображение продуктов в левой части

        JPanel buttonPanel = createButtonPanel();
        buttonPanel.setSize(10,15);
        panel.add(buttonPanel, BorderLayout.EAST);

        frame.add(panel);
        frame.setVisible(true);
    }
    private JPanel createButtonPanel() {
        JPanel panel = new JPanel(new GridLayout(4, 3));
        panel.setSize(5,10);

        String[] buttonLabels = {
                "1", "2", "3",
                "4", "5", "6",
                "7", "8", "9",
                "C", "0", "Enter"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            panel.add(button);
        }

        return panel;
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String command = source.getText();

            switch (command) {
                case "C":
                    currentInput = "";
                    break;
                case "Enter":
                    if (!currentInput.isEmpty())
                    {currentInput = "\n" + productsField.getText() + " " + currentInput + "\n";}
                    break;
                default:
                    currentInput += command;
                    break;
            }
            inputField.setText(currentInput);
        }
    }
}
