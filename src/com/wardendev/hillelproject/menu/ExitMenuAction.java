package com.wardendev.hillelproject.menu;

public class ExitMenuAction implements IMenuAction {

    @Override
    public String getName() {
        return "Exit Program";
    }

    @Override
    public void execute() {
        System.out.println("\nStopping program...");
    }

    @Override
    public boolean closeAfter() {
        return true;
    }

}
