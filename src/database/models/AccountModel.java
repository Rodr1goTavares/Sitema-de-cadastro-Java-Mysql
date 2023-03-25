package database.models;

public class AccountModel {
    private String user;
    private String email;
    private int id;

    public AccountModel(String user, String email, int id){
        this.user = user;
        this.email = email;
        this.id = id;
    }

    public String getUser(){
        return this.user;
    }

    public String getEmail(){
        return this.email;
    }

    public int getId(){
        return this.id;
    }
}
