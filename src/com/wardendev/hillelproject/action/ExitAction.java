package com.wardendev.hillelproject.action;

public class ExitAction extends UserAction {

    @Override
    public void doAction() {
        System.exit(0);
    }

    @Override
    public String getActionName() {
        return "Finish the program";
    }

}
