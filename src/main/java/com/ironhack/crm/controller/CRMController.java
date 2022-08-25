package com.ironhack.crm.controller;
import com.ironhack.crm.domain.classes.CRM;
import com.ironhack.crm.utils.Utils;
import com.ironhack.crm.view.CRMView;
import org.apache.tomcat.util.security.Escape;

import java.io.IOException;
import java.util.Scanner;

public class CRMController {
    private static CRMView crmView;
    private static CRM crm;

    public static void runCRM() {
        initializeCRM();
        runWindowsHandler();
    }

    private static void initializeCRM() {
        crm = new CRM();
        crmView = new CRMView();
    }


    private static void runWindowsHandler() {
        String option = showMenu("welcome");
        while(!option.equals("EXIT")) {
            option = showMenu(option);
        }
        exitCRM();
    }

    private static void exitCRM() {
        System.exit(0);
    }

    private static String showMenu(String menu) {
        String option = "";
        try {
            crmView.showMenu(menu);
            switch (menu) {
                case "welcome":
                    System.out.println("Please introduce a valid command:");
                    String key = new Scanner(System.in).nextLine();
                    while (!key.equals("1") && !key.equals("2") && !key.equals("3") && !key.equals("4") && !key.equals("5") && !key.equals("EXIT") && !key.equals("BACK")) {
                        System.out.println("Please insert a valid command:");
                        key = new Scanner(System.in).nextLine();
                    }
                    switch (key){
                        case "1":
                            option = "lead";
                            break;
                        case "2":
                            option = "opportunity";
                            break;
                        case "3":
                            option = "account";
                            break;
                        case "4":
                            option = "contacts";
                            break;
                        case "5":
                            option = "products";
                            break;
                        default:
                            option = key;
                    }
                    clearConsole();
                    break;

                case "lead":
                    System.out.println("Please introduce a valid command:");
                    key = new Scanner(System.in).nextLine();
                    while (!key.equals("1") && !key.equals("2") && !key.equals("3") && !key.equals("4") && !key.equals("EXIT") && !key.equals("BACK")) {
                        System.out.println("Please insert a valid command:");
                        key = new Scanner(System.in).nextLine();
                    }
                    switch (key){
                        case "1":
                            //TODO Create lead
                            option = "lead";
                            break;
                        case "2":
                            //TODO Show a specific lead
                            option = "lead";
                            break;
                        case "3":
                            //TODO Show all leads
                            option = "lead";
                            break;
                        case "4":
                            //TODO Convert lead to opportunity
                            option = "lead";
                            break;
                        case "BACK":
                            option = "welcome";
                            break;
                        default:
                            option = key;
                    }
                    clearConsole();
                    break;
                case "opportunity":
                    System.out.println("Please introduce a valid command:");
                    key = new Scanner(System.in).nextLine();
                    while (!key.equals("1") && !key.equals("2") && !key.equals("3") && !key.equals("4") && !key.equals("EXIT") && !key.equals("BACK")) {
                        System.out.println("Please insert a valid command:");
                        key = new Scanner(System.in).nextLine();
                    }
                    switch (key){
                        case "1":
                            //TODO To view a specific Opportunity
                            option = "opportunity";
                            break;
                        case "2":
                            //TODO To view all Opportunities
                            option = "opportunity";
                            break;
                        case "3":
                            //TODO To search a specific decision maker
                            option = "opportunity";
                            break;
                        case "4":
                            //TODO To search all decision makers
                            option = "opportunity";
                            break;
                        case "BACK":
                            option = "welcome";
                            break;
                        default:
                            option = key;
                    }
                    clearConsole();
                    break;

                case "account":
                    System.out.println("Please introduce a valid command:");
                    key = new Scanner(System.in).nextLine();
                    while (!key.equals("1") && !key.equals("2") && !key.equals("3") && !key.equals("4") && !key.equals("EXIT") && !key.equals("BACK")) {
                        System.out.println("Please insert a valid command:");
                        key = new Scanner(System.in).nextLine();
                    }
                    switch (key){
                        case "1":
                            //TODO To manage a specific account
                            option = "account";
                            break;
                        case "2":
                            //TODO To access all accounts
                            option = "account";
                            break;
                        case "3":
                            //TODO To access a list of contacts
                            option = "account";
                            break;
                        case "4":
                            //TODO To access a list of opportunities
                            option = "account";
                            break;
                        case "BACK":
                            option = "welcome";
                            break;
                        default:
                            option = key;
                    }
                    clearConsole();
                    break;

                case "contacts":
                    System.out.println("Please introduce a valid command:");
                    key = new Scanner(System.in).nextLine();
                    while (!key.equals("1") && !key.equals("2")  && !key.equals("EXIT") && !key.equals("BACK")) {
                        System.out.println("Please insert a valid command:");
                        key = new Scanner(System.in).nextLine();
                    }
                    switch (key){
                        case "1":
                            //TODO To access a contact specific
                            option = "contacts";
                            break;
                        case "2":
                            //TODO To access all the contacts
                            option = "contacts";
                            break;
                        case "BACK":
                            option = "welcome";
                            break;
                        default:
                            option = key;
                    }
                    clearConsole();
                    break;

                case "products":
                    System.out.println("Please introduce a valid command:");
                    key = new Scanner(System.in).nextLine();
                    while (!key.equals("1") && !key.equals("2")  && !key.equals("3") && !key.equals("EXIT") && !key.equals("BACK")) {
                        System.out.println("Please insert a valid command:");
                        key = new Scanner(System.in).nextLine();
                    }
                    switch (key){
                        case "1":
                            //TODO Search a product by an id
                            option = "products";
                            break;
                        case "2":
                            //TODO Search a product by name
                            option = "products";
                            break;
                        case "3":
                            //TODO Search a product by type
                            option = "products";
                            break;
                        case "BACK":
                            option = "welcome";
                            break;
                        default:
                            option = key;
                    }
                    clearConsole();
                    break;
                default: exitCRM();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return option;
    }
    private static String getLeadNameInput(){
        boolean isName = false;
        String name = "";
        Scanner input = new Scanner(System.in);

        while (!isName) {
            System.out.print("Please input lead's 'First Middle and Last' name: ");
            name = input.nextLine();
            isName = (name.trim().split("\\s+").length == 3);
            if (!isName) {
                System.out.print("\nEnter your name as 'First Middle Last': ");
            }
        }
        return name;
    }

    private static String getCompanyNameInput(){
        String companyName = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the lead's company name: ");
        companyName = input.nextLine();
        return companyName;
    }

    private static String getLeadEmailInput(){
        boolean isEmail = false;
        String email = "";
        Scanner input = new Scanner(System.in);

        while (!isEmail) {
            System.out.print("Please input lead's email: ");
            email = input.nextLine();
            isEmail = Utils.validateEmail(email);
            if (!isEmail) {
                System.out.print("\nPlease input lead's email: ");
            }
        }
        return email;
    }

    private static String getLeadPhoneNumberInput(){
        boolean isPhoneNumber = false;
        String phoneNumber = "";
        Scanner input = new Scanner(System.in);
        while (!isPhoneNumber) {
            System.out.print("Please input lead's phone number: ");
            phoneNumber = input.nextLine();
            if (phoneNumber.isEmpty()==false) isPhoneNumber = true;
            if (!isPhoneNumber) {
                System.out.print("\nPlease input phone number: ");
            }
        }
        return phoneNumber;
    }
    private static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
