import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu m = new Menu();
				m.ns();
				frame.dispose();
				//frame.setVisible(false);
			}
		});
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		btnLogin.setBounds(142, 160, 106, 27);
		frame.getContentPane().add(btnLogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(142, 117, 132, 23);
		frame.getContentPane().add(passwordField);
		
		JLabel lblPassword = DefaultComponentFactory.getInstance().createLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setBounds(142, 96, 92, 14);
		frame.getContentPane().add(lblPassword);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(142, 62, 132, 23);
		frame.getContentPane().add(passwordField_1);
		
		JLabel lblUsername = DefaultComponentFactory.getInstance().createLabel("Username");
		lblUsername.setBackground(Color.BLACK);
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblUsername.setForeground(Color.BLACK);
		lblUsername.setBounds(142, 28, 106, 23);
		frame.getContentPane().add(lblUsername);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(84, 8, 254, 216);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 16, 242, 193);
		panel_1.add(panel);
		panel.setLayout(null);
		panel.setBorder(UIManager.getBorder("ComboBox.border"));
		panel.setBackground(Color.LIGHT_GRAY);
	}
}
