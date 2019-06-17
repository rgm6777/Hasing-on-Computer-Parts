package test1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



@SuppressWarnings("serial")
public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField textField_1;

	/**
	 * Launch the application.
	 */
	static LoginPage frame;
	RegistrationPage rp;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new LoginPage();
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
	public LoginPage() {
		
		ValidateUser ob = new ValidateUser();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(34, 96, 80, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(34, 146, 80, 14);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(108, 93, 120, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JPasswordField();
		textField_1.setBounds(108, 143, 120, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JFrame jf = this;
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().isEmpty()||textField_1.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Enter all the fields!");
				}
				else if(textField.getText().equals("admin")||textField_1.getText().equals("admin")) {
					AdminPage ap = new AdminPage();
					jf.setVisible(false);
					ap.setVisible(true);
				}
				else if(ob.isUserValid(textField.getText(), textField_1.getText())) {
					ShoppingPage sp = new ShoppingPage(textField.getText());
					jf.setVisible(false);
					sp.setVisible(true);
					
				}
				else {
					JOptionPane.showMessageDialog(null, "User does not exist, please register");
					rp = new RegistrationPage();
					rp.setVisible(true);
				}
			}
		});
		btnLogin.setBounds(84, 193, 89, 23);
		contentPane.add(btnLogin);
	}

}

