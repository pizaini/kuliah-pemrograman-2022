package edu.pizaini.kuliahpemrograman;

import javax.swing.*;

public class CheckUserByInput {
    public static void main(String[] args) {
        String username = "budi";
        String password = "123";
        String inputUsername = JOptionPane.showInputDialog("Username Anda");
        String inputPassword = JOptionPane.showInputDialog("Passsword Anda");

        if(username.equals(inputUsername)){
            if(password.equals(inputPassword)){
                JOptionPane.showMessageDialog(null, "Selamat Datang");
            }else{
                JOptionPane.showMessageDialog(null, "Password SALAH");
            }
        }else {
            JOptionPane.showMessageDialog(null, "Usename "+inputUsername+" SALAH");
        }
    }
}
