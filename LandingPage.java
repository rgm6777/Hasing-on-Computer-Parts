package test1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class LandingPage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	static LandingPage frame;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new LandingPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LandingPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 249, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JFrame jf = this;
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage lp = new LoginPage();
				lp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jf.dispose();
				lp.setVisible(true);
			}
		});
		btnNewButton.setBounds(71, 148, 89, 23);
		contentPane.add(btnNewButton);
		JButton btnNewButton_1 = new JButton("SIGNUP");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RegistrationPage rp = new RegistrationPage();
				rp.setVisible(true);
				rp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jf.dispose();
			}
		});
		btnNewButton_1.setBounds(71, 202, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblComputerPartsStore = new JLabel("Computer Parts Store");
		lblComputerPartsStore.setBounds(58, 103, 147, 14);
		contentPane.add(lblComputerPartsStore);
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage lp = new LoginPage();
				frame.setVisible(false);
				lp.setVisible(true);
			}
		});
	}
}
