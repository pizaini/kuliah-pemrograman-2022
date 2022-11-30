package edu.pizaini.kuliahpemrograman.gui;

import edu.pizaini.kuliahpemrograman.Mahasiswa;

import javax.swing.*;

public class RunAppAkun {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
        JFrame jFrame = new JFrame("App Akun");
        jFrame.setContentPane(new Akun().getMainPanel());
        jFrame.setSize(500, 400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

    }
}
