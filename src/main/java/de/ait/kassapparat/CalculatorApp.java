package de.ait.kassapparat;

import java.awt.TextField;
import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp extends JFrame {
    private JTextField inputField;
    private JTextField outputArea;

    public CalculatorApp() {

// Настройка основного окна
        setTitle("Калькулятор");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

// Поле ввода
        inputField = new JTextField();
        inputField.setFont(new Font("Arial", Font.PLAIN, 20));
        add(inputField, BorderLayout.NORTH);

// Окно вывода
        outputArea = new JTextField();
        outputArea.setEditable(false);
        outputArea.setFont(new Font("Arial", Font.PLAIN, 20));
        JScrollPane scrollPane = new JScrollPane(outputArea);
        add(scrollPane, BorderLayout.CENTER);

// Панель с кнопками
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 3));

// Создание кнопок от 1 до 9
        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.setFont(new Font("Arial", Font.PLAIN, 20));
            button.addActionListener(new DigitButtonListener(inputField));
            buttonPanel.add(button);
        }
//// Кнопка "Enter"
        JButton enterButton = new JButton("Enter");
        enterButton.setFont(new Font("Arial", Font.PLAIN, 20));
        enterButton.addActionListener(new DigitButtonListener(inputField));
        buttonPanel.add(enterButton);
//// Кнопка "-"
        JButton minusButton = new JButton("-");
        minusButton.setFont(new Font("Arial", Font.PLAIN, 20));
        minusButton.addActionListener(new DigitButtonListener(inputField));
        buttonPanel.add(minusButton);
//// Кнопка "+"
        JButton plusButton = new JButton("+");
        plusButton.setFont(new Font("Arial", Font.PLAIN, 20));
        plusButton.addActionListener(new DigitButtonListener(inputField));
        buttonPanel.add(plusButton);
// Кнопка "0"
        JButton zeroButton = new JButton("0");
        zeroButton.setFont(new Font("Arial", Font.PLAIN, 20));
        zeroButton.addActionListener(new DigitButtonListener(inputField));
        buttonPanel.add(zeroButton);
// Кнопка "="
        JButton equalsButton = new JButton("=");
        equalsButton.setFont(new Font("Arial", Font.PLAIN, 20));
        equalsButton.addActionListener(new EqualsButtonListener(inputField, outputArea));
        buttonPanel.add(equalsButton);

// Добавление кнопок на панель
        add(buttonPanel, BorderLayout.SOUTH);

// Установка размеров и отображение окна
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}