import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ep_2 extends JPanel {
	private Change_Panel win;
	private JPanel panel;
	private JLabel background_img;
	public Ep_2(Change_Panel win) {
		this.win = win;
		setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 1080, 720);
		add(panel);
		panel.setLayout(null);
		
		background_img = new JLabel();
        background_img.setIcon(new ImageIcon("D:\\leeuj\\미림여자정보과학고등학교\\수업\\java\\안네의일기 자료\\1x\\1x\\큰배경있는 책.png"));
        background_img.setBounds(0, 0, 1080, 720);
        panel.add(background_img);
	}
}
