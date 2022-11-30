package edu.pizaini.kuliahpemrograman.mobil;

import javax.swing.*;

public class GuiMobil {
    private JPanel mainPanel;
    private JComboBox comboWarna;
    private JButton buttonIncreaseSpeed;
    private JButton buttonDecreaseSpeed;
    private JTextArea textStatus;
    private JButton buttonCekStatus;
    private JButton buttonClear;

    private Mobil mobil;

    public GuiMobil() {
        this.mobil = new Mobil();

        buttonCekStatus.addActionListener(actionEvent -> {
            showInfo();
        });
        buttonIncreaseSpeed.addActionListener(actionEvent -> {
            this.mobil.tambahKecepatan(1);
        });
        buttonDecreaseSpeed.addActionListener(actionEvent -> {
            this.mobil.kurangiKecepatan(1);
        });

        buttonClear.addActionListener(actionEvent -> {
            this.textStatus.setText(null);
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    private void showInfo(){
        this.mobil.setWarna(this.comboWarna.getSelectedItem().toString());
        this.textStatus.append(this.mobil.toString());
        this.textStatus.append("\n");
    }
}
