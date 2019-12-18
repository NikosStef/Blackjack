package blackjack;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import blackjack.Rules.ButtonListener;


 
	public class Serialization extends JFrame {
		private JPanel panel = new JPanel();
		private DefaultListModel<String> model2;
	   private ArrayList<String> P= new ArrayList<String>();
	   private JButton BackButton;
	   private String textName;
	   private JScrollPane scrollPane;
	   private JList<String> RulesList;
	   private JLabel label;
	   private JFrame frame;
	   private ImageIcon icon;
		
	    public Serialization(String textName)
		{
			
			
	    	frame = new JFrame();
			icon = new ImageIcon("CardTable.jpg");
			label = new JLabel(icon);
			// elegxos onomatos gia to pio eidos kanones xreiazomaste
	    	this.textName=textName;
		
			
			BackButton = new JButton("Back to login screen");
			BackButton.setFont(new Font("Times New Roman", Font.ITALIC, 15));
			BackButton.setBounds(270, 100, 300, 30);
			
			
		

		
		
		
		{ FileInputStream file; //anoigma tou arxeiou anagnwshs 
			try {
				
				file = new FileInputStream(textName);
					Scanner scr = null;	
		            scr = new Scanner(file);
		            while(scr.hasNext()){
		            	String scan = scr.next();//diavasma ana grammh kai oxi ana leksh 
		            	scan+= scr.nextLine();
		            	P.add(scan);
		            	 //eisagwgh twn kanonwn se arraylist 
		                if(scan.length()==0) {continue;}
					
					
					file.close();

				    }
				
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
		
		 
		
		
		RulesList = new JList<String>();
			
		
		model2 = new DefaultListModel<String>();//dhmiourgia tou panel- frame
		for(int i=0 ; i<P.size();i++)
		model2.addElement(P.get(i));
		RulesList.setModel(model2);
		
		scrollPane= new JScrollPane(RulesList);
		scrollPane.setBounds(150, 150, 500, 300);
		
		label.add(BackButton);
		label.add(scrollPane);
			
		this.setContentPane(label);
		ButtonListener listener = new ButtonListener();
		BackButton.addActionListener(listener);
			
		frame.add(label);
		frame.setSize(825,570);
		frame.setVisible(true);
		label.setOpaque(true);
		frame.setTitle("������ ������");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		
	
		
}
	    
	
	
        class ButtonListener implements ActionListener{

			
			public void actionPerformed(ActionEvent e) {
				if(e.getSource().equals(BackButton))
				{
					frame.setVisible(false);
					new Rules();
				}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}}}