package Main_window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;


public class Main_page extends JFrame{

	JFrame main_pg;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Main_page window = new Main_page();
//					window.main_pg.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public Main_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		main_pg = new JFrame();
		main_pg.setResizable(false);
		main_pg.getContentPane().setBackground(new Color(255, 255, 255));
		
		JButton btn_back = new JButton("<-- Back");
		btn_back.setFont(new Font("Kanit", Font.PLAIN, 12));
		btn_back.setBounds(10, 161, 100, 30);
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Welcome_page wel_pg = new Welcome_page();
				wel_pg.welcome_pg.setVisible(true);
				main_pg.dispose();
			}
		});
		main_pg.getContentPane().setLayout(null);
		main_pg.getContentPane().add(btn_back);
		
		JButton btn_Vanilla = new JButton("");
		btn_Vanilla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IceCream_page ice_pg = new IceCream_page("Vanilla_200 x 200.png");
				ice_pg.IceCream_frame.setVisible(true);
				main_pg.dispose();
			}
		});
		btn_Vanilla.setForeground(new Color(255, 255, 255));
		btn_Vanilla.setBackground(new Color(255, 255, 255));
		btn_Vanilla.setIcon(new ImageIcon(Main_page.class.getResource("/Main_window/Image/Vanilla.png")));
		btn_Vanilla.setBounds(57, 199, 150, 150);
		main_pg.getContentPane().add(btn_Vanilla);
		
		JButton btn_Almond_cream = new JButton("");
		btn_Almond_cream.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IceCream_page ice_pg = new IceCream_page("Almond&Cream_200 x 200.png");
				ice_pg.IceCream_frame.setVisible(true);
				main_pg.dispose();
			}
		});
		btn_Almond_cream.setIcon(new ImageIcon(Main_page.class.getResource("/Main_window/Image/Almond&Cream.png")));
		btn_Almond_cream.setBounds(217, 199, 150, 150);
		main_pg.getContentPane().add(btn_Almond_cream);
		
		JButton btn_Cookie_cream = new JButton("");
		btn_Cookie_cream.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IceCream_page ice_pg = new IceCream_page("Cookie & Cream_200 x 200.png");
				ice_pg.IceCream_frame.setVisible(true);
				main_pg.dispose();
			}
			
		});
		btn_Cookie_cream.setBackground(new Color(255, 255, 255));
		btn_Cookie_cream.setForeground(Color.WHITE);
		btn_Cookie_cream.setIcon(new ImageIcon(Main_page.class.getResource("/Main_window/Image/Cookie & Cream.png")));
		btn_Cookie_cream.setBounds(378, 199, 150, 150);
		main_pg.getContentPane().add(btn_Cookie_cream);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Main_page.class.getResource("/Main_window/Image/indexpic.png")));
		lblNewLabel.setBounds(0, 0, 584, 150);
		main_pg.getContentPane().add(lblNewLabel);
		
		JButton btn_MintChoc = new JButton("");
		btn_MintChoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IceCream_page ice_pg = new IceCream_page("Mint & Choc_200 x 200.png");
				ice_pg.IceCream_frame.setVisible(true);
				main_pg.dispose();
			}
		});
		btn_MintChoc.setIcon(new ImageIcon(Main_page.class.getResource("/Main_window/Image/Mint & Choc.png")));
		btn_MintChoc.setForeground(Color.WHITE);
		btn_MintChoc.setBackground(Color.WHITE);
		btn_MintChoc.setBounds(57, 391, 150, 150);
		main_pg.getContentPane().add(btn_MintChoc);
		
		JButton Btn_Milk = new JButton("");
		Btn_Milk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IceCream_page ice_pg = new IceCream_page("Milk_200 x 200.png");
				ice_pg.IceCream_frame.setVisible(true);
				main_pg.dispose();
			}
		});
		Btn_Milk.setIcon(new ImageIcon(Main_page.class.getResource("/Main_window/Image/Milk.png")));
		Btn_Milk.setBounds(217, 391, 150, 150);
		main_pg.getContentPane().add(Btn_Milk);
		
		JButton Btn_MatchaCookie = new JButton("");
		Btn_MatchaCookie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IceCream_page ice_pg = new IceCream_page("Matcha & Cookie_200 x 200.png");
				ice_pg.IceCream_frame.setVisible(true);
				main_pg.dispose();
			}
		});
		Btn_MatchaCookie.setIcon(new ImageIcon(Main_page.class.getResource("/Main_window/Image/Matcha & Cookie.png")));
		Btn_MatchaCookie.setForeground(Color.WHITE);
		Btn_MatchaCookie.setBackground(Color.WHITE);
		Btn_MatchaCookie.setBounds(378, 391, 150, 150);
		main_pg.getContentPane().add(Btn_MatchaCookie);
		
		JButton btn_Caramel = new JButton("");
		btn_Caramel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IceCream_page ice_pg = new IceCream_page("Caramel_200 x 200.png");
				ice_pg.IceCream_frame.setVisible(true);
				main_pg.dispose();
			}
		});
		btn_Caramel.setIcon(new ImageIcon(Main_page.class.getResource("/Main_window/Image/Caramel.png")));
		btn_Caramel.setForeground(Color.WHITE);
		btn_Caramel.setBackground(Color.WHITE);
		btn_Caramel.setBounds(57, 572, 150, 150);
		main_pg.getContentPane().add(btn_Caramel);
		
		JButton Btn_Chocolate = new JButton("");
		Btn_Chocolate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IceCream_page ice_pg = new IceCream_page("Choc_200 x 200.png");
				ice_pg.IceCream_frame.setVisible(true);
				main_pg.dispose();
			}
		});
		Btn_Chocolate.setIcon(new ImageIcon(Main_page.class.getResource("/Main_window/Image/Choc.png")));
		Btn_Chocolate.setBounds(217, 572, 150, 150);
		main_pg.getContentPane().add(Btn_Chocolate);
		
		JButton Btn_Strawberry = new JButton("");
		Btn_Strawberry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IceCream_page ice_pg = new IceCream_page("Strawberry_200 x 200.png");
				ice_pg.IceCream_frame.setVisible(true);
				main_pg.dispose();
			}
		});
		Btn_Strawberry.setIcon(new ImageIcon(Main_page.class.getResource("/Main_window/Image/Strawberry.png")));
		Btn_Strawberry.setForeground(Color.WHITE);
		Btn_Strawberry.setBackground(Color.WHITE);
		Btn_Strawberry.setBounds(378, 572, 150, 150);
		main_pg.getContentPane().add(Btn_Strawberry);
		main_pg.setBounds(100, 100, 600, 800);
		main_pg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
