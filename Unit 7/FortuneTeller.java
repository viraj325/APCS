// This is the Fortune Teller applet: Viraj Patel

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.AudioClip;

public class FortuneTeller extends JApplet
    implements ActionListener
{
	int numbers = (int)(Math.random()*200)+60;
  // Declare an array of "fortunes" (strings):

  String [] fortunes = {"You will get dumber each time you click the next button.","You will be a billionaire within the next 2 years."
  						,"You will get hit by a bus.","You will die when you get to " + numbers,"Your computer will explode within 10 seconds......RUN RUN"};


  private JTextField display;
  private AudioClip ding;

  public void init()
  {
    ding = getAudioClip(getDocumentBase(), "ding.wav");

    display = new JTextField("  Press \"Next\" to see your fortune...", 30);
    display.setBackground(Color.WHITE);
    display.setEditable(false);

    JButton go = new JButton("Next");
    go.addActionListener(this);

    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(display);
    c.add(go);
  }

  public void actionPerformed(ActionEvent e)
  {
    ding.play();

    // Pick a random fortune:

    String random = fortunes[(int)(Math.random()*fortunes.length)];

    display.setText("  " + random );
  }
}

