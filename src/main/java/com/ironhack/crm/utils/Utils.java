package com.ironhack.crm.utils;

import com.ironhack.crm.models.Oportunity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
    public static void lookUpOportunity(Oportunity oportunity){
        System.out.println(oportunity.toString());
    }

    //Returns the number introduced by the customer within the command. If command is not valid returns 0.
    public static int validateConversionCommand(String command){
        int id = 0;
        try {
            if(command.substring(0, 8).toLowerCase().equals("convert ")){
                String leadId = command.substring(8, command.length());
                try{
                    id = Integer.parseInt(leadId);
                }
                catch (NumberFormatException ex){
                    ex.printStackTrace();
                    id =0;
                }
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("The command you entered is not valid");
        }finally {
            return id;
        }

    }

    //Returns the number introduced by the customer within the command. If command is not valid returns 0.
    public static int validateLookUpOpportunityCmd(String command){
        int id=0;
        try{
            if(command.substring(0, 19).toLowerCase().equals("lookup opportunity ")){
                String leadId = command.substring(19, command.length());
                try{
                    id = Integer.parseInt(leadId);
                }
                catch (NumberFormatException ex){
                    ex.printStackTrace();
                    id = 0;
                }
            }else{
                id = 0;
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("The command you entered is not valid");
        }finally {
            return id;
        }
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
}
