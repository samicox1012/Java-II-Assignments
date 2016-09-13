/************************************************
 * This class calls the init method to open the 
 * applet content created in FibonacciJPanel
 * 
 * -Sami
 *************************************************/
package Chapter4;

import javax.swing.*;
public class FibonacciJApplet extends JApplet
{
	public void init()
	{
		getContentPane().add( new FibonacciJPanel());
		
	}
}
