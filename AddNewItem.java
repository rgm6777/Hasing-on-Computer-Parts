package test1;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class AddNewItem extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddNewItem frame = new AddNewItem();
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
	public AddNewItem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		ButtonGroup bg = new ButtonGroup();
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 48, 115, 310);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblProductType = new JLabel("Product Type:");
		lblProductType.setBounds(24, 9, 91, 14);
		panel.add(lblProductType);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Processor");
		rdbtnNewRadioButton.setBounds(21, 30, 94, 23);
		panel.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Motherboard");
		rdbtnNewRadioButton_1.setBounds(14, 60, 101, 23);
		panel.add(rdbtnNewRadioButton_1);
		bg.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("RAM");
		rdbtnNewRadioButton_2.setBounds(34, 90, 81, 23);
		panel.add(rdbtnNewRadioButton_2);
		bg.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Graphics Card");
		rdbtnNewRadioButton_3.setBounds(6, 120, 109, 23);
		panel.add(rdbtnNewRadioButton_3);
		bg.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Accessories");
		rdbtnNewRadioButton_4.setBounds(17, 150, 98, 23);
		panel.add(rdbtnNewRadioButton_4);
		bg.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Monitor");
		rdbtnNewRadioButton_5.setBounds(27, 180, 88, 23);
		panel.add(rdbtnNewRadioButton_5);
		bg.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Storage");
		rdbtnNewRadioButton_6.setBounds(26, 210, 89, 23);
		panel.add(rdbtnNewRadioButton_6);
		bg.add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Cabinet");
		rdbtnNewRadioButton_7.setBounds(26, 240, 89, 23);
		panel.add(rdbtnNewRadioButton_7);
		bg.add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("Power Supply");
		rdbtnNewRadioButton_8.setBounds(12, 270, 103, 23);
		panel.add(rdbtnNewRadioButton_8);
		bg.add(rdbtnNewRadioButton_8);
		
		//0,4,2,6,8,10,12,14,1,3,5,7,9,11,13
		
		JLabel lblNewLabel = new JLabel("Product ID");
		lblNewLabel.setBounds(135, 14, 60, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Capacity");
		lblNewLabel_1.setBounds(306, 14, 61, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Company");
		lblNewLabel_2.setBounds(135, 64, 60, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Speed");
		lblNewLabel_3.setBounds(306, 64, 61, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Name");
		lblNewLabel_4.setBounds(135, 114, 60, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Size");
		lblNewLabel_5.setBounds(306, 114, 61, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Price");
		lblNewLabel_6.setBounds(135, 164, 60, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Resolution");
		lblNewLabel_7.setBounds(306, 164, 61, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Cores");
		lblNewLabel_8.setBounds(135, 214, 60, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Panel");
		lblNewLabel_9.setBounds(306, 214, 61, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Frequency");
		lblNewLabel_10.setBounds(135, 264, 60, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Slots");
		lblNewLabel_11.setBounds(306, 264, 61, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Socket");
		lblNewLabel_12.setBounds(135, 314, 60, 14);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Wattage");
		lblNewLabel_13.setBounds(306, 314, 61, 14);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Type");
		lblNewLabel_14.setBounds(135, 364, 60, 14);
		contentPane.add(lblNewLabel_14);
		
		textField = new JTextField();
		textField.setBounds(204, 11, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(204, 61, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(204, 111, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(204, 161, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(204, 211, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(204, 261, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(204, 311, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(204, 361, 86, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(377, 11, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(377, 61, 86, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(377, 111, 86, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(377, 161, 86, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(377, 211, 86, 20);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(377, 261, 86, 20);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(377, 311, 86, 20);
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		
		
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setEditable(true);
				textField_1.setEditable(true);
				textField_2.setEditable(true);
				textField_3.setEditable(true);
				textField_4.setEditable(true);
				textField_5.setEditable(true);
				textField_6.setEditable(true);
				textField_7.setEditable(false);
				textField_8.setEditable(false);
				textField_9.setEditable(false);
				textField_10.setEditable(false);
				textField_11.setEditable(false);
				textField_12.setEditable(false);
				textField_13.setEditable(false);
				textField_14.setEditable(false);
			}
		});
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setEditable(true);
				textField_1.setEditable(true);
				textField_2.setEditable(true);
				textField_3.setEditable(true);
				textField_4.setEditable(false);
				textField_5.setEditable(false);
				textField_6.setEditable(true);
				textField_7.setEditable(true);
				textField_8.setEditable(false);
				textField_9.setEditable(false);
				textField_10.setEditable(false);
				textField_11.setEditable(false);
				textField_12.setEditable(false);
				textField_13.setEditable(false);
				textField_14.setEditable(false);
			}
		});
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setEditable(true);
				textField_1.setEditable(true);
				textField_2.setEditable(true);
				textField_3.setEditable(true);
				textField_4.setEditable(false);
				textField_5.setEditable(false);
				textField_6.setEditable(false);
				textField_7.setEditable(true);
				textField_8.setEditable(true);
				textField_9.setEditable(true);
				textField_10.setEditable(false);
				textField_11.setEditable(false);
				textField_12.setEditable(false);
				textField_13.setEditable(false);
				textField_14.setEditable(false);
			}
		});
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setEditable(true);
				textField_1.setEditable(true);
				textField_2.setEditable(true);
				textField_3.setEditable(true);
				textField_4.setEditable(false);
				textField_5.setEditable(true);
				textField_6.setEditable(false);
				textField_7.setEditable(false);
				textField_8.setEditable(true);
				textField_9.setEditable(false);
				textField_10.setEditable(false);
				textField_11.setEditable(false);
				textField_12.setEditable(false);
				textField_13.setEditable(false);
				textField_14.setEditable(false);
			}
		});
		rdbtnNewRadioButton_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setEditable(true);
				textField_1.setEditable(true);
				textField_2.setEditable(true);
				textField_3.setEditable(true);
				textField_4.setEditable(false);
				textField_5.setEditable(false);
				textField_6.setEditable(false);
				textField_7.setEditable(false);
				textField_8.setEditable(false);
				textField_9.setEditable(false);
				textField_10.setEditable(false);
				textField_11.setEditable(false);
				textField_12.setEditable(false);
				textField_13.setEditable(false);
				textField_14.setEditable(false);
			}
		});
		rdbtnNewRadioButton_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setEditable(true);
				textField_1.setEditable(true);
				textField_2.setEditable(true);
				textField_3.setEditable(true);
				textField_4.setEditable(false);
				textField_5.setEditable(false);
				textField_6.setEditable(false);
				textField_7.setEditable(false);
				textField_8.setEditable(false);
				textField_9.setEditable(false);
				textField_10.setEditable(true);
				textField_11.setEditable(true);
				textField_12.setEditable(true);
				textField_13.setEditable(false);
				textField_14.setEditable(false);
			}
		});
		rdbtnNewRadioButton_6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setEditable(true);
				textField_1.setEditable(true);
				textField_2.setEditable(true);
				textField_3.setEditable(true);
				textField_4.setEditable(false);
				textField_5.setEditable(false);
				textField_6.setEditable(false);
				textField_7.setEditable(true);
				textField_8.setEditable(true);
				textField_9.setEditable(true);
				textField_10.setEditable(false);
				textField_11.setEditable(false);
				textField_12.setEditable(false);
				textField_13.setEditable(false);
				textField_14.setEditable(false);
			}
		});
		rdbtnNewRadioButton_7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setEditable(true);
				textField_1.setEditable(true);
				textField_2.setEditable(true);
				textField_3.setEditable(true);
				textField_4.setEditable(false);
				textField_5.setEditable(false);
				textField_6.setEditable(false);
				textField_7.setEditable(true);
				textField_8.setEditable(false);
				textField_9.setEditable(false);
				textField_10.setEditable(false);
				textField_11.setEditable(false);
				textField_12.setEditable(false);
				textField_13.setEditable(true);
				textField_14.setEditable(false);
			}
		});
		rdbtnNewRadioButton_8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setEditable(true);
				textField_1.setEditable(true);
				textField_2.setEditable(true);
				textField_3.setEditable(true);
				textField_4.setEditable(false);
				textField_5.setEditable(false);
				textField_6.setEditable(false);
				textField_7.setEditable(false);
				textField_8.setEditable(false);
				textField_9.setEditable(false);
				textField_10.setEditable(false);
				textField_11.setEditable(false);
				textField_12.setEditable(false);
				textField_13.setEditable(false);
				textField_14.setEditable(true);
			}
		});
		
		
		JButton btnAddToInventory = new JButton("Add to Inventory");
		btnAddToInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String newPart = "";
		
				@SuppressWarnings("unused")
				File f1 = new File("hash.txt");
				File f2 = new File("hash.txt");
				String s[] = new String[10];
				int i=0,f=0;
				Scanner sc;

				String id = textField.getText();
				//Read all lines from hash file and store it into a variable
				try {
					sc = new Scanner(f2);
					while(sc.hasNextLine()) {
						s[i] = sc.nextLine();
						String sp[] = s[i].split("[|]");
						int l = sp.length;
						for(int j=0;j<l;j++)
							if(sp[j].equals(id)) {
								f=1;
								break;
							}
						i++;
						if(i==11)
							break;
					}
					sc.close();
				} catch(Exception e1) { }
				
				if(f==1)
					JOptionPane.showMessageDialog(null, "Cant add product because product ID is already in use!");
				else {
					//Modify the hash file to add new value
					int h = Integer.parseInt(id) % 10;
					s[h] += id+"|";
					try {
						FileWriter fw = new FileWriter(f2,false);
						BufferedWriter br = new BufferedWriter(fw);
						for(int j=0;j<10;j++) {
							br.write(s[j]+"\n");
						}
						br.close();
						fw.close();
					} catch(Exception e1) { 
						System.out.println("Error: "+e1);
					}
					if(rdbtnNewRadioButton.isSelected())
						newPart = textField.getText()+"|"+textField_2.getText()+"|"+textField_1.getText()+"|"+textField_3.getText()+"|"+textField_4.getText()+"|"+textField_5.getText()+"|"+textField_6.getText();
					if(rdbtnNewRadioButton_1.isSelected())
						newPart = textField.getText()+"|"+textField_2.getText()+"|"+textField_1.getText()+"|"+textField_3.getText()+"|"+textField_6.getText()+"|"+textField_7.getText();
					if(rdbtnNewRadioButton_2.isSelected())
						newPart = textField.getText()+"|"+textField_2.getText()+"|"+textField_1.getText()+"|"+textField_3.getText()+"|"+textField_8.getText()+"|"+textField_9.getText()+"|"+textField_7.getText();
					if(rdbtnNewRadioButton_3.isSelected())
						newPart = textField.getText()+"|"+textField_2.getText()+"|"+textField_1.getText()+"|"+textField_3.getText()+"|"+textField_5.getText()+"|"+textField_8.getText();
					if(rdbtnNewRadioButton_4.isSelected())
						newPart = textField.getText()+"|"+textField_2.getText()+"|"+textField_1.getText()+"|"+textField_3.getText();
					if(rdbtnNewRadioButton_5.isSelected())
						newPart = textField.getText()+"|"+textField_2.getText()+"|"+textField_1.getText()+"|"+textField_3.getText()+"|"+textField_10.getText()+"|"+textField_11.getText()+"|"+textField_12.getText();
					if(rdbtnNewRadioButton_6.isSelected())
						newPart = textField.getText()+"|"+textField_2.getText()+"|"+textField_1.getText()+"|"+textField_3.getText()+"|"+textField_8.getText()+"|"+textField_9.getText()+"|"+textField_7.getText();
					if(rdbtnNewRadioButton_7.isSelected())
						newPart = textField.getText()+"|"+textField_2.getText()+"|"+textField_1.getText()+"|"+textField_3.getText()+"|"+textField_13.getText()+"|"+textField_7.getText();
					if(rdbtnNewRadioButton_8.isSelected())
						newPart = textField.getText()+"|"+textField_2.getText()+"|"+textField_1.getText()+"|"+textField_3.getText()+"|"+textField_14.getText();
					//Adding to products.txt file the product details
					File f3 = new File("products.txt");
					try {
						FileWriter fw = new FileWriter(f3,true);
						BufferedWriter bw = new BufferedWriter(fw);
						bw.write(newPart+"\n");
						bw.close();
						fw.close();
					} catch(Exception e2) { }
				}
				
			
				
			}
		});
		btnAddToInventory.setBounds(321, 360, 142, 23);
		contentPane.add(btnAddToInventory);
		
	}
}
