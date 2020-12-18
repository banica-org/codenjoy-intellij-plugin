package com.github.stef2georg.codenjoyintellijplugin;

import com.intellij.ide.util.projectWizard.JavaModuleBuilder;
import com.intellij.openapi.module.ModuleType;

public class CodenjoyModuleBuilder extends JavaModuleBuilder {
    @Override
    public ModuleType<CodenjoyModuleBuilder> getModuleType() {
        return CodenjoyModuleType.getInstance();
    }
}
