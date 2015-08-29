package ui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import db.Database;

public class AddBookScreen extends JFrame {

	private JLabel labelBookAuthor = new JLabel("Име на автор: ");
	private JLabel labelBookTitle = new JLabel("Име на книга: ");
	private JTextField textBookName = new JTextField(20);
	private JTextField textBookTitle = new JTextField(20);
	private JButton buttonAdd = new JButton("Добави");

	public AddBookScreen() {
		JPanel panel = new JPanel(new GridBagLayout());

		GridBagConstraints constraints = new GridBagConstraints();
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(10, 10, 10, 10);

		buttonAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String booktitle = textBookTitle.getText(); 
				String bookauthor = textBookName.getText(); 
				Database.addBook(booktitle, bookauthor);
				AddBookScreen.this.setVisible(false);
				
			}
		});
		
		
		constraints.gridx = 0;
		constraints.gridy = 0;
		panel.add(labelBookTitle, constraints);
		constraints.gridx = 0;
		constraints.gridy = 1;
		panel.add(labelBookAuthor, constraints);
		constraints.gridx = 1;
		constraints.gridy = 0;
		panel.add(textBookName, constraints);
		constraints.gridx = 1;
		constraints.gridy = 1;
		panel.add(textBookTitle, constraints);
		constraints.gridx = 1;
		constraints.gridy = 2;
		panel.add(buttonAdd, constraints);
		add(panel);
		pack();
		setLocationRelativeTo(null);
	}

}
