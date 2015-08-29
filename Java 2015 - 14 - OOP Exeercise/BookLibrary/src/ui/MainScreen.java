package ui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainScreen extends JFrame {
	
	private JButton btnAddBook = new JButton("Добави книга");
	private JButton btnDeleteBook = new JButton("Премахни книга");
	private JButton btnSearchBook = new JButton("Търси книга");
	private JButton btnSearchUser = new JButton("Търси потребител");
	private JButton btnCreateUser = new JButton("Създай потребител");
	private JButton btnRentBook = new JButton("Вземи книга");
	private JButton btnReturnBook = new JButton("Върни книга");
	private JButton btnLateBooks = new JButton("Закъснели книги");
	
	public MainScreen() {
        JPanel newPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);
        
        //add listeners to buttons
        addListeners();
        
        constraints.gridx = 0;
        constraints.gridy = 0;
        newPanel.add(btnAddBook, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 1;
        newPanel.add(btnDeleteBook, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        newPanel.add(btnSearchBook, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        newPanel.add(btnSearchUser, constraints);

        constraints.gridx = 0;
        constraints.gridy = 4;
        newPanel.add(btnCreateUser, constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        newPanel.add(btnRentBook, constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        newPanel.add(btnReturnBook, constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;
        newPanel.add(btnLateBooks, constraints);
        
        this.add(newPanel);
        pack();

        setLocationRelativeTo(null);
	}

	private void addListeners() {
		btnAddBook.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new AddBookScreen().setVisible(true);
				
			}
		});
		btnSearchBook.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new SearchBookScreen().setVisible(true);
				
			}
		});
		
	}

}
