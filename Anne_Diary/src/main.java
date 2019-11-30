import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
public class main {
	 public static void main(String[] args) {
		 
	        Change_Panel win = new Change_Panel();
	 		win.setTitle("Anne");
	        win.ep1 = new Ep_1(win);
	        win.ep2 = new Ep_2(win);
	       
	        win.add(win.ep1);
	    	win.setBounds(100, 100, 1080, 720);
			win.setLocationRelativeTo(null);//가운데에서 나오게
			win.setResizable(false);
	        win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        win.setVisible(true);
	    }
}
