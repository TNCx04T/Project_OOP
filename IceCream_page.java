package Main_window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.DropMode;
import java.awt.Panel;
import java.awt.TextArea;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.Font;

public class IceCream_page extends JFrame{

	protected JFrame IceCream_frame;
	public int total;
	public String path_pic;
	public String str_Size;
	public String Size[] = {"Size S", "Size M", "Size L"}; //Array Size

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					IceCream_page window = new IceCream_page();
//					window.IceCream_frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public IceCream_page(String path) { //ใช้เรียกหน้าไอศกรีมแต่ละรศชาติ
		this.path_pic = path;
		initialize(path);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String path) {
		IceCream_frame = new JFrame();
		IceCream_frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 16));
		IceCream_frame.setResizable(false);
		IceCream_frame.getContentPane().setBackground(new Color(255, 255, 255));
		IceCream_frame.setBounds(100, 100, 600, 800);
		IceCream_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		IceCream_frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(IceCream_page.class.getResource("/Main_window/Image/indexpic.png")));
		lblNewLabel.setBounds(0, 0, 584, 150);
		IceCream_frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(IceCream_page.class.getResource("/Main_window/Image/" + path)));
		lblNewLabel_1.setLabelFor(IceCream_frame);
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBackground(new Color(192, 192, 192));
		lblNewLabel_1.setBounds(192, 172, 200, 200);
		IceCream_frame.getContentPane().add(lblNewLabel_1);
		
		JPanel panel_Size = new JPanel();
		panel_Size.setBackground(Color.WHITE);
		panel_Size.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Size", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel_Size.setBounds(42, 385, 500, 125);
		IceCream_frame.getContentPane().add(panel_Size);
		panel_Size.setLayout(null);
		
		JToggleButton btn_S = new JToggleButton("Size S");
		btn_S.setFont(new Font("Kanit", Font.PLAIN, 14));
		btn_S.setBounds(186, 58, 100, 40);
		panel_Size.add(btn_S);
		
		JToggleButton btn_M = new JToggleButton("Size M");
		btn_M.setFont(new Font("Kanit", Font.PLAIN, 14));
		btn_M.setBounds(282, 58, 100, 40);
		panel_Size.add(btn_M);
		
		JToggleButton btn_L = new JToggleButton("Size L");
		btn_L.setFont(new Font("Kanit", Font.PLAIN, 14));
		btn_L.setBounds(376, 58, 100, 40);
		panel_Size.add(btn_L);
		
		JButton btn_Next = new JButton("Purchase -->");
		btn_Next.setEnabled(false);
		btn_Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Purchase_page Purchase_pg = new Purchase_page(path_pic, total, str_Size);
				Purchase_pg.Purchase_frame.setVisible(true);
				IceCream_frame.dispose();
			}
		});
		btn_Next.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_Next.setBounds(402, 670, 140, 40);
		IceCream_frame.getContentPane().add(btn_Next);
		
		btn_S.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn_S.isSelected()) {
					btn_M.setEnabled(false);
					btn_L.setEnabled(false);
					btn_Next.setEnabled(true);
					total += 20;
					str_Size = Size[0];
					
				}
				else {
					btn_M.setEnabled(true);
					btn_L.setEnabled(true);
					btn_Next.setEnabled(false);
					total -= 20;
				}
			}
		});
		
		btn_M.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn_M.isSelected()) {
					btn_S.setEnabled(false);
					btn_L.setEnabled(false);
					btn_Next.setEnabled(true);
					total += 25;
					str_Size = Size[1];
					
				}
				else {
					btn_S.setEnabled(true);
					btn_L.setEnabled(true);
					btn_Next.setEnabled(false);
					total -= 25;
				}
			}
		});
		
		btn_L.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn_L.isSelected()) {
					btn_S.setEnabled(false);
					btn_M.setEnabled(false);
					btn_Next.setEnabled(true);
					total += 30;
					str_Size = Size[2];
				}
				else {
					btn_S.setEnabled(true);
					btn_M.setEnabled(true);
					btn_Next.setEnabled(false);
					total -= 30;
				}
			}
		});
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(IceCream_page.class.getResource("/Main_window/Image/All_size.png")));
		lblNewLabel_2.setForeground(new Color(128, 128, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBackground(new Color(128, 128, 255));
		lblNewLabel_2.setBounds(23, 33, 142, 65);
		panel_Size.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(IceCream_page.class.getResource("/Main_window/Image/Size_baht.png")));
		lblNewLabel_3.setBounds(186, 21, 290, 40);
		panel_Size.add(lblNewLabel_3);
		
		JButton btn_back = new JButton("<-- back");
		btn_back.setFont(new Font("Kanit", Font.PLAIN, 12));
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main_page main_pg = new Main_page();
				main_pg.main_pg.setVisible(true);
				IceCream_frame.dispose();
			}
		});
		btn_back.setBounds(10, 161, 100, 30);
		IceCream_frame.getContentPane().add(btn_back);
		
		JPanel panel_Topping = new JPanel();
		panel_Topping.setLayout(null);
		panel_Topping.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Topping", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_Topping.setBackground(Color.WHITE);
		panel_Topping.setBounds(42, 521, 500, 125);
		IceCream_frame.getContentPane().add(panel_Topping);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon(IceCream_page.class.getResource("/Main_window/Image/Topping.png")));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(new Color(128, 128, 255));
		lblNewLabel_2_1.setBackground(new Color(128, 128, 255));
		lblNewLabel_2_1.setBounds(23, 33, 142, 65);
		panel_Topping.add(lblNewLabel_2_1);
		
		JRadioButton rdbtn_oreo = new JRadioButton("Oreo");
		rdbtn_oreo.setFont(new Font("Kanit", Font.PLAIN, 11));
		rdbtn_oreo.setBackground(new Color(255, 255, 255));
		rdbtn_oreo.setBounds(301, 58, 80, 40);
		panel_Topping.add(rdbtn_oreo);
		
		JRadioButton rdbtn_Chocchip = new JRadioButton("Chocolate chips");
		rdbtn_Chocchip.setFont(new Font("Kanit", Font.PLAIN, 11));
		rdbtn_Chocchip.setBackground(new Color(255, 255, 255));
		rdbtn_Chocchip.setBounds(185, 58, 114, 40);
		panel_Topping.add(rdbtn_Chocchip);
		
		JRadioButton rdbtn_Pocky = new JRadioButton("Pocky");
		rdbtn_Pocky.setFont(new Font("Kanit", Font.PLAIN, 11));
		rdbtn_Pocky.setBackground(new Color(255, 255, 255));
		rdbtn_Pocky.setBounds(395, 58, 80, 40);
		panel_Topping.add(rdbtn_Pocky);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon(IceCream_page.class.getResource("/Main_window/Image/Topping_baht.png")));
		lblNewLabel_3_1.setBounds(185, 22, 290, 40);
		panel_Topping.add(lblNewLabel_3_1);
		
		
		rdbtn_Chocchip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtn_Chocchip.isSelected()) {
					total += 5;
				}
				else {
					total -= 5;
				}
			}
		});
		
		rdbtn_oreo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtn_oreo.isSelected()) {
					total += 5;
				}
				else {
					total -= 5;
				}
			}
		});
		
		rdbtn_Pocky.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtn_Pocky.isSelected()) {
					total += 10;
				}
				else {
					total -= 10;
				}
			}
		});
		
	}
	
	
	public int getTotal() { //เมท็อดส่งค่า total
		return total;
	}
	
	public String getPath() {
		return path_pic;
	}
	
	public String getStrSize() {
		return str_Size;
	}
}
