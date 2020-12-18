package com.github.stef2georg.codenjoyintellijplugin;

import com.intellij.icons.AllIcons;
import com.intellij.ide.util.projectWizard.ModuleBuilder;
import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import com.intellij.ide.util.projectWizard.ProjectWizardStepFactory;
import com.intellij.ide.util.projectWizard.SettingsStep;
import com.intellij.openapi.module.ModuleType;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class CodenjoyModuleType extends ModuleType<CodenjoyModuleBuilder> {
    private static final CodenjoyModuleType INSTANCE = new CodenjoyModuleType();

    public CodenjoyModuleType() {
        super("CODENJOY_MODULE");
    }

    public static CodenjoyModuleType getInstance() {
        return INSTANCE;
    }

    @Override
    public @NotNull CodenjoyModuleBuilder createModuleBuilder() {
        return new CodenjoyModuleBuilder();
    }

    @Override
    public @NotNull @Nls(capitalization = Nls.Capitalization.Title) String getName() {
        return "Codenjoy";
    }

    @Override
    public @NotNull @Nls(capitalization = Nls.Capitalization.Sentence) String getDescription() {
        return "Play in Codenjoy";
    }

    @Override
    public @NotNull Icon getNodeIcon(boolean isOpened) {
        return AllIcons.Toolwindows.ToolWindowBuild;
    }

    @Override
    public ModuleWizardStep modifyProjectTypeStep(@NotNull SettingsStep settingsStep, @NotNull final ModuleBuilder moduleBuilder) {
        return ProjectWizardStepFactory.getInstance().createJavaSettingsStep(settingsStep, moduleBuilder, moduleBuilder::isSuitableSdkType);
    }
}
