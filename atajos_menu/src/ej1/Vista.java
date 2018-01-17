package ej1;

import java.awt.Color;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.event.*;

public class Vista extends JFrame implements ActionListener {

	JCheckBoxMenuItem itemRed,itemYellow;
	
	public Vista() {
		
		JMenuBar barraMenu = new JMenuBar();
		JMenu elements = new JMenu("Elements");
		elements.setMnemonic('E');

		itemRed = new JCheckBoxMenuItem("RED");
		itemRed.setMnemonic('R');
		itemRed.setAccelerator(KeyStroke.getKeyStroke('R',InputEvent.CTRL_DOWN_MASK));
		itemRed.addActionListener(this);
	
		
		itemYellow = new JCheckBoxMenuItem("YELLOW");
		itemYellow.setMnemonic('Y');
		itemYellow.setAccelerator(KeyStroke.getKeyStroke('Y',InputEvent.CTRL_DOWN_MASK));
		itemYellow.addActionListener(this);
		
		elements.add(itemRed);
		elements.add(itemYellow);

		barraMenu.add(elements);

		setJMenuBar(barraMenu);
		
		setLayout(new GridLayout(1,1,0,0));  //los jtabbedpane siempre con GRID
    	setTitle("");
    	setSize(410,330);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setLocationRelativeTo(null);
    	setVisible(true);
		
	}
	
	
	public static void main(String[] args) {		
		new Vista().setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==itemRed){
			getContentPane().setBackground(Color.RED);
		}
		else if (e.getSource()==itemYellow) {
			getContentPane().setBackground(Color.YELLOW);
		}
			
		
	}


}