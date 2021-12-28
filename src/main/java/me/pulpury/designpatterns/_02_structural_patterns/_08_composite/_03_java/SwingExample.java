package me.pulpury.designpatterns._02_structural_patterns._08_composite._03_java;

import javax.swing.*;

public class SwingExample {

    public static void main(String[] args) {
    	// JFram과 JTextField, JButton은 Component에서 최종적으로 만난다.
    	// JFram이 Composite 역할
    	// JTextField와 JButton은 Leaf 역할.!
        JFrame frame = new JFrame();

        JTextField textField = new JTextField();
        textField.setBounds(200, 200, 200, 40);
        frame.add(textField);

        JButton button = new JButton("click");
        button.setBounds(200, 100, 60, 40);
        button.addActionListener(e -> textField.setText("Hello Swing"));
        frame.add(button);

        frame.setSize(600, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }


}
