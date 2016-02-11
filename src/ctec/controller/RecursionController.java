package ctec.controller;

import ctec.model.RecursionTool;
import ctec.view.RecursionFrame;

/**
 * @author mrir2917
 * @version 0.x Feb 11, 2016
 */
public class RecursionController 
{
	private RecursionTool mathTool;
	private RecursionFrame baseFrame;
	
	public RecursionController()
	{
		mathTool = new RecursionTool();
		baseFrame = new recursionFrame(this);
	}
	
	public void start()
	{
		
	}
}
