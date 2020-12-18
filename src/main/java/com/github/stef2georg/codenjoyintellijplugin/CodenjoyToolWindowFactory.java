package com.github.stef2georg.codenjoyintellijplugin;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

public class CodenjoyToolWindowFactory implements ToolWindowFactory {
    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        CodenjoyToolWindow codenjoyToolWindow = new CodenjoyToolWindow();
        Content content = ContentFactory.SERVICE.getInstance().createContent(codenjoyToolWindow.getMainPanel(), "", false);
        toolWindow.getContentManager().addContent(content);
    }
}
