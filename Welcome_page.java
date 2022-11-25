package Main_window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Point;
import java.awt.Window.Type;
import java.awt.Component;
import javax.swing.Box;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Cursor;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.awt.Button;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import java.awt.Canvas;
import java.awt.Panel;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Welcome_page extends JFrame{

	JFrame welcome_pg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome_page window = new Welcome_page();
					window.welcome_pg.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Welcome_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		welcome_pg = new JFrame();
		welcome_pg.setResizable(false);
		welcome_pg.getContentPane().setBackground(new Color(255, 255, 255));
		welcome_pg.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		welcome_pg.setTitle("Welcome to Sci-Cream");
		welcome_pg.setBounds(100, 100, 600, 800);
		welcome_pg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		welcome_pg.getContentPane().setLayout(null);
		
		JButton btn_Start = new JButton("");
		btn_Start.setBorder(null);
		btn_Start.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_Start.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_Start.setIcon(new ImageIcon(Welcome_page.class.getResource("/Main_window/Image/START.png")));
		btn_Start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main_page main_frame = new Main_page();
				main_frame.main_pg.setVisible(true);
				welcome_pg.dispose();
			}
		});
		btn_Start.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_Start.setIcon(new ImageIcon(Welcome_page.class.getResource("/Main_window/Image/START_waiting.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btn_Start.setIcon(new ImageIcon(Welcome_page.class.getResource("/Main_window/Image/START.png")));
			}
		});
		btn_Start.setBounds(192, 600, 200, 80);
		welcome_pg.getContentPane().add(btn_Start);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Welcome_page.class.getResource("/Main_window/Image/indexpic.png")));
		lblNewLabel.setBounds(0, 0, 584, 150);
		welcome_pg.getContentPane().add(lblNewLabel);
		
		JLabel lbl_Wel_Picture = new JLabel("");
		lbl_Wel_Picture.setIcon(new ImageIcon(Welcome_page.class.getResource("/Main_window/Image/welcome_pic.png")));
		lbl_Wel_Picture.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Wel_Picture.setBorder(new LineBorder(new Color(0, 0, 0)));
		lbl_Wel_Picture.setForeground(Color.BLACK);
		lbl_Wel_Picture.setBackground(Color.LIGHT_GRAY);
		lbl_Wel_Picture.setBounds(117, 180, 350, 400);
		welcome_pg.getContentPane().add(lbl_Wel_Picture);
	}
}
