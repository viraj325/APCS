//	Name: Viraj Patel

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StringTest extends JFrame
        implements ActionListener
{
  private JTextField input, result;

  public StringTest()
  {
    super("String test");
    Box box1 = Box.createVerticalBox();
    box1.add(new JLabel("Input:"));
    box1.add(Box.createVerticalStrut(10));
    box1.add(new JLabel("Result:"));

    input = new JTextField(20);
    input.setBackground(Color.WHITE);
    input.addActionListener(this);
    input.selectAll();

    result = new JTextField(20);
    result.setBackground(Color.WHITE);
    result.setEditable(false);

    Box box2 = Box.createVerticalBox();
    box2.add(input);
    box2.add(Box.createVerticalStrut(10));
    box2.add(result);

    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(box1);
    c.add(box2);
    input.requestFocus();
  }

  public void actionPerformed(ActionEvent e)
  {
    String str = input.getText();

    // ... insert code to process str or call a method here
    //str....
    /*if(star(str))
    {
		str = "true";
	}
	else
	{
		str = "false";
	}*/
    result.setText(negative(str));
    input.selectAll();
  }
  public static String negative(String str)
  {

  	  String zero = str.replace('0','Z');
  		zero = zero.replace('1','0');
  		zero = zero.replace('Z','1');
  	  String t = zero;
  	  return t;
  }
  /*public static String convertName(String str)
  {
	  String convertName = str.trim();

	  int comma = convertName.indexOf(',');
	  String s = convertName.substring(0 , comma);
	  String s2  = convertName.substring(comma+1);

	  String firstLast = s2.trim()+" "+ s.trim();

	  return firstLast;
  }*/
  /*public static String scroll(String str)
  {
	  String first = str.substring(0,1);
	  String second = str.substring(1);
	  str = second + first;
	  return str;
  }*/
  /*public static String dataStr(String str)
  {
	  int s1 = str.indexOf('/');
	  int s2 = str.lastIndexOf('/');
	  String m = str.substring(0, s1);
	  String d = str.substring(s1 + 1, s2);
	  String y = str.substring(s2 + 1, str.length());

	  if(m.length() == 1)
	  {
		  m = "0" + m;
	  }
	  if(d.length() == 1)
	  {
		  d = "0" + d;
	  }
	  str = d + "-" + m + "-" + y;
	  return str;
  }*/

  /*public static String socialSecurity(String str)
  {
	  String three = str.substring(0,3);
	  String two = str.substring(4,6);
	  String four = str.substring(7,11);

	  String ssn = three + two + four;

	  return ssn;
  }*/
	/*public static boolean star(String str)
	{
		if(str.length() >= 2&&str.lastIndexOf("**")>= str.length()-2)
		{
			return true;
		}
		else
			return false;
	}*/


  public static void main(String[] args)
  {
    StringTest window = new StringTest();
    window.setBounds(100, 100, 300, 100);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setVisible(true);
  }
}