import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;

public class Test {

	private static final int EXIT_ON_CLOSE = 0;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test window = new Test();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("START");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setFont(new Font("나눔바른펜", Font.BOLD, 28));
		btnNewButton.setBounds(134, 431, 215, 76);
		frame.getContentPane().add(btnNewButton);
		
		JLabel label = new JLabel("안네의 일기");
		label.setFont(new Font("나눔바른펜", Font.BOLD, 65));
		label.setBounds(106, 98, 268, 166);
		frame.getContentPane().add(label);
		
		JButton button = new JButton("끝내기");
		button.setBackground(Color.WHITE);
		button.setFont(new Font("나눔바른펜", Font.BOLD, 28));
		button.setBounds(136, 553, 215, 76);
		frame.getContentPane().add(button);
		frame.setBounds(100, 100, 480, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setResizable(false); //창 크기 변화 불가
		frame.setTitle("Anne"); 
		frame.setLocationRelativeTo(null);//가운데서 나오게
	}
}
