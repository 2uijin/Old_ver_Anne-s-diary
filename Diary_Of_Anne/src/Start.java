import javax.swing.*;
import java.awt.*;


public class Start extends JFrame {
	Start() {
		
		
		/*Container contentPane = getContentPane(); // 컨텐트팬 알아내기
		contentPane.setBackground(Color.WHITE); 
		contentPane.setLayout(new FlowLayout()); // 컨텐트팬에 FlowLayout 배치관리자 달기
		contentPane.setLayout(new BorderLayout(30,20));
		contentPane.add(new JButton("START"), BorderLayout.CENTER); */
		
		setResizable(false); //창 크기 변화 불가
		setTitle("Anne");
		setSize(480, 720); 
		setLocationRelativeTo(null);//가운데서 나오게
		setVisible(true); //보이게
		setDefaultCloseOperation(EXIT_ON_CLOSE);//끄면꺼지게
	}

	
}