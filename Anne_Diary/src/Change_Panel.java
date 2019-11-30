import java.awt.Color;

import javax.swing.JFrame;

public class Change_Panel extends JFrame {

	public Ep_1 ep1;
	public Ep_2 ep2;
	
	Color book_c = new Color(233,234,233);
	
	public int month =0;
	
	 public void change(String panelName) { // 패널 1번과 2번 변경 후 재설정
	        if (panelName.equals("ep2")) {
	            getContentPane().removeAll();
	            getContentPane().add(ep2);
	            revalidate();
	            repaint();
	        }
	        else {
	        	getContentPane().removeAll();
	        }
	 }

}
