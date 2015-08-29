package ui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import cmn.Admin;
import db.Database;

public class LoginScreen extends JFrame {

	private JLabel labelUsername = new JLabel("Въведи потребител: ");
    private JLabel labelPassword = new JLabel("Въведи парола: ");
    private JTextField textUsername = new JTextField(20);
    private JPasswordField fieldPassword = new JPasswordField(20);
    private JButton buttonLogin = new JButton("Вход");
     
    public LoginScreen() {
        super("JPanel Demo Program");
         
        // create a new panel with GridBagLayout manager
        JPanel newPanel = new JPanel(new GridBagLayout());
         
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);
         
        //add listeners to buttons
        buttonLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String username = textUsername.getText();
				String password = fieldPassword.getText();
				
				boolean hasSuchUser = false;
				for(int i = 0; i < Database.getAdmins().length; i++) {
					Admin admin = Database.getAdmins()[i];
					if(admin.getEmail().equals(username) &&
							admin.getPassword().equals(password)) {
						new MainScreen().setVisible(true);
						LoginScreen.this.setVisible(false);
						hasSuchUser = true;
						break;
					}
				}
				
				if(!hasSuchUser) {
					new WarningScreen("Грешен потребител или парола").setVisible(true);	
				}
			}
		});
        
        // add components to the panel
        constraints.gridx = 0;
        constraints.gridy = 0;     
        newPanel.add(labelUsername, constraints);
 
        constraints.gridx = 1;
        newPanel.add(textUsername, constraints);
         
        constraints.gridx = 0;
        constraints.gridy = 1;     
        newPanel.add(labelPassword, constraints);
         
        constraints.gridx = 1;
        newPanel.add(fieldPassword, constraints);
         
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        newPanel.add(buttonLogin, constraints);
         
        // set border for the panel
        newPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Вход"));
         
        // add the panel to this frame
        this.add(newPanel);
         
        pack();
        setLocationRelativeTo(null);
    }
     

	
}
