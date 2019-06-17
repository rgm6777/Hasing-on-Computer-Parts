package test1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminPage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static AdminPage frame=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AdminPage();
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
	public AdminPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 225, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JFrame jf = this;
		JButton btnAddNewItem = new JButton("Add new item");
		btnAddNewItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddNewItem ani = new AddNewItem();
				jf.dispose();
				ani.setVisible(true);
			}
		});
		btnAddNewItem.setBounds(46, 110, 118, 23);
		contentPane.add(btnAddNewItem);
		
		JButton btnDeleteAnItem = new JButton("Delete an item");
		btnDeleteAnItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DeleteItem di = new DeleteItem();
				jf.setVisible(false);
				di.setVisible(true);
			}
		});
		btnDeleteAnItem.setBounds(46, 150, 118, 23);
		contentPane.add(btnDeleteAnItem);
		
		JLabel lblInventory = new JLabel("Inventory");
		lblInventory.setBounds(75, 56, 61, 14);
		contentPane.add(lblInventory);
		
	}
}
