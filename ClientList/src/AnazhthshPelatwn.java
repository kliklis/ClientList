import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AnazhthshPelatwn {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void ns2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnazhthshPelatwn window = new AnazhthshPelatwn();
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
	public AnazhthshPelatwn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		frame.getContentPane().setBackground(Color.GRAY);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Onoma", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(51, 43, 250, 48);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(6, 16, 234, 21);
		panel.add(textArea);
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textArea.setBackground(Color.WHITE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Aponymo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(51, 102, 250, 48);
		frame.getContentPane().add(panel_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textArea_1.setBackground(Color.WHITE);
		textArea_1.setBounds(6, 16, 234, 21);
		panel_1.add(textArea_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Thlefwno", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(51, 161, 250, 48);
		frame.getContentPane().add(panel_2);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textArea_2.setBackground(Color.WHITE);
		textArea_2.setBounds(6, 16, 234, 21);
		panel_2.add(textArea_2);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Menu m = new Menu();
				m.ns();
				//frame.setVisible(false);
				frame.dispose();
				
			}
		});
		btnBack.setBounds(212, 220, 89, 23);
		frame.getContentPane().add(btnBack);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
