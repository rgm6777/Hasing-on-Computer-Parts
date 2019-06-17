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
public class RegistrationPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPasswordField textField_5, textField_6;
	private JButton btnSignUp;
	static RegistrationPage frame;
	/**
	 * Launch the application.
	 */

	LoginPage lp;;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new RegistrationPage();
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
	public RegistrationPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First name");
		lblFirstName.setBounds(10, 70, 80, 14);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last name");
		lblLastName.setBounds(10, 110, 80, 14);
		contentPane.add(lblLastName);
		
		JLabel lblEmailId = new JLabel("Email ID");
		lblEmailId.setBounds(10, 150, 80, 14);
		contentPane.add(lblEmailId);
		
		JLabel lblPhoneNumber = new JLabel("Phone number");
		lblPhoneNumber.setBounds(10, 190, 100, 14);
		contentPane.add(lblPhoneNumber);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(10, 230, 80, 14);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 270, 80, 14);
		contentPane.add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm password");
		lblConfirmPassword.setBounds(10, 310, 120, 14);
		contentPane.add(lblConfirmPassword);
		
		textField = new JTextField();
		textField.setBounds(130, 67, 120, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(130, 107, 120, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(130, 147, 120, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(130, 187, 120, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(130, 227, 120, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JPasswordField();
		textField_5.setBounds(130, 267, 120, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JPasswordField();
		textField_6.setBounds(130, 307, 120, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JFrame jf = this;
		
		btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				NewUserAdd ob = new NewUserAdd();
				if(textField.getText().isEmpty()||textField_1.getText().isEmpty()||textField_2.getText().isEmpty()||textField_3.getText().isEmpty()||textField_4.getText().isEmpty()||textField_5.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Enter all the fields!");
				}
				else if(ob.addUserToFile(textField.getText(),textField_1.getText(),textField_2.getText(),textField_3.getText(),textField_4.getText(),textField_5.getText())){
					JOptionPane.showMessageDialog(null, "Added");
					lp = new LoginPage();
					jf.setVisible(false);
					lp.setVisible(true);
				}
				else {
				lp = new LoginPage();
				jf.dispose();
				lp.setVisible(true);
				}
			}
		});
		btnSignUp.setBounds(94, 366, 89, 23);
		contentPane.add(btnSignUp);
	}
}
