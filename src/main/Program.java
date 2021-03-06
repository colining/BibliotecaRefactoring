package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

    private static Menu menu;
    public static boolean loggedIn = false;
    public static String savedLibraryNumber = "";

    public static void main(String[] args) {
        menu=new Menu();
        while (true) {
            menu.displayStartMenu();

            if (menu.chooseOptionFromMenu()) break;
        }
    }

    public static void displayBookList() {
        System.out.println(" 1. Sweet Valley High vol. 4 by John Travolta ");
        System.out.println(" 2. eXtreme Programming Explained by Kent Beck ");
        System.out.println(" 3. How to Win Friends and Influence People by Dale Carnagie ");
        System.out.println(" 4. How to Cheat at TWU Assignements by Anonymous ");
    }

    public static void displayMovieList() {
        System.out.println(new Movie("Rocky", "John G. Avildsen", "10"));
        System.out.println(new Movie("Rocky II", "John G. Avildsen", "9"));
        System.out.println(new Movie("Rocky III", "John G. Avildsen", "8"));
        System.out.println(new Movie("Rocky IV", "John G. Avildsen", "7"));
        System.out.println(new Movie("Rocky V", "John G. Avildsen", "8"));
        System.out.println(new Movie("Drainage", "Francisco Trindade", "N/A"));
        System.out.println(new Movie("The Shawshank Redemption", "Frank Darabont", "10"));
        System.out.println(new Movie("The Godfather", "Francis Ford Coppola", "7"));
        System.out.println(new Movie("Inception", "Frank Darabont", "10"));
        System.out.println(new Movie("Pulp Fiction", "Quentin Tarantino", "6"));
    }

    public static String getStringInput() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userChoice = reader.readLine();
        return userChoice;

    }

    public static int getUserInput() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int userChoice = Integer.parseInt(reader.readLine());
            return userChoice;
        } catch (Exception e) {

        }
        return 0;
    }

    public static boolean validPassword(String password) {
        return "bhaisahab".equals(password);
    }


    public static void clearLogin() {
        loggedIn = false;
        savedLibraryNumber = "";
    }
}

