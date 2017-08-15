import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import java.awt.Color;
import javax.swing.JButton;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void ns() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBackground(Color.WHITE);
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel icon = new JPanel();
		icon.setBackground(Color.GRAY);
		icon.setBounds(189, 30, 230, 213);
		frame.getContentPane().add(icon);
		icon.setLayout(null);
		
		JButton btnInfos = new JButton("infos");
		btnInfos.setBounds(37, 133, 89, 23);
		frame.getContentPane().add(btnInfos);
		
		JButton btnEisagwghPelath = new JButton("Eisagwgh Pelath");
		btnEisagwghPelath.setBounds(37, 30, 122, 32);
		frame.getContentPane().add(btnEisagwghPelath);
		
		JButton btnAnazhthshPelath = new JButton("Anazhthsh Pelath");
		btnAnazhthshPelath.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AnazhthshPelatwn ap = new AnazhthshPelatwn();
				ap.ns2();
				//frame.setVisible(false);
				frame.dispose();
			}
		});
		btnAnazhthshPelath.setBounds(37, 77, 122, 39);
		frame.getContentPane().add(btnAnazhthshPelath);
		frame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{btnEisagwghPelath, btnAnazhthshPelath, btnInfos}));
	}
}
