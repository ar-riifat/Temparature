package pack;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


class TemperatureConversion extends JFrame implements ActionListener{
    JTextField text1, text2, text3, text4;
    JButton btn1, btn2, btn3;
    JLabel l1, l2, l3, l4,l0;
    String s1,s2;
    double num1,num2, num3,numResult;
    TemperatureConversion() {

        Font f = new Font("Candara", Font.BOLD,30);
        Font f2 = new Font("Candara", Font.ITALIC,35);

        setTitle("Temperature Convertor");
        setSize(550, 400);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setBackground(Color.BLUE);

        l1 = new JLabel("C :");
        l1.setBounds(70, 20, 200, 30);
        l1.setFont(f);

        add(l1);
        text1 = new JTextField();
        text1.setBounds(190, 15, 200, 30);

        add(text1);

        l2 = new JLabel("F :");
        l2.setBounds(70, 70, 200, 30);
        l2.setFont(f);
        add(l2);
        text2 = new JTextField();
        text2.setBounds(190, 65, 200, 30);
        add(text2);

        l3 = new JLabel("K :");
        l3.setBounds(70, 130, 200, 30);
        l3.setFont(f);
        add(l3);
        text3 = new JTextField();
        text3.setBounds(190, 125, 200, 30);
        add(text3);

        l4 = new JLabel("Output :");
        l4.setBounds(70, 180, 200, 30);
        l4.setFont(f);
        add(l4);
        text4 = new JTextField();
        text4.setEditable(false);
        text4.setBounds(190, 175, 200, 30);
        text4.setBackground(Color.YELLOW);
        add(text4);

        btn1 = new JButton("C");
        btn1.setFont(f2);
        btn1.setFocusable(false);
        btn1.setBackground(Color.cyan);
        btn2 = new JButton("K");
        btn2.setFont(f2);
        btn2.setFocusable(false);
        btn2.setBackground(Color.pink);
        btn3 = new JButton("F");
        btn3.setFont(f2);
        btn3.setFocusable(false);
        btn3.setBackground(Color.gray);

        btn1.setBounds(80, 240, 70, 38);
        btn2.setBounds(200, 240, 70, 38);
        btn3.setBounds(320, 240, 70, 38);

        add(btn1);
        add(btn2);
        add(btn3);

        btn1.addActionListener(l -> {
            double ans=0 ;

            if(text1.getText().length()>0)
            {
                ans = Double.parseDouble(text1.getText());
            }

            else if(text2.getText().length()>0)
            {
                ans  = (Double.parseDouble(text2.getText())-32)*5/9;
            }
            else if(text3.getText().length()>0){

                ans = (Double.parseDouble(text3.getText()) - 273);
            }

            else{

                JOptionPane.showMessageDialog(null, "Input fields are empty!", "Warning", JOptionPane.WARNING_MESSAGE);
            }

            String s = String.valueOf(ans);

            if( s.length() > 7)
            {
                text4.setText(String.valueOf(ans).substring(0, 7));

            }
            else{
                text4.setText(s);
            }

            //t4.setText(String.valueOf(ans).substring(0, 7));

        });

        btn2.addActionListener(l ->{
            double ans  = 0;

            if(text1.getText().length()>0)
            {
                ans = Double.parseDouble(text1.getText());
            }

            else if(text2.getText().length() > 0)
            {
                ans = (Double.parseDouble(text2.getText())-32) * 5/9;
            }
            else if(text3.getText().length()>0)
            {
                ans = (Double.parseDouble(text3.getText())-273);

            }

            else{
                JOptionPane.showMessageDialog(null, "Input fields are empty!", "Warning", JOptionPane.WARNING_MESSAGE);
            }

            String s = String.valueOf(ans);

            if( s.length() > 7)
            {
                text4.setText(String.valueOf(ans).substring(0, 7));

            }
            else{
                text4.setText(s);
            }

        });

        btn3.addActionListener(l ->{

            double ans = 0;

            if(text1.getText().length() > 0)
            {
                ans = Double.parseDouble(text1.getText());
            }

            else if(text2.getText().length() > 0)
            {
                ans  = ((Double.parseDouble(text2.getText())-32) * 5/9);
            }

            else if(text3.getText().length() > 0)
            {
                ans = Double.parseDouble(text3.getText())-273;
            }
            else{
                JOptionPane.showMessageDialog(null, "Input fields are empty!", "Warning", JOptionPane.WARNING_MESSAGE);
            }

            String s = String.valueOf(ans);

            if( s.length() > 7)
            {
                text4.setText(String.valueOf(ans).substring(0, 7));

            }
            else{
                text4.setText(s);
            }

        });





        add(l1);
        //add(l0);
        add(l2);
        add(l3);
        add(l4);
        add(text1);
        add(text2);
        add(text3);
        add(btn1);
        add(btn2);
        add(btn3);
        add(text4);


        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == btn1 ){
//
//        }
//        if (e.getSource() == btn2 ){
//
//        }
//        if (e.getSource() == btn3 ){
//
//        }
//
//    }
}