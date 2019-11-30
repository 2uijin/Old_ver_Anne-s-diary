import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ep_1 extends JPanel {
		private Change_Panel win;
		private JPanel panel;
		private JLabel background_img;
		private JLabel mon;
		private JButton next_btn;
		public  Ep_1(final Change_Panel win) {
	        this.win = win;
	        setLayout(null);
	        
			panel = new JPanel();
			panel.setBounds(0, 0, 1080, 720);
			add(panel);
			panel.setLayout(null);
			
			JLabel hangle = new JLabel("<html>당신에게 라면  내 마음속의 비밀들을 모두 다 털어놓을 수 있을 것 같아요, \t<center>내 마음의 지주가 되어주세요</center></html>");
			panel.add(hangle);
			hangle.setHorizontalAlignment(JLabel.CENTER); //JLabel 가운데 정렬
			hangle.setVerticalAlignment(JLabel.CENTER);
			hangle.setFont(new Font("나눔바른펜", Font.BOLD, 21));
			hangle.setBounds(220, 271, 559, 269);
			
			next_btn = new JButton("");
			next_btn.setBackground(win.book_c);
			next_btn.setBounds(713, 568, 65, 62);
			next_btn.setBorderPainted(false);
			next_btn.setFocusPainted(false);
			next_btn.setIcon(new ImageIcon("D:\\leeuj\\미림여자정보과학고등학교\\수업\\java\\안네의일기 자료\\main\\icon\\arrow-point-to-right (2).png"));
			ActionListener listner =new ActionListener() {	
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					win.change("ep2");
				}
			};
			next_btn.addActionListener(listner);
			add(next_btn);
			
			background_img = new JLabel();
	        background_img.setIcon(new ImageIcon("D:\\leeuj\\미림여자정보과학고등학교\\수업\\java\\안네의일기 자료\\1x\\1x\\큰배경있는 책.png"));
	        background_img.setBounds(0, 0, 1080, 720);
	        panel.add(background_img);
	
	 
		}
	}



