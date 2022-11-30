package edu.pizaini.kuliahpemrograman.mobil;

import edu.pizaini.kuliahpemrograman.gui.Akun;

import javax.swing.*;

public class RunMobil {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
        JFrame jFrame = new JFrame("App Mobil");
        jFrame.setContentPane(new GuiMobil().getMainPanel());
        jFrame.setSize(500, 400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
