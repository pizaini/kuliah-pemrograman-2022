package edu.pizaini.kuliahpemrograman;

import java.util.Scanner;

public class CheckUser {
    public static void main(String[] args) {
        String username = "budi";
        String password = "123";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Username = ");
        String inputUsername = scanner.nextLine();
        System.out.println();
        System.out.print("Password = ");
        String inputPassword = scanner.nextLine();

        if(username.equals(inputUsername)){
            if(password.equals(inputPassword)){
                System.out.println("Selamat datang");
            }else{
                System.out.println("Password SALAH");
            }
        }else {
            System.out.println("Username salah");
        }
    }
}
