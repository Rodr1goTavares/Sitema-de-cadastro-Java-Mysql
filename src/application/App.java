package application;

import java.util.Scanner;

public class App {
    private static Scanner App(){
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    public static void start(){

        System.out.println("login(L) or register(R)");
        String userChose = App().nextLine();

        if (userChose.equals("L") || userChose.equals("l")){
            loginMenu();
        }
        else if (userChose.equals("R") || userChose.equals("r")) {
            registerMenu();
        }
        else {
            System.out.println("Slelect a valid option");
        }
    }

    private static void loginMenu(){
        System.out.println("<< Login >>");

        System.out.println("User:");
        String user = App().nextLine();
        
        System.out.println("Email:");
        String email = App().nextLine();
        
    }

    private static void registerMenu(){
        System.out.println("User:");
        String user = App().nextLine();

        System.out.println("Email:");
        String email = App().nextLine();

        System.out.print("<< Confirm register >>\nYour user: " + user + "\nYou email: " + email + "\nConfirm account and crate ? (Y) to confirm, (N) to cancel");
        String userConfirmation = App().nextLine();

        if (userConfirmation.equals("Y") || userConfirmation.equals("y")){
            System.out.println("Registering...");
            Register.createAccount(user, email);
        }
        else{
            System.out.println("Canceled");
            return;
        }

    }
}
