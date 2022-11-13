package Main_window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class change_page extends JFrame{

	protected JFrame change_frame;
	public int total, Pay;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					change_page window = new change_page();
//					window.change_frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public change_page(int tot, int pay) {
		this.total = tot;
		this.Pay = pay;
		initialize(total, Pay);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int total, int Pay) {
		change_frame = new JFrame();
		change_frame.getContentPane().setBackground(new Color(255, 255, 255));
		change_frame.setResizable(false);
		change_frame.setBounds(100, 100, 600, 800);
		change_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		change_frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(change_page.class.getResource("/Main_window/Image/indexpic.png")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 584, 150);
		change_frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("จำนวนเงินทอน : ");
		lblNewLabel_1.setFont(new Font("Kanit", Font.BOLD, 30));
		lblNewLabel_1.setBounds(156, 176, 200, 40);
		change_frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lbl_Change = new JLabel(String.valueOf(Pay - total));
		lbl_Change.setFont(new Font("Kanit", Font.PLAIN, 30));
		lbl_Change.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_Change.setBounds(366, 176, 100, 40);
		change_frame.getContentPane().add(lbl_Change);
		
		JButton btn_BackToHome = new JButton("");
		btn_BackToHome.setIcon(new ImageIcon(change_page.class.getResource("/Main_window/Image/Home.png")));
		btn_BackToHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Welcome_page Wel_pg = new Welcome_page();
				Wel_pg.welcome_pg.setVisible(true);
				change_frame.dispose();
			}
		});
		btn_BackToHome.setBackground(new Color(192, 192, 192));
		btn_BackToHome.setFont(new Font("Kanit", Font.BOLD, 20));
		btn_BackToHome.setBounds(217, 665, 150, 50);
		change_frame.getContentPane().add(btn_BackToHome);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_2.setIcon(new ImageIcon(change_page.class.getResource("/Main_window/Image/thx.png")));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(117, 227, 350, 400);
		change_frame.getContentPane().add(lblNewLabel_2);
	}
}
