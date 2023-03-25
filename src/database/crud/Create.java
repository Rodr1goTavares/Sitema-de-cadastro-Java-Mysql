package database.crud;

import database.Dao;
import database.models.AccountModel;

import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Create {
    public static void insertAccount(AccountModel account){       
        try{
            String sql = "INSERT INTO accounts (id, username, email) VALUES (?, ?, ?)";
            PreparedStatement statement = Dao.connectDB().prepareStatement(sql);
            statement.setInt(1, account.getId());
            statement.setString(2, account.getUser());
            statement.setString(3, account.getEmail());
            statement.execute();

            System.out.println("Register successfullyy !!!");
        }
        catch(SQLException error){
            System.out.println("A error as ocurred to insert user: " + error);
        }
    }
}
