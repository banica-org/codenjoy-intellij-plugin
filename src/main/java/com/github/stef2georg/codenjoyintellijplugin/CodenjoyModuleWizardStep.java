package com.github.stef2georg.codenjoyintellijplugin;

import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import com.intellij.openapi.options.ConfigurationException;

import javax.swing.*;

public class CodenjoyModuleWizardStep extends ModuleWizardStep {
    private final CodenjoyModuleBuilder codenjoyModuleBuilder;
    private JPanel form;
    private JComboBox serverComboBox;
    private JTextField emailField;
    private JPasswordField passwordField;

    public CodenjoyModuleWizardStep(CodenjoyModuleBuilder codenjoyModuleBuilder) {
        this.codenjoyModuleBuilder = codenjoyModuleBuilder;
    }

    @Override
    public JComponent getComponent() {
        return form;
    }

    @Override
    public void updateDataModel() {

    }

    @Override
    public boolean validate() throws ConfigurationException {
        if (emailField.getText().isEmpty()) {
            throw new ConfigurationException("Please specify valid email");
        }

        return super.validate();
    }
}
