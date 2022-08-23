package com.ironhack.crm.utils;

import com.ironhack.crm.domain.enums.ProductType;
import com.ironhack.crm.domain.models.Lead;
import com.ironhack.crm.domain.models.Product;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UtilsUserInputs {

    public static String getAccountCountryInput() {
        Scanner input = new Scanner(System.in);
        String accountCountry = "";
        boolean isValidCountry = false;
        while (!isValidCountry) {
                System.out.print("Please input the city for the account that you want to create: ");
                try {
                    accountCountry = input.nextLine();
                    isValidCountry = true;
                } catch (InputMismatchException a) {

                }
        }
        return accountCountry;
    }

    public static String getAccountCityInput() {
        Scanner input = new Scanner(System.in);
        String accountCity = "";
        boolean isValidCity = false;
        while (!isValidCity) {
                System.out.print("Please input the city for the account that you want to create: ");
                try {
                    accountCity = input.nextLine();
                    isValidCity = true;
                } catch (InputMismatchException a) {

                }
        }
        return accountCity;
    }

    public static String getAccountIndustryInput() {
        Scanner input = new Scanner(System.in);
        String accountIndustry = "";
        boolean isValidName = false;
        while (!isValidName) {
                System.out.print("Please input the industry for the account that you want to create: ");
                try {
                    accountIndustry = input.nextLine();
                    isValidName = true;
                } catch (InputMismatchException a) {

                }
        }
        return accountIndustry;
    }

    public static int getEmployeesNumberInput(){
        Scanner input = new Scanner(System.in);
        boolean isValidQuantity = false;
        int productQuantity = 0;
        while(!isValidQuantity) {
            System.out.print("Please input the number of employees of the account: ");
            try {
                productQuantity = Integer.parseInt(input.nextLine());
                if (productQuantity >0 && productQuantity<1000000) {
                    isValidQuantity = true;
                }
            } catch (NumberFormatException num) {

            }
        }
        return productQuantity;
    }

    public static int getProductQuantityInput(){
        Scanner input = new Scanner(System.in);
        boolean isValidQuantity = false;
        int productQuantity = 0;
        while(!isValidQuantity) {
            System.out.print("Please input the product quantity for the Opportunity ");
            try {
                productQuantity = Integer.parseInt(input.nextLine());
                if (productQuantity >0) {
                    isValidQuantity = true;
                }
            } catch (NumberFormatException num) {

            }
        }
        return productQuantity;
    }

    public static Product createProduct(){
        Scanner input = new Scanner(System.in);
        String productName = null;
        int productTypeIndex = 0;
        boolean isValidEnum = false;
        boolean isValidName = false;
        while(!isValidName || !isValidEnum) {
            if(!isValidName) {
                System.out.print("Please input the product name that you want to create: ");
                try {
                    productName = input.nextLine();
                    isValidName = true;
                } catch (InputMismatchException a) {

                }
            }
            if(!isValidEnum) {
                System.out.print("Please input the product type number : BOX(1), FLATBED(2), HYBRID(3)  ");
                try {
                    productTypeIndex = Integer.parseInt(input.nextLine());
                    if (productTypeIndex >= 1 && productTypeIndex <= 3) {
                        isValidEnum = true;
                    }
                } catch (NumberFormatException num) {

                }
            }
        }


        ProductType productType = ProductType.values()[productTypeIndex-1];
        return new Product(productName, productType);
    }

    public static String getLeadIdInput(){
        System.out.print("Please input the lead's UUID that you want to convert: ");
        Scanner input = new Scanner(System.in);
        String someUUID = input.nextLine();
        while(!isUUID(someUUID)){
                System.out.print("Please input the lead's UUID that you want to convert: ");
                someUUID = input.nextLine();
        }
        return someUUID;
    }

    public static Lead getUserLeadInput(){
        return new Lead(getLeadNameInput(), getCompanyNameInput(), getLeadEmailInput(), getLeadPhoneNumberInput());
    }


    public static boolean validateEmail(String email){
        String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        boolean validate = false;
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);
        if(m.matches()){
            validate=true;
        }
        return validate;
    }
    static boolean isUUID(String string) {
        try {
            UUID.fromString(string);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    private static String getLeadNameInput(){
        boolean isName = false;
        String name = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Please input lead's 'FirstName MiddleName  LastName' format: ");
        while (!isName) {
            name = input.nextLine();
            isName = (name.trim().split("\\s+").length == 3);
            if (!isName) {
                System.out.print("\nEnter your name as 'FirstName MiddleName  LastName' format: ");
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
        System.out.print("Please input lead's email: ");
        while (!isEmail) {
            email = input.nextLine();
            isEmail = validateEmail(email);
            if (!isEmail) {
                System.out.print("\nPlease input lead's email with correct format (name@domain.example): ");
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
