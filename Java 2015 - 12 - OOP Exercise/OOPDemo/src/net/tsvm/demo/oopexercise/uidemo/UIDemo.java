package net.tsvm.demo.oopexercise.uidemo;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UIDemo {
		
	public static void main(String[] args) {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout());
		
	    JLabel resultLabel = new JLabel();	    
	    JTextField inputText = new JTextField();
	    inputText.setText("***");
	    inputText.setSize(100, 20);
	   
	    panel.add(inputText);
	    
	    JButton okButton = new JButton("OK");
	    okButton.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {				
				resultLabel.setText(inputText.getText());
			}
		});
	    panel.add(okButton);
	    
	    JButton cancelButton = new JButton("Clear");
	    cancelButton.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				resultLabel.setText("");				
			}
		});
	    panel.add(cancelButton);
	    
	    panel.add(resultLabel);
	    
	    JFrame frame = new JFrame("Example Frame");
	    frame.setLayout(new FlowLayout());
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.add(panel);
	    frame.setSize(300, 200);
	    frame.setVisible(true);
	}

}
