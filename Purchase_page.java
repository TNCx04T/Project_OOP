package Main_window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DropMode;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;

public class Purchase_page extends JFrame{

	protected JFrame Purchase_frame;
	public int total = 0;
	public String path_pic;
	public IceCream_page ic_p;
	public String str_Size;
	private JTextField txtField_Pay;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Purchase_page window = new Purchase_page();
//					window.Purchase_frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	 public Purchase_page(String path, int tot, String size) { //เมท็อดสร้างหน้าต่าง + รับ path ของรูปด้วย
		path_pic = path;
		total = tot;
		str_Size = size;
		initialize();
	}
//	public void setTotal(double total) {
//		this.total = total;
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Purchase_frame = new JFrame();
		Purchase_frame.getContentPane().setBackground(new Color(255, 255, 255));
		Purchase_frame.setResizable(false);
		Purchase_frame.setBounds(100, 100, 600, 800);
		Purchase_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Purchase_frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Purchase_page.class.getResource("/Main_window/Image/indexpic.png")));
		lblNewLabel.setBounds(0, 0, 584, 150);
		Purchase_frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("<-- back");
		btnNewButton.setFont(new Font("Kanit", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IceCream_page Ice_pg = new IceCream_page(path_pic);
				Ice_pg.IceCream_frame.setVisible(true);
				Purchase_frame.dispose();
				
			}
		});
		btnNewButton.setBounds(10, 161, 100, 30);
		Purchase_frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(192, 192, 192));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(Purchase_page.class.getResource("/Main_window/Image/" + path_pic)));
		lblNewLabel_1.setBounds(192, 172, 200, 200);
		Purchase_frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ราคา : ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("Kanit", Font.BOLD, 22));
		lblNewLabel_2.setBounds(195, 465, 100, 50);
		Purchase_frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lbl_Total = new JLabel(String.valueOf(total));
		lbl_Total.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Total.setFont(new Font("Kanit", Font.PLAIN, 20));
		lbl_Total.setBounds(294, 472, 80, 40);
		Purchase_frame.getContentPane().add(lbl_Total);
		JButton btn_Purchase = new JButton("Purchase");
		btn_Purchase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				change_page chg_pg = new change_page(total, Integer.valueOf(txtField_Pay.getText()));
				chg_pg.change_frame.setVisible(true);
				Purchase_frame.dispose();
			}
		});
		btn_Purchase.setEnabled(false);
		btn_Purchase.setFont(new Font("Kanit", Font.PLAIN, 20));
		btn_Purchase.setBounds(232, 609, 120, 50);
		Purchase_frame.getContentPane().add(btn_Purchase);
		
		txtField_Pay = new JTextField();

		txtField_Pay.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char chr_Pay = e.getKeyChar();
				if(!(Character.isDigit(chr_Pay)) ) { // Check ว่า ให้ใส่เฉพาะตัวเลข
					e.consume();
				}
				
			}
			
			
			@Override
			public void keyReleased(KeyEvent e) {
				if(txtField_Pay.getText().isEmpty()) {
					btn_Purchase.setEnabled(false);
				}
				else if( Integer.valueOf(txtField_Pay.getText()) >= total ) {
					btn_Purchase.setEnabled(true);
				}
				else {
					btn_Purchase.setEnabled(false);
				}
			}
		});
		txtField_Pay.setHorizontalAlignment(SwingConstants.CENTER);
		txtField_Pay.setText("0");
		txtField_Pay.setBackground(new Color(255, 255, 255));
		txtField_Pay.setActionCommand("");
		txtField_Pay.setName("");
		txtField_Pay.setDisabledTextColor(new Color(128, 128, 128));
		txtField_Pay.setFont(new Font("Kanit", Font.PLAIN, 18));
		txtField_Pay.setBounds(272, 531, 120, 40);
		Purchase_frame.getContentPane().add(txtField_Pay);
		txtField_Pay.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("จำนวนเงินที่จ่ายมา : ");
		lblNewLabel_3.setFont(new Font("Kanit", Font.BOLD, 20));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(82, 527, 180, 60);
		Purchase_frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lbl_Size = new JLabel(str_Size);
		lbl_Size.setFont(new Font("Kanit", Font.BOLD, 22));
		lbl_Size.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Size.setBounds(242, 403, 100, 40);
		Purchase_frame.getContentPane().add(lbl_Size);
		
		JLabel lblNewLabel_4 = new JLabel("(กรุณาใส่เฉพาะตัวเลข)");
		lblNewLabel_4.setFont(new Font("Kanit", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(402, 533, 140, 40);
		Purchase_frame.getContentPane().add(lblNewLabel_4);
		
		

	}
}
