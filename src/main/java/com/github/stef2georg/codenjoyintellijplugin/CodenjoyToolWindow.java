package com.github.stef2georg.codenjoyintellijplugin;

import javax.swing.*;

public class CodenjoyToolWindow {
    private JPanel mainPanel;
    private JTabbedPane tabbedPanel;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JComboBox serverComboBox;
    private JButton connectButton;

    public CodenjoyToolWindow() {
        connectButton.addActionListener(event -> {
            System.out.println("Clicked");
            System.out.println(emailField.getText());
            System.out.println(passwordField.getPassword());
            System.out.println(serverComboBox.getSelectedItem());
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
