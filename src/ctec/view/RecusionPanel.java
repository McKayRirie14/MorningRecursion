package ctec.view;

import java.awt.Color;

import java.swing.*;
import ctec.controller.RecursionController;

/**
 * @author mrir2917
 *@version 0.x Feb 11, 2016
 */
public class RecusionPanel extends JPanel
{
	private RecursionController baseController;
	private SpringLayot baseLayout;
	private JButton fibonacciButton;
	private Jbutton factorialButton;
	private JTextField inputFeild;
	prvate JTextArea resultsArea;
	
	public  RecursionPanel(recursionController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		fibonacciButton = new JButton("Get the Fibonacci sequence for this number");
		factorialButton = new JButton("Get n!");
		inputFeild = new JTextField(20);
		resultsArea = new JTextArea(10, 20);
		
		setupPanel();
		setupLayout;
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(fibonacciButton);
		this.add(factorialButton);
		this.add(inputField);
		this.add(resultsArea);
		this.setBackground(Color.MAGENTA);
		resultsArea.setWrapStyleWord(true);
		resultsArea.setLineWrap(true);
	}
	
	private void setupLayout()
}
