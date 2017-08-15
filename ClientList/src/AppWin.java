import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import com.jgoodies.forms.factories.DefaultComponentFactory;

public class AppWin {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppWin window = new AppWin();
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
	public AppWin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel parent_panel = new JPanel();
		frame.getContentPane().add(parent_panel, "name_149431198705492");
		CardLayout cl=new CardLayout(0, 0);
		parent_panel.setLayout(cl);
		
		JPanel Login = new JPanel();
		parent_panel.add(Login, "name_149662692360172");
		Login.setBackground(Color.GRAY);
		Login.setLayout(null);
		//Login.setVisible(true);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(102, 54, 135, 51);
		Login.add(panel_2);
		panel_2.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 31, 115, 16);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblUsername = DefaultComponentFactory.getInstance().createLabel("Username");
		lblUsername.setBounds(10, 11, 124, 20);
		panel_2.add(lblUsername);
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(73, 24, 253, 212);
		Login.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 11, 241, 190);
		panel_1.add(panel);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(null);
		
		
		
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//if(textField.getText().equals("1")&& passwordField.getPassword().equals("1") )
				cl.next(parent_panel);
				
			}
		});
		btnLogin.setBounds(23, 144, 95, 35);
		panel.add(btnLogin);
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(23, 82, 135, 51);
		panel.add(panel_3);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(10, 25, 115, 20);
		panel_3.add(passwordField);
		
		JLabel lblPassword = DefaultComponentFactory.getInstance().createLabel("Password");
		lblPassword.setBounds(10, 11, 92, 14);
		panel_3.add(lblPassword);
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		
		JPanel Menu = new JPanel();
		parent_panel.add(Menu, "name_149662714631889");
		Menu.setBackground(Color.GRAY);
		Menu.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.setBounds(65, 36, 163, 147);
		Menu.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnEisagwghPelati = new JButton("Eisagwgh Pelati");
		btnEisagwghPelati.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.next(parent_panel);
				cl.next(parent_panel);
			}
		});
		btnEisagwghPelati.setBounds(6, 11, 150, 41);
		panel_4.add(btnEisagwghPelati);
		btnEisagwghPelati.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		
		JButton btnAnazhthshPelati = new JButton("Anazhthsh Pelati");
		btnAnazhthshPelati.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.next(parent_panel);
			}
		});
		btnAnazhthshPelati.setBounds(6, 63, 150, 33);
		panel_4.add(btnAnazhthshPelati);
		btnAnazhthshPelati.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.previous(parent_panel);
			}
		});
		btnBack.setBounds(6, 107, 81, 33);
		panel_4.add(btnBack);
		btnBack.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		
		JButton btnInfos = new JButton("infos");
		btnInfos.setBounds(97, 107, 59, 33);
		panel_4.add(btnInfos);
		btnInfos.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		
		JPanel AnazhthshPelatwn = new JPanel();
		parent_panel.add(AnazhthshPelatwn, "name_149662735478602");
		AnazhthshPelatwn.setBackground(Color.GRAY);
		AnazhthshPelatwn.setLayout(null);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(73, 36, 225, 116);
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		AnazhthshPelatwn.add(panel_9);
		panel_9.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 11, 98, 43);
		panel_9.add(panel_5);
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_5.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Onoma", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_5.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(6, 16, 86, 20);
		panel_5.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(118, 11, 98, 43);
		panel_9.add(panel_6);
		panel_6.setLayout(null);
		panel_6.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Aponymo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_6.setBackground(Color.LIGHT_GRAY);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(6, 16, 86, 20);
		panel_6.add(textField_2);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(10, 65, 98, 43);
		panel_9.add(panel_7);
		panel_7.setLayout(null);
		panel_7.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Thlefwno", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7.setBackground(Color.LIGHT_GRAY);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(6, 16, 86, 20);
		panel_7.add(textField_3);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(118, 65, 98, 43);
		panel_9.add(panel_8);
		panel_8.setLayout(null);
		panel_8.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "ID", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_8.setBackground(Color.LIGHT_GRAY);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(6, 16, 86, 20);
		panel_8.add(textField_4);
		
		JButton btnAnazhthsh = new JButton("Anazhthsh");
		btnAnazhthsh.setBounds(73, 159, 105, 27);
		btnAnazhthsh.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		AnazhthshPelatwn.add(btnAnazhthsh);
		
		JButton btnBack_2 = new JButton("Back");
		btnBack_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.previous(parent_panel);
			}
		});
		btnBack_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		btnBack_2.setBounds(204, 159, 76, 27);
		AnazhthshPelatwn.add(btnBack_2);
		
		JPanel EisagwghPelatwn = new JPanel();
		parent_panel.add(EisagwghPelatwn, "name_149662756264273");
		EisagwghPelatwn.setBackground(Color.GRAY);
		EisagwghPelatwn.setLayout(null);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(74, 35, 225, 116);
		panel_10.setLayout(null);
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		EisagwghPelatwn.add(panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Onoma", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_11.setBackground(Color.LIGHT_GRAY);
		panel_11.setBounds(10, 11, 98, 43);
		panel_10.add(panel_11);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(6, 16, 86, 20);
		panel_11.add(textField_5);
		
		JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Aponymo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_12.setBackground(Color.LIGHT_GRAY);
		panel_12.setBounds(118, 11, 98, 43);
		panel_10.add(panel_12);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(6, 16, 86, 20);
		panel_12.add(textField_6);
		
		JPanel panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Thlefwno", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_13.setBackground(Color.LIGHT_GRAY);
		panel_13.setBounds(10, 65, 98, 43);
		panel_10.add(panel_13);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(6, 16, 86, 20);
		panel_13.add(textField_7);
		
		JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "ID", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_14.setBackground(Color.LIGHT_GRAY);
		panel_14.setBounds(118, 65, 98, 43);
		panel_10.add(panel_14);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(6, 16, 86, 20);
		panel_14.add(textField_8);
		
		JButton btnEisagwgh = new JButton("Eisagwgh");
		btnEisagwgh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String name,surname,thl,id,str;
					
				DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
				Date date = new Date();
				
				try{
					//dimiourgia path
					File myDir = new File("C:\\Users\\Kostas\\Downloads\\U.O.M\\java");
					//dhmiourgia arxeiou
					File myFile = new File(myDir, dateFormat.format(date).toString()+"_data.txt");
					FileWriter writer = new FileWriter(myFile);
					{	
						name=textField_5.getText().trim();
						surname=textField_6.getText().trim();
						thl=textField_7.getText().trim();
						id=textField_8.getText().trim();
						str=name + " - " + surname + " - " + thl + " - " + id;
						if(!(name.equals("") && surname.equals("") && thl.equals("") && id.equals("")))
						writer.append(str);
						
						textField_5.setText("");
						textField_6.setText("");
						textField_7.setText("");
						textField_8.setText("");
					}
					writer.close();
					}
				catch(IOException ex)
					{
						ex.printStackTrace();
					}
			}
		});
		btnEisagwgh.setBounds(74, 158, 110, 27);
		btnEisagwgh.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		EisagwghPelatwn.add(btnEisagwgh);
		
		JButton btnBack_1 = new JButton("Back");
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.previous(parent_panel);
			}
		});
		btnBack_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		btnBack_1.setBounds(205, 158, 75, 27);
		EisagwghPelatwn.add(btnBack_1);
		
	}
}
