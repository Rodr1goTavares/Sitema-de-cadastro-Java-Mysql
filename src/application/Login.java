package application;

import database.crud.Read;

public class Login {
    public static void verifyAccount(String user, String email){
        System.out.println("Logging...");
        try{
            Read.verifyDBaccount(user, email);
        }
        catch (Exception error){
            System.out.println("Error to verify login (application): " + error);
        }
    }
}
