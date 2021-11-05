import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;


public class RPGCharacterGUI {

    static JTextField input, input2, input3, input4;
    static JLabel results;
    Color lightGray= new Color(115,115,115);

    public RPGCharacterGUI() {
        JFrame window= new JFrame("RPG Ting");
        JPanel panel = new JPanel();
        input=new JTextField(15);
        input2=new JTextField(15);
        input3=new JTextField(15);
        input4=new JTextField(15);

        JLabel inputLabel=new JLabel("Enter Your  Strength level: ");
        JLabel inputLabel2=new JLabel("Enter Your Intelligence Level: ");
        JLabel inputLabel3=new JLabel("Enter Your Leadership Level: ");
        JLabel inputLabel4=new JLabel("Enter Your Karma Level: ");

        JButton button = new JButton("Calculate Final Battle Power");


        results= new JLabel("00.0");

        window.setSize(200, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        button.addActionListener(new ButtonListener());


        button.setBackground(Color.CYAN);
        panel.setBackground(lightGray);
        panel.add(inputLabel);
        panel.add(input);
        panel.add(inputLabel2);
        panel.add(input2);
        panel.add(inputLabel3);
        panel.add(input3);
        panel.add(inputLabel4);
        panel.add(input4);

        panel.add(button);
        panel.add(results);
        window.add(panel);
        window.setVisible(true);

    }



    private static class ButtonListener implements ActionListener{
        DecimalFormat round= new DecimalFormat("##");
        public void actionPerformed(ActionEvent e) {
          double strength=Double.parseDouble(input.getText());
          double Intell=Double.parseDouble(input2.getText());
          double Leader=Double.parseDouble(input3.getText());
          double Karma=Double.parseDouble(input4.getText());
             results.setText(String.valueOf(round.format(strength*Intell/Leader+Karma)));




        }
    }














}





















