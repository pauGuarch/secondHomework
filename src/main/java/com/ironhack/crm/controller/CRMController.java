package com.ironhack.crm.controller;

import com.ironhack.crm.utils.Utils;

import java.util.Scanner;

public class CRMController {

    public void runCRM() {

    }

    private void exitCRM() {
        System.exit(0);
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
}
