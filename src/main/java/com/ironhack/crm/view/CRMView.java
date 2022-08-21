package com.ironhack.crm.view;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CRMView {
    private String text;
    private String options;

    public CRMView() {
    }

    private String showMenu(String menu) throws IOException {
        setText(readMenu(menu));
        printMenu();
        String option = "";
        return option;
    }

    public String showOptions(String option) throws IOException {
        String menu = "";
        setOptions(readOption(option));
        printOption();
        return menu;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    private String readMenu(String menu) throws IOException {
        //TODO
        return Files.readString(Paths.get("src/resources/menu/"+menu+".txt"));
    }

    private String readOption(String option) throws IOException {
        //TODO
        return Files.readString(Paths.get("src/resources/option/"+option+".txt"));
    }

    private void printMenu() {
        System.out.println(text);
    }

    private void printOption() {
        System.out.println(options);
    }

}
