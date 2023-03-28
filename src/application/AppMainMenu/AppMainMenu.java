package application.AppMainMenu;

import java.util.Scanner;

public class AppMainMenu {
    public static void loadMenu(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("<< Welcome to app menu (select a number) >>");
        System.out.println("1- View account\n2- Update account\n3- Delete account");
        byte userChose = scanner.nextByte();

        
    }
}
