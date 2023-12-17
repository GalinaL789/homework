package de.ait.kassapparat;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.BreakIterator;
import javax.swing.JTextField;


public class EqualsButtonListener implements ActionListener {
    private JTextField inputField;
    private JTextField outputArea;

    public EqualsButtonListener(JTextField inputField, JTextField outputArea) {
        this.inputField = inputField;
        this.outputArea = outputArea;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String expression = inputField.getText();
        try {
// Вычисление результата выражения и вывод в окно
            double result = evaluateExpression(expression);
            outputArea.setText(expression + " = " + result);
        } catch (NumberFormatException ex) {
            outputArea.setText("Ошибка в выражении");
        }
    }

    private double evaluateExpression(String expression) {
        double result=Double.parseDouble(expression);
        result+=result;
        return result;
// Реализуйте логику вычисления выражения
// Замените этот код на вашу логику
// return 0.0;
    }
}
