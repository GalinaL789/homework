package de.ait.kassapparat;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class DigitButtonListener implements ActionListener {
    private JTextField inputField; // Используйте JTextField для ввода текста

    public DigitButtonListener(JTextField inputField) {
        this.inputField = inputField;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        String currentText = inputField.getText();
        inputField.setText(currentText + source.getText());

    }
}