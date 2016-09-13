 /************************************************
 * This class sets up the panel that the applet uses
 * and calls the Fibonacci class to calculate a user
 * entered in value
 * 
 * -Sami
 *************************************************/
 package Chapter4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class FibonacciJPanel extends JPanel implements ActionListener
{
	//Declare all Interface objects
	private JTextField inField = new JTextField(15);
	private JTextField resultField = new JTextField(15);
	private JLabel prompt1 = new JLabel("Enter a non-negative number to see the Fibonacci calculation");
	private JLabel prompt2 = new JLabel ("Fibonacci Result");
	private JButton resultButton = new JButton  ("Enter");
	private JPanel inputPanel = new JPanel();
	private JPanel outputPanel = new JPanel();
	private JPanel buttonPanel = new JPanel();
	private Fibonacci fibo = new Fibonacci();
	
	public FibonacciJPanel ()
	{
		//Set Layout of all interface objects
		inputPanel.add(prompt1, BorderLayout.NORTH);
		inputPanel.add(inField, BorderLayout.EAST);
		outputPanel.add(prompt2, BorderLayout.NORTH);
		outputPanel.add(resultField, BorderLayout.EAST);
		buttonPanel.add(resultButton, BorderLayout.SOUTH);
		add(inputPanel, BorderLayout.NORTH);
		add(outputPanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		//Allows for action to perform when button is pressed
		resultButton.addActionListener(this);
		inField.addActionListener(this);
	}
		
		
	//calls Fibonacci to calculate result from contents of inField	
	public void actionPerformed(ActionEvent theEvent)
	{
		int inputInt = Integer.parseInt(inField.getText());
		//sets result field text to the value of the long from Fib. class
		
		resultField.setText(String.valueOf(fibo.fib(inputInt)));
		inField.setText("");				
	}
			
	
	


	

}
