    package com.ironhack.crm.controller;

    import com.ironhack.crm.domain.classes.CRM;
    import com.ironhack.crm.utils.Utils;
    import com.ironhack.crm.utils.UtilsUserInputs;
    import com.ironhack.crm.view.CRMView;
    import org.apache.tomcat.util.security.Escape;

    import java.io.IOException;
    import java.util.Scanner;
    import java.util.UUID;

    import static com.ironhack.crm.utils.UtilsUserInputs.validateEmail;

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
            String option = showMenu("menu-options");
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
                        case "menu-options":
                            System.out.println("Please introduce a valid command:");
                            String key = new Scanner(System.in).nextLine();
                            while (!key.equals("new lead") && !key.equals("lookup lead") && !key.equals("show leads") && !key.equals("4") && !key.equals("5") && !key.equals("EXIT") && !key.equals("BACK")) {
                                System.out.println("Please insert a valid command:");
                                key = new Scanner(System.in).nextLine();
                            }
                            switch (key){
                                case "new lead":
                                    System.out.println("\nYou are about to create a new Lead, read carefully the instructions.\n");
                                    crm.createNewLead(UtilsUserInputs.getUserLeadInput());
                                    System.out.println("\n!! Lead created successfully !!\n");
                                    option = "menu-options";
                                    break;
                                case "lookup lead":
                                    Utils.showLead(crm.lookUpLead(UUID.fromString(UtilsUserInputs.getLeadIdInput())));
                                    option = "menu-options";
                                    break;
                                case "show leads":
                                    Utils.showLeads(crm.checkLeads());
                                    option = "menu-options";
                                    break;
                                case "convert":
                                    //TODO
                                    option = "menu-options";
                                break;
                            case "5":
                                option = "products";
                                break;
                            default:
                                option = key;
                            }
                            clearConsole();
                            break;

                    /*case "new lead":
                        crm.createNewLead(UtilsUserInputs.getUserLeadInput());
                        option = "menu-options";
                        clearConsole();
                        break;

                        case "lookup lead":
                            crm.lookUpLead(UUID.fromString(UtilsUserInputs.getLeadIdInput()));
                            option = "menu-options";
                            clearConsole();
                            break;
                            case "opportunity":
                            System.out.println("Please introduce a valid command:");
                            key = new Scanner(System.in).nextLine();
                            while (!key.equals("1") && !key.equals("2")  && !key.equals("3") && !key.equals("EXIT") && !key.equals("BACK")) {
                                System.out.println("Please insert a valid command:");
                                key = new Scanner(System.in).nextLine();
                            }
                            switch (key){
                                case "1":
                                    crm.lookUpOpportunity(UUID.fromString(UtilsUserInputs.getOpportunityIdInput()));
                                    option = "opportunity";
                                    break;
                                case "2":
                                    Utils.showOpportunities(crm.checkOpportunities());
                                    option = "opportunity";
                                    break;
                                    case "3": // Made by Pau
                                        String opportunityUUID = UtilsUserInputs.getOpportunityIdInput();
                                        int opportunityStatus = UtilsUserInputs.getOpportunityStatus();
                                        crm.editOpportunityStatus(opportunityUUID, opportunityStatus);

                                        option = "opportunity";
                                    break;
                                case "BACK":
                                    option = "menu-options";
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
                                option = "menu-options";
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
                                Utils.showContacts(crm.checkContacts());
                                option = "contacts";
                                break;
                            case "BACK":
                                option = "menu-options";
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
                                option = "menu-options";
                                break;
                            default:
                                option = key;
                        }
                        clearConsole();
                        break;
                    default: exitCRM();*/
                }
            } catch (IOException e) {
                exitCRM();
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

        private static void clearConsole() {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
