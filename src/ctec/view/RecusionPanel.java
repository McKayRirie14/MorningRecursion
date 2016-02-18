package ctec.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import ctec.controller.RecursionController;

/**
 * @author mrir2917
 *@version 0.x Feb 11, 2016
 */
public class RecusionPanel extends JPanel
{
	private RecursionController baseController;
	private SpringLayout baseLayout;
	private JButton fibonacciButton;
	private JButton factorialButton;
	private JTextField inputFeild;
	private JTextArea resultsArea;
	
	public RecusionPanel(RecursionController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		fibonacciButton = new JButton("Get the Fibonacci sequence for this number");
		factorialButton = new JButton("Get n!");
		inputFeild = new JTextField(20);
		resultsArea = new JTextArea(10, 20);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupListeners()
	{
		
		
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(fibonacciButton);
		this.add(factorialButton);
		this.add(inputFeild);
		this.add(resultsArea);
		this.setBackground(Color.MAGENTA);
		resultsArea.setWrapStyleWord(true);
		resultsArea.setLineWrap(true);
	}
	
	private void setupLayout()
	{
		
	}
}
