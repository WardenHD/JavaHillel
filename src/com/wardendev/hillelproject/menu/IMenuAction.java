package com.wardendev.hillelproject.menu;

public interface IMenuAction {
    String getName();
    void execute();
    boolean closeAfter();
}
