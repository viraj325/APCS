/*
	Interfaces:	MyButtons
	Programmer: Viraj Patel
	Date: 3/2/2017
	Filename:	MyButtons.java
	Purpose: To change color depending on the buttons.
*/

import java.awt.*;
import java.awt.event.*;

public class MyButtons extends Frame implements ActionListener, ItemListener
{
	Choice colors = new Choice();

	public MyButtons()
	{


		//set the layout
		setLayout(new BorderLayout(20,5));

      	//Add buttons
      	Button north = new Button("Red");
      	Button south = new Button("Yellow");
      	Button east = new Button("Cyan");
      	Button west = new Button("Magenta");

      	// adding the actionListener to the buttons

      	north.addActionListener(this);
      	south.addActionListener(this);
      	east.addActionListener(this);
      	west.addActionListener(this);

      	// follow this pattern and add the other buttons
north.setBounds(40, 30, 100, 100);

		add(north, BorderLayout.NORTH);
		add(south, BorderLayout.SOUTH);
		add(east, BorderLayout.EAST);
		add(west, BorderLayout.WEST);



		// using this pattern add the other buttons to the appropriate areas




		// drop down menu

			//colors.add("Cyan");
			//colors.add("Yellow");
			//colors.add("Red");
			//colors.add("Magenta");
			// add 3 other colors to the drop down menu

			colors.add("Orange");
			colors.add("Green");
			colors.add("Blue");
			colors.add("Pink");




		colors.addItemListener(this);
		add(colors, BorderLayout.CENTER);
		//override the windowClosing event
		addWindowListener(
			new WindowAdapter()
				{
				public void windowClosing(WindowEvent e)
					{
					   System.exit(0);
					}
				}
		);

	}

   	public static void main(String[] args)
   	{
	   	// set frame properties
		MyButtons f = new MyButtons();
		f.setBackground(Color.red);
      	f.setTitle("Border Application");
      	f.setBounds(200,200,300,300);
	    f.setVisible(true);
   }

   public void actionPerformed(ActionEvent e)
   {
		String arg = e.getActionCommand();

		// complete the nested if else to change the background based on the button choices

		if (arg == "Yellow")
			setBackground(Color.yellow);
			else if(arg == "Red")
			setBackground(Color.red);
			else if(arg == "Magenta")
			setBackground(Color.magenta);
			else if(arg == "Cyan")
			setBackground(Color.cyan);

	}

	public void itemStateChanged(ItemEvent ie)
	{
		String arg= colors.getSelectedItem();

		// complete the if else to change the background based on the menu choices

		if (arg == "Blue")
					setBackground(Color.blue);
					else if(arg == "Orange")
								setBackground(Color.orange);
								else if(arg == "Pink")
								setBackground(Color.pink);
								else if(arg == "Green")
			setBackground(Color.green);

	}
}