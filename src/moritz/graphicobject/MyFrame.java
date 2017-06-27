package moritz.graphicobject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MyFrame extends JFrame implements KeyListener {

	private static final long serialVersionUID = 8332688655937740787L;

	public static void start() {
		MyFrame frame = new MyFrame();
		frame.addKeyListener(frame);
		frame.setSize(1000, 1000);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	//In JFrame wird festgelegt, dass alle Klassen eine paint Methode haben müssen
	//Diese wird hier überschrieben.
	@Override
	public void paint(Graphics g) {
		super.paint(g); //ruft die Methode der Vaterklasse auf
		getContentPane().setBackground(Color.YELLOW);
		g.setFont(new Font("Dialog", Font.PLAIN, 18));
		g.setColor(Color.BLUE);
		g.drawString("Hallo Welt", 10, 80);
		/*
		 * g.drawString(zahl + "+" + text, 10, 20); 
		 * zahl++;
		 */
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
