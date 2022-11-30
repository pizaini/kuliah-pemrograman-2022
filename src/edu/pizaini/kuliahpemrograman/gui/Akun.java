package edu.pizaini.kuliahpemrograman.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class Akun {
    private JPanel mainPanel;
    private JTextField textUsername;
    private JTextField textNama;
    private JPasswordField textPassword;
    private JButton buttonProcess;
    private JTextArea textArea;
    private JButton loadFileButton;
    private JTextArea textLoadFile;

    public Akun() {
        buttonProcess.addActionListener(actionEvent -> {
            this.writeToFile();
        });
        loadFileButton.addActionListener(actionEvent -> {
            this.loadFile();
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    private void writeToFile(){
        try {
            FileWriter fileWriter = new FileWriter("data_akun.data", true);
            fileWriter.write("tesss");
            fileWriter.write("\n");
            fileWriter.close();
            JOptionPane.showMessageDialog(this.mainPanel,"Sukses");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this.mainPanel, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void loadFile(){
        File file = new File("data_akun.data");
        if(!file.exists()){
            JOptionPane.showMessageDialog(this.mainPanel, "File tidak ada", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            this.textLoadFile.setText("");
            try {
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()){
                    String textData = scanner.nextLine();
                    textLoadFile.append(textData);
                }
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(this.mainPanel, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        }
    }
}
