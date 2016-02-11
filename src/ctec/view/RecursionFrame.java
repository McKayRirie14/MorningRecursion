package ctec.view;

import javax.swing.JFrame;

/**
 *  * @author mrir2917
 *@version 0.x Feb 11, 2016
 */
public class RecursionFrame extends JFrame 
{
	private RecursionPanel basePanel;
	private RecursionController baseController;
	
	public RecursionFrame(RecursionController baseController)
	{
		this.baseController = baseController;
		basePanel = new RecursionPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("Lets recurse");
		this.setSize(500, 500);
		this.setVisible(true);
	}
}
