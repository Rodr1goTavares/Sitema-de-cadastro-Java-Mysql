package application;

import java.util.Random;

import database.crud.Create;
import database.models.AccountModel;

public class Register {
    public static void createAccount(String user, String email){
        AccountModel account =  new AccountModel(user, email, generateId());
        Create.insertAccount(account);
    }

    private static int generateId(){
        Random random = new Random();
        int id = random.nextInt(1000);
        return id;
    }
}
