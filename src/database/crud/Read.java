package database.crud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.Dao;

public class Read {
    public static void verifyDBaccount(String user, String email){
        try {
            String sql = "SELECT username, email FROM accounts WHERE username = ? AND email = ?";
            PreparedStatement readDatabase = Dao.connectDB().prepareStatement(sql);

            readDatabase.setString(1, user);
            readDatabase.setString(2, email);

            ResultSet readResult = readDatabase.executeQuery();

            if (readResult.next()){
                System.out.println("Login successfully");

                System.out.println("User in database:" + readResult.getString("username"));
                System.out.println("email in databaase" + readResult.getString("email"));
            }
            else {
                System.out.println("Error to login: User or Email incorrect");
            }
        }
        catch(SQLException error){
            System.out.println("Error to read database: " + error);
        }
    }
}
