package test1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Font;

public class ShoppingPage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ButtonGroup bg;
	private JPanel contentPane;
	private JTextField textField;
	String s1[][] = new String[20][8],s2[][] = new String[20][8],s3[][] = new String[20][8],s4[][] = new String[20][8],s5[][] = new String[20][8],s6[][] = new String[20][8],s7[][] = new String[20][8],s8[][] = new String[20][8],s9[][] = new String[20][8];
	int count[] = null;
	String cc;
	String cart = "";
	int amt = 0;
	String lcart = "";
	String u ="";
	/**
	 * Launch the application.
	 */
	
	JLabel lblNewLabel_1,lblNewLabel_2,lblNewLabel_3,lblNewLabel_4,lblNewLabel_5,lblNewLabel_6,lblNewLabel_7;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShoppingPage frame = new ShoppingPage("------");
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
	
	public ShoppingPage(String user) {
		u = user;
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 67, 128, 290);
		panel.setBorder(BorderFactory.createLineBorder(Color.black));
		contentPane.add(panel);
		
		JLabel lblComputerParts = new JLabel("Computer Parts");
		lblComputerParts.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblComputerParts);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Processor");
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Motherboard");
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("RAM");
		panel.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Graphics Card");
		panel.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Accessories");
		panel.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Monitor");
		panel.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Storage");
		panel.add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Cabinet");
		panel.add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("Power Supply");
		panel.add(rdbtnNewRadioButton_8);
		
		bg = new ButtonGroup();
		
		rdbtnNewRadioButton.setActionCommand("Processor");
		rdbtnNewRadioButton_1.setActionCommand("Motherboard");
		rdbtnNewRadioButton_2.setActionCommand("RAM");
		rdbtnNewRadioButton_3.setActionCommand("GraphicsCard");
		rdbtnNewRadioButton_4.setActionCommand("Accesories");
		rdbtnNewRadioButton_5.setActionCommand("Monitor");
		rdbtnNewRadioButton_6.setActionCommand("Storage");
		rdbtnNewRadioButton_7.setActionCommand("Cabinet");
		rdbtnNewRadioButton_8.setActionCommand("PowerSupply");
		
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton_1);
		bg.add(rdbtnNewRadioButton_2);
		bg.add(rdbtnNewRadioButton_3);
		bg.add(rdbtnNewRadioButton_4);
		bg.add(rdbtnNewRadioButton_5);
		bg.add(rdbtnNewRadioButton_6);
		bg.add(rdbtnNewRadioButton_7);
		bg.add(rdbtnNewRadioButton_8);
		JPanel panel_1 = new JPanel();
		JPanel panel_2 = new JPanel();
		JPanel panel_3 = new JPanel();
		JPanel panel_4 = new JPanel();
		JPanel panel_5 = new JPanel();
		JPanel panel_6 = new JPanel();
		JPanel panel_7 = new JPanel();
		JPanel panel_8 = new JPanel();
		JPanel panel_9 = new JPanel();
		JPanel panel_10 = new JPanel();
		panel_1.setBounds(148, 92, 339, 265);
		panel_2.setBounds(148, 92, 339, 265);
		panel_3.setBounds(148, 92, 339, 265);
		panel_4.setBounds(148, 92, 339, 265);
		panel_5.setBounds(148, 92, 339, 265);
		panel_6.setBounds(148, 92, 339, 265);
		panel_7.setBounds(148, 92, 339, 265);
		panel_8.setBounds(148, 92, 339, 265);
		panel_9.setBounds(148, 92, 339, 265);
		panel_10.setBounds(148, 92, 339, 265);
		
		panel_1.setBorder(BorderFactory.createLineBorder(Color.black));
		panel_2.setBorder(BorderFactory.createLineBorder(Color.black));
		panel_3.setBorder(BorderFactory.createLineBorder(Color.black));
		panel_4.setBorder(BorderFactory.createLineBorder(Color.black));
		panel_5.setBorder(BorderFactory.createLineBorder(Color.black));
		panel_6.setBorder(BorderFactory.createLineBorder(Color.black));
		panel_7.setBorder(BorderFactory.createLineBorder(Color.black));
		panel_8.setBorder(BorderFactory.createLineBorder(Color.black));
		panel_9.setBorder(BorderFactory.createLineBorder(Color.black));
		panel_10.setBorder(BorderFactory.createLineBorder(Color.black));

		
		
		
		
		contentPane.add(panel_1);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		contentPane.add(panel_6);
		panel_6.setLayout(null);
		
		contentPane.add(panel_7);
		panel_7.setLayout(null);
		
		contentPane.add(panel_8);
		panel_8.setLayout(null);
		
		contentPane.add(panel_9);
		panel_9.setLayout(null);
		
		contentPane.add(panel_10);
		panel_10.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("Choose a category from the list to display the products");
		lblNewLabel.setBounds(10, 119, 319, 14);
		panel_1.add(lblNewLabel);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(497, 67, 269, 290);
		panel_11.setBorder(BorderFactory.createLineBorder(Color.black));
		contentPane.add(panel_11);
		panel_11.setLayout(null);
		
		lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setBounds(10, 10, 250, 14);
		panel_11.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setBounds(10, 35, 250, 14);
		panel_11.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel();
		lblNewLabel_3.setBounds(10, 60, 250, 14);
		panel_11.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel();
		lblNewLabel_4.setBounds(10, 85, 250, 14);
		panel_11.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel();
		lblNewLabel_5.setBounds(10, 110, 250, 14);
		panel_11.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel();
		lblNewLabel_6.setBounds(10, 135, 250, 14);
		panel_11.add(lblNewLabel_6);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBounds(497, 368, 267, 82);
		panel_13.setPreferredSize(new Dimension(77,77));
		panel_13.setBorder(BorderFactory.createLineBorder(Color.black));
		contentPane.add(panel_13);
		panel_13.setLayout(null);
		
		JLabel lblTotalAmount = new JLabel("Total Amount:");
		lblTotalAmount.setBounds(10, 11, 85, 14);
		panel_13.add(lblTotalAmount);
		
		JLabel lblRs = new JLabel("Rs. 0");
		lblRs.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblRs.setBounds(10, 27, 144, 44);
		panel_13.add(lblRs);
		
		JButton btnCheckout = new JButton("CHECKOUT");
		btnCheckout.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCheckout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(!cart.equals("")) {
					File f = new File("orders.txt");
					try {
						FileWriter fw = new FileWriter(f,true);
						BufferedWriter bw = new BufferedWriter(fw);
						bw.write(user+"|"+cart+"\n");
						bw.close();
						fw.close();
						JOptionPane.showMessageDialog(null, "Thank you for purchasing with us!");
					} catch(Exception e1) { }
				}
				else
					JOptionPane.showMessageDialog(null, "Please add one item to the cart to checkout!");
				
			}
		});
		btnCheckout.setBounds(145, 27, 112, 23);
		panel_13.add(btnCheckout);

		JPanel panel_12 = new JPanel();
		panel_12.setBounds(10, 368, 478, 82);
		panel_12.setPreferredSize(new Dimension(77,77));
		panel_12.setBorder(BorderFactory.createLineBorder(Color.black));
		contentPane.add(panel_12);
		panel_12.setLayout(null);
		
		lblNewLabel_7 = new JLabel();
		lblNewLabel_7.setBounds(10, 203, 250, 14);
		panel_11.add(lblNewLabel_7);
		JLabel lblLastItemAdded = new JLabel("Last item added to cart:");
		lblLastItemAdded.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLastItemAdded.setBounds(10, 32, 171, 14);
		panel_12.add(lblLastItemAdded);
		
		JLabel lblNewLabel_8 = new JLabel("Product ID:");
		lblNewLabel_8.setBounds(177, 11, 120, 14);
		panel_12.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Company:");
		lblNewLabel_9.setBounds(177, 57, 145, 14);
		panel_12.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Name:");
		lblNewLabel_10.setBounds(307, 11, 161, 14);
		panel_12.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Price:");
		lblNewLabel_11.setBounds(307, 57, 161, 14);
		panel_12.add(lblNewLabel_11);
		
		JButton btnAddToCart = new JButton("Add to Cart");
		btnAddToCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cart+=cc+"+";
				int p=0;
				int k = Integer.parseInt(cc) / 1000 - 1;
				if(k==0) {
					while(!s1[p][0].equals(cc))
						p++;
					amt += Integer.parseInt(s1[p][3]);
					lblNewLabel_8.setText("Product ID: "+s1[p][0]);
					lblNewLabel_9.setText("Company: "+s1[p][1]);
					lblNewLabel_10.setText("Name: "+s1[p][2]);
					lblNewLabel_11.setText("Price: "+s1[p][3]);
				}
				else if(k==1) {
					while(!s2[p][0].equals(cc))
						p++;
					amt += Integer.parseInt(s2[p][3]);
					lblNewLabel_8.setText("Product ID: "+s2[p][0]);
					lblNewLabel_9.setText("Company: "+s2[p][2]);
					lblNewLabel_10.setText("Name: "+s2[p][1]);
					lblNewLabel_11.setText("Price: "+s2[p][3]);
				}
				else if(k==2) {
					while(!s3[p][0].equals(cc))
						p++;
					amt += Integer.parseInt(s3[p][3]);
					lblNewLabel_8.setText("Product ID: "+s3[p][0]);
					lblNewLabel_9.setText("Company: "+s3[p][2]);
					lblNewLabel_10.setText("Name: "+s3[p][1]);
					lblNewLabel_11.setText("Price: "+s3[p][3]);
				}
				else if(k==3) {
					while(!s4[p][0].equals(cc))
						p++;
					amt += Integer.parseInt(s4[p][3]);
					lblNewLabel_8.setText("Product ID: "+s4[p][0]);
					lblNewLabel_9.setText("Company: "+s4[p][2]);
					lblNewLabel_10.setText("Name: "+s4[p][1]);
					lblNewLabel_11.setText("Price: "+s4[p][3]);
				}
				else if(k==4) {
					while(!s5[p][0].equals(cc))
						p++;
					amt += Integer.parseInt(s5[p][3]);
					lblNewLabel_8.setText("Product ID: "+s5[p][0]);
					lblNewLabel_9.setText("Company: "+s5[p][2]);
					lblNewLabel_10.setText("Name: "+s5[p][1]);
					lblNewLabel_11.setText("Price: "+s5[p][3]);
				}
				else if(k==5) {
					while(!s6[p][0].equals(cc))
						p++;
					amt += Integer.parseInt(s6[p][3]);
					lblNewLabel_8.setText("Product ID: "+s6[p][0]);
					lblNewLabel_9.setText("Company: "+s6[p][2]);
					lblNewLabel_10.setText("Name: "+s6[p][1]);
					lblNewLabel_11.setText("Price: "+s6[p][3]);
				}
				else if(k==6) {
					while(!s7[p][0].equals(cc))
						p++;
					amt += Integer.parseInt(s7[p][3]);
					lblNewLabel_8.setText("Product ID: "+s7[p][0]);
					lblNewLabel_9.setText("Company: "+s7[p][2]);
					lblNewLabel_10.setText("Name: "+s7[p][1]);
					lblNewLabel_11.setText("Price: "+s7[p][3]);
				}
				else if(k==7) {
					while(!s8[p][0].equals(cc))
						p++;
					amt += Integer.parseInt(s8[p][3]);
					lblNewLabel_8.setText("Product ID: "+s8[p][0]);
					lblNewLabel_9.setText("Company: "+s8[p][2]);
					lblNewLabel_10.setText("Name: "+s8[p][1]);
					lblNewLabel_11.setText("Price: "+s8[p][3]);
				}
				else if(k==8) {
					while(!s9[p][0].equals(cc))
						p++;
					amt += Integer.parseInt(s9[p][3]);
					lblNewLabel_8.setText("Product ID: "+s9[p][0]);
					lblNewLabel_9.setText("Company: "+s9[p][2]);
					lblNewLabel_10.setText("Name: "+s9[p][1]);
					lblNewLabel_11.setText("Price: "+s9[p][3]);
				}
				lblRs.setText("Rs. "+amt);
			}
		});
		btnAddToCart.setBounds(10, 256, 250, 23);
		panel_11.add(btnAddToCart);

		

		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel_5.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel_6.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel_7.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel_8.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel_9.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel_10.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblComputerPartsShopping = new JLabel("Computer Parts Shopping");
		lblComputerPartsShopping.setFont(new Font("Segoe UI Black", Font.PLAIN, 26));
		lblComputerPartsShopping.setBounds(215, 11, 362, 33);
		contentPane.add(lblComputerPartsShopping);
		
		JLabel lblSearchForAn = new JLabel("Search for an item:");
		lblSearchForAn.setBounds(148, 67, 120, 14);
		contentPane.add(lblSearchForAn);
		
		textField = new JTextField();
		textField.setBounds(260, 67, 140, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String search = textField.getText();
				int f = 0;
				if(search.length()!=4) {
					JOptionPane.showMessageDialog(null, "Enter 4 digit product ID to search");
				}
				else {
					try {
						int id = Integer.parseInt(search);
						int h = id / 1000 - 1;
						if(h==0) {
							for(int k=0;k<count[h];k++) {
								if(s1[k][0].equals(id+"")) {
									lblNewLabel.setText("Searched results are   ------ >   ");
									panel_2.setVisible(false);
									panel_3.setVisible(false);
									panel_4.setVisible(false);
									panel_5.setVisible(false);
									panel_6.setVisible(false);
									panel_7.setVisible(false);
									panel_8.setVisible(false);
									panel_9.setVisible(false);
									panel_10.setVisible(false);
									panel_1.setVisible(true);
									displayContent(s1[k][0]);
									f=1;
									break;
								}
							}
							if(f==0)
								lblNewLabel.setText("No results found!");
						}
						else if (h == 1) {
							for (int k = 0; k < count[h]; k++) {
								if (s2[k][0].equals(id + "")) {
									lblNewLabel.setText("Searched results are   ------ >   ");
									panel_2.setVisible(false);
									panel_3.setVisible(false);
									panel_4.setVisible(false);
									panel_5.setVisible(false);
									panel_6.setVisible(false);
									panel_7.setVisible(false);
									panel_8.setVisible(false);
									panel_9.setVisible(false);
									panel_10.setVisible(false);
									panel_1.setVisible(true);
									displayContent(s2[k][0]);
									f = 1;
									break;
								}
							}
							if (f == 0)
								lblNewLabel.setText("No results found!");
						}
						else if (h == 2) {
							for (int k = 0; k < count[h]; k++) {
								if (s3[k][0].equals(id + "")) {
									lblNewLabel.setText("Searched results are   ------ >   ");
									panel_2.setVisible(false);
									panel_3.setVisible(false);
									panel_4.setVisible(false);
									panel_5.setVisible(false);
									panel_6.setVisible(false);
									panel_7.setVisible(false);
									panel_8.setVisible(false);
									panel_9.setVisible(false);
									panel_10.setVisible(false);
									panel_1.setVisible(true);
									displayContent(s3[k][0]);
									f = 1;
									break;
								}
							}
							if (f == 0)
								lblNewLabel.setText("No results found!");
						}
						else if (h == 3) {
							for (int k = 0; k < count[h]; k++) {
								if (s4[k][0].equals(id + "")) {
									lblNewLabel.setText("Searched results are   ------ >   ");
									panel_2.setVisible(false);
									panel_3.setVisible(false);
									panel_4.setVisible(false);
									panel_5.setVisible(false);
									panel_6.setVisible(false);
									panel_7.setVisible(false);
									panel_8.setVisible(false);
									panel_9.setVisible(false);
									panel_10.setVisible(false);
									panel_1.setVisible(true);
									displayContent(s4[k][0]);
									f = 1;
									break;
								}
							}
							if (f == 0)
								lblNewLabel.setText("No results found!");
						}
						else if (h == 4) {
							for (int k = 0; k < count[h]; k++) {
								if (s5[k][0].equals(id + "")) {
									lblNewLabel.setText("Searched results are   ------ >   ");
									panel_2.setVisible(false);
									panel_3.setVisible(false);
									panel_4.setVisible(false);
									panel_5.setVisible(false);
									panel_6.setVisible(false);
									panel_7.setVisible(false);
									panel_8.setVisible(false);
									panel_9.setVisible(false);
									panel_10.setVisible(false);
									panel_1.setVisible(true);
									displayContent(s5[k][0]);
									f = 1;
									break;
								}
							}
							if (f == 0)
								lblNewLabel.setText("No results found!");
						}
						else if (h == 5) {
							for (int k = 0; k < count[h]; k++) {
								if (s6[k][0].equals(id + "")) {
									lblNewLabel.setText("Searched results are   ------ >   ");
									panel_2.setVisible(false);
									panel_3.setVisible(false);
									panel_4.setVisible(false);
									panel_5.setVisible(false);
									panel_6.setVisible(false);
									panel_7.setVisible(false);
									panel_8.setVisible(false);
									panel_9.setVisible(false);
									panel_10.setVisible(false);
									panel_1.setVisible(true);
									displayContent(s6[k][0]);
									f = 1;
									break;
								}
							}
							if (f == 0)
								lblNewLabel.setText("No results found!");
						}
						else if (h == 6) {
							for (int k = 0; k < count[h]; k++) {
								if (s7[k][0].equals(id + "")) {
									lblNewLabel.setText("Searched results are   ------ >   ");
									panel_2.setVisible(false);
									panel_3.setVisible(false);
									panel_4.setVisible(false);
									panel_5.setVisible(false);
									panel_6.setVisible(false);
									panel_7.setVisible(false);
									panel_8.setVisible(false);
									panel_9.setVisible(false);
									panel_10.setVisible(false);
									panel_1.setVisible(true);
									displayContent(s7[k][0]);
									f = 1;
									break;
								}
							}
							if (f == 0)
								lblNewLabel.setText("No results found!");
						}
						else if (h == 7) {
							for (int k = 0; k < count[h]; k++) {
								if (s8[k][0].equals(id + "")) {
									lblNewLabel.setText("Searched results are   ------ >   ");
									panel_2.setVisible(false);
									panel_3.setVisible(false);
									panel_4.setVisible(false);
									panel_5.setVisible(false);
									panel_6.setVisible(false);
									panel_7.setVisible(false);
									panel_8.setVisible(false);
									panel_9.setVisible(false);
									panel_10.setVisible(false);
									panel_1.setVisible(true);
									displayContent(s8[k][0]);
									f = 1;
									break;
								}
							}
							if (f == 0)
								lblNewLabel.setText("No results found!");
						}
						else if (h == 8) {
							for (int k = 0; k < count[h]; k++) {
								if (s9[k][0].equals(id + "")) {
									lblNewLabel.setText("Searched results are   ------ >   ");
									panel_2.setVisible(false);
									panel_3.setVisible(false);
									panel_4.setVisible(false);
									panel_5.setVisible(false);
									panel_6.setVisible(false);
									panel_7.setVisible(false);
									panel_8.setVisible(false);
									panel_9.setVisible(false);
									panel_10.setVisible(false);
									panel_1.setVisible(true);
									displayContent(s9[k][0]);
									f = 1;
									break;
								}
							}
							if (f == 0)
								lblNewLabel.setText("No results found!");
						}
					} catch(Exception e) {
						JOptionPane.showMessageDialog(null, "Enter a 4 digit number to search!");
					}
				}
			}
		});
		btnSearch.setBounds(410, 67, 77, 20);
		contentPane.add(btnSearch);
		
		

		
		
		
		
		File f = new File("products.txt");
		count = new int[9];
		for(int i=0;i<20;i++) {
			for(int j=0;j<8;j++) {
				s1[i][j] = new String("-");
				s2[i][j] = new String("-");
				s3[i][j] = new String("-");
				s4[i][j] = new String("-");
				s5[i][j] = new String("-");
				s6[i][j] = new String("-");
				s7[i][j] = new String("-");
				s8[i][j] = new String("-");
				s9[i][j] = new String("-");
			}
		}
		for(int i=0;i<9;i++)
			count[i] = 0;
		int k=0;
		String s, sp[];
		try {
			int i=0;
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {
				s = sc.nextLine();
				sp =s.split("[|]");
				k = Integer.parseInt(sp[0]) / 1000 - 1;
				if(k==0) {
					i = count[k];
					s1[i] = sp;
					i++;
					count[k] = i;
				}
				else if(k==1) {
					i = count[k];
					s2[i] = sp;
					i++;
					count[k] = i;
				}
				else if(k==2) {
					i = count[k];
					s3[i] = sp;
					i++;
					count[k] = i;
				}
				else if(k==3) {
					i = count[k];
					s4[i] = sp;
					i++;
					count[k] = i;
				}
				else if(k==4) {
					i = count[k];
					s5[i] = sp;
					i++;
					count[k] = i;
				}
				else if(k==5) {
					i = count[k];
					s6[i] = sp;
					i++;
					count[k] = i;
				}
				else if(k==6) {
					i = count[k];
					s7[i] = sp;
					i++;
					count[k] = i;
				}
				else if(k==7) {
					i = count[k];
					s8[i] = sp;
					i++;
					count[k] = i;
				}
				else if(k==8) {
					i = count[k];
					s9[i] = sp;
					i++;
					count[k] = i;
				}
			}
			sc.close();
		}catch(Exception e) {}
		
		JPanel p1[] = new JPanel[count[0]];
		JLabel l1[] = new JLabel[3 * count[0]];
		JPanel p2[] = new JPanel[count[1]];
		JLabel l2[] = new JLabel[3 * count[1]];
		JPanel p3[] = new JPanel[count[2]];
		JLabel l3[] = new JLabel[3 * count[2]];
		JPanel p4[] = new JPanel[count[3]];
		JLabel l4[] = new JLabel[3 * count[3]];
		JPanel p5[] = new JPanel[count[4]];
		JLabel l5[] = new JLabel[3 * count[4]];
		JPanel p6[] = new JPanel[count[5]];
		JLabel l6[] = new JLabel[3 * count[5]];
		JPanel p7[] = new JPanel[count[6]];
		JLabel l7[] = new JLabel[3 * count[6]];
		JPanel p8[] = new JPanel[count[7]];
		JLabel l8[] = new JLabel[3 * count[7]];
		JPanel p9[] = new JPanel[count[8]];
		JLabel l9[] = new JLabel[3 * count[8]];
		
		
		//Adding to Processor JPanel  
		int lcount = 0;
    	for(int i=0; i<count[0]; i++) {
    		p1[i] = createPanel(s1[i][0]);
    		l1[lcount] = new JLabel(s1[i][0]);
    		p1[i].add(l1[lcount]);
    		p1[i].setPreferredSize(new Dimension(77,77));
    		p1[i].setBorder(BorderFactory.createLineBorder(Color.black));
    		panel_2.add(p1[i]);
    		lcount++;
    		p1[i].addMouseListener(new MouseAdapter() {
    			@Override
    			public void mouseClicked(MouseEvent e) {
    				displayContent(e.getSource()+"");
    				
    			}
    		});
    	}
    	//Adding to Motherboard JPanel
    	lcount = 0;
    	for(int i=0; i<count[1]; i++) {
    		p2[i]  = createPanel(s2[i][0]);
    		l2[lcount] = new JLabel(s2[i][0]);
    		p2[i].add(l2[lcount]);
    		p2[i].setPreferredSize(new Dimension(77,77));
    		p2[i].setBorder(BorderFactory.createLineBorder(Color.black));
    		panel_3.add(p2[i]);
    		lcount++;
    		p2[i].addMouseListener(new MouseAdapter() {
    			@Override
    			public void mouseClicked(MouseEvent e) {
    				displayContent(e.getSource()+"");

    			}
    		});
    	}
    	//Adding to RAM JPanel
    	lcount = 0;
    	for(int i=0; i<count[2]; i++) {
    		p3[i]  = createPanel(s3[i][0]);
    		l3[lcount] = new JLabel(s3[i][0]);
    		p3[i].add(l3[lcount]);
    		p3[i].setPreferredSize(new Dimension(77,77));
    		p3[i].setBorder(BorderFactory.createLineBorder(Color.black));
    		panel_4.add(p3[i]);
    		lcount++;
    		p3[i].addMouseListener(new MouseAdapter() {
    			@Override
    			public void mouseClicked(MouseEvent e) {
    				displayContent(e.getSource()+"");
    				
    			}
    		});
    	}
    	//Adding to Graphics Card JPanel
    	lcount = 0;
    	for(int i=0; i<count[3]; i++) {
    		p4[i]   = createPanel(s4[i][0]);
    		l4[lcount] = new JLabel(s4[i][0]);
    		p4[i].add(l4[lcount]);
    		p4[i].setPreferredSize(new Dimension(77,77));
    		p4[i].setBorder(BorderFactory.createLineBorder(Color.black));
    		panel_5.add(p4[i]);
    		lcount++;
    		p4[i].addMouseListener(new MouseAdapter() {
    			@Override
    			public void mouseClicked(MouseEvent e) {
    				displayContent(e.getSource()+"");
    				
    			}
    		});
    	}
    	//Adding to Accessories JPanel
    	lcount = 0;
    	for(int i=0; i<count[4]; i++) {
    		p5[i]   = createPanel(s5[i][0]);
    		l5[lcount] = new JLabel(s5[i][0]);
    		p5[i].add(l5[lcount]);
    		p5[i].setPreferredSize(new Dimension(77,77));
    		p5[i].setBorder(BorderFactory.createLineBorder(Color.black));
    		panel_6.add(p5[i]);
    		lcount++;
    		p5[i].addMouseListener(new MouseAdapter() {
    			@Override
    			public void mouseClicked(MouseEvent e) {
    				displayContent(e.getSource()+"");
    				
    			}
    		});
    	}
    	//Adding to Monitor JPanel
    	lcount = 0;
    	for(int i=0; i<count[5]; i++) {
    		p6[i]  = createPanel(s6[i][0]);
    		l6[lcount] = new JLabel(s6[i][0]);
    		p6[i].add(l6[lcount]);
    		p6[i].setPreferredSize(new Dimension(77,77));
    		p6[i].setBorder(BorderFactory.createLineBorder(Color.black));
    		panel_7.add(p6[i]);
    		lcount++;
    		p6[i].addMouseListener(new MouseAdapter() {
    			@Override
    			public void mouseClicked(MouseEvent e) {
    				displayContent(e.getSource()+"");
    				
    			}
    		});
    	}
    	//Adding to Storage JPanel
    	lcount = 0;
    	for(int i=0; i<count[6]; i++) {
    		p7[i]  = createPanel(s7[i][0]);
    		l7[lcount] = new JLabel(s7[i][0]);
    		p7[i].add(l7[lcount]);
    		p7[i].setPreferredSize(new Dimension(77,77));
    		p7[i].setBorder(BorderFactory.createLineBorder(Color.black));
    		panel_8.add(p7[i]);
    		lcount++;
    		p7[i].addMouseListener(new MouseAdapter() {
    			@Override
    			public void mouseClicked(MouseEvent e) {
    				displayContent(e.getSource()+"");
    				
    			}
    		});
    	}
    	//Adding to Cabinet JPanel
    	lcount = 0;
    	for(int i=0; i<count[7]; i++) {
    		p8[i]  = createPanel(s8[i][0]);
    		l8[lcount] = new JLabel(s8[i][0]);
    		p8[i].add(l8[lcount]);
    		p8[i].setPreferredSize(new Dimension(77,77));
    		p8[i].setBorder(BorderFactory.createLineBorder(Color.black));
    		panel_9.add(p8[i]);
    		lcount++;
    		p8[i].addMouseListener(new MouseAdapter() {
    			@Override
    			public void mouseClicked(MouseEvent e) {
    				displayContent(e.getSource()+"");
    				
    			}
    		});
    	}
    	//Adding to Power Supply JPanel
    	lcount = 0;
    	for(int i=0; i<count[8]; i++) {
    		p9[i]  = createPanel(s9[i][0]);
    		l9[lcount] = new JLabel(s9[i][0]);
    		p9[i].add(l9[lcount]);
    		p9[i].setPreferredSize(new Dimension(77,77));
    		p9[i].setBorder(BorderFactory.createLineBorder(Color.black));
    		panel_10.add(p9[i]);
    		lcount++;
    		p9[i].addMouseListener(new MouseAdapter() {
    			@Override
    			public void mouseClicked(MouseEvent e) {
    				displayContent(e.getSource()+"");
    				
    			}
    		});
    	}
		
		
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
		    	panel_1.setVisible(false);
		    	panel_2.setVisible(true);
		    	panel_3.setVisible(false);
		    	panel_4.setVisible(false);
		    	panel_5.setVisible(false);
		    	panel_6.setVisible(false);
		    	panel_7.setVisible(false);
		    	panel_8.setVisible(false);
		    	panel_9.setVisible(false);
		    	panel_10.setVisible(false);
		    }  	
		});
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
		    	panel_1.setVisible(false);
		    	panel_2.setVisible(false);
		    	panel_3.setVisible(true);
		    	panel_4.setVisible(false);
		    	panel_5.setVisible(false);
		    	panel_6.setVisible(false);
		    	panel_7.setVisible(false);
		    	panel_8.setVisible(false);
		    	panel_9.setVisible(false);
		    	panel_10.setVisible(false);
		    	panel_10.setVisible(false);
		    }
		});
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
		    	panel_1.setVisible(false);
		    	panel_2.setVisible(false);
		    	panel_3.setVisible(false);
		    	panel_4.setVisible(true);
		    	panel_5.setVisible(false);
		    	panel_6.setVisible(false);
		    	panel_7.setVisible(false);
		    	panel_8.setVisible(false);
		    	panel_9.setVisible(false);
		    	panel_10.setVisible(false);
		    }
		});
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
		    	panel_1.setVisible(false);
		    	panel_2.setVisible(false);
		    	panel_3.setVisible(false);
		    	panel_4.setVisible(false);
		    	panel_5.setVisible(true);
		    	panel_6.setVisible(false);
		    	panel_7.setVisible(false);
		    	panel_8.setVisible(false);
		    	panel_9.setVisible(false);
		    	panel_10.setVisible(false);
		    }
		});
		rdbtnNewRadioButton_4.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
		    	panel_1.setVisible(false);
		    	panel_2.setVisible(false);
		    	panel_3.setVisible(false);
		    	panel_4.setVisible(false);
		    	panel_5.setVisible(false);
		    	panel_6.setVisible(true);
		    	panel_7.setVisible(false);
		    	panel_8.setVisible(false);
		    	panel_9.setVisible(false);
		    	panel_10.setVisible(false);
		    }
		});
		rdbtnNewRadioButton_5.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
		    	panel_1.setVisible(false);
		    	panel_2.setVisible(false);
		    	panel_3.setVisible(false);
		    	panel_4.setVisible(false);
		    	panel_5.setVisible(false);
		    	panel_6.setVisible(false);
		    	panel_7.setVisible(true);
		    	panel_8.setVisible(false);
		    	panel_9.setVisible(false);
		    	panel_10.setVisible(false);
		    }
		});
		rdbtnNewRadioButton_6.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
		    	panel_1.setVisible(false);
		    	panel_2.setVisible(false);
		    	panel_3.setVisible(false);
		    	panel_4.setVisible(false);
		    	panel_5.setVisible(false);
		    	panel_6.setVisible(false);
		    	panel_7.setVisible(false);
		    	panel_8.setVisible(true);
		    	panel_9.setVisible(false);
		    	panel_10.setVisible(false);
		    }
		});
		rdbtnNewRadioButton_7.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
		    	panel_1.setVisible(false);
		    	panel_2.setVisible(false);
		    	panel_3.setVisible(false);
		    	panel_4.setVisible(false);
		    	panel_5.setVisible(false);
		    	panel_6.setVisible(false);
		    	panel_7.setVisible(false);
		    	panel_8.setVisible(false);
		    	panel_9.setVisible(true);
		    	panel_10.setVisible(false);
		    }
		});
		rdbtnNewRadioButton_8.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
		    	panel_1.setVisible(false);
		    	panel_2.setVisible(false);
		    	panel_3.setVisible(false);
		    	panel_4.setVisible(false);
		    	panel_5.setVisible(false);
		    	panel_6.setVisible(false);
		    	panel_7.setVisible(false);
		    	panel_8.setVisible(false);
		    	panel_9.setVisible(false);
		    	panel_10.setVisible(true);
		    }
		});
		
	}
	
	public JPanel createPanel(String name) {
		JPanel p = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public String toString() {
				return name;
			}
		};
		p.setPreferredSize(new Dimension(77,77));
		return p;
	}
	
	void displayContent(String id) {
		
		int h = Integer.parseInt(id) / 1000 - 1;
		int k=0;
		if(h==0) {
			while(k!=count[h]) {
				if(id.equals(s1[k][0])) {
					lblNewLabel_1.setText("Product ID: "+s1[k][0]);
					lblNewLabel_2.setText("Name: "+s1[k][1]);
					lblNewLabel_3.setText("Company: "+s1[k][2]);
					lblNewLabel_7.setText("Price: "+s1[k][3]);
					lblNewLabel_4.setText("Cores: "+s1[k][4]);
					lblNewLabel_5.setText("Speed: "+s1[k][5]);
					lblNewLabel_6.setText("Socket: "+s1[k][6]);
					cc = s1[k][0];
					k++;
				}
				else
					k++;
			}
		}
		else if(h==1) {
			while(k!=count[h]) {
				if(id.equals(s2[k][0])) {
					lblNewLabel_1.setText("Product ID: "+s2[k][0]);
					lblNewLabel_2.setText("Name: "+s2[k][1]);
					lblNewLabel_3.setText("Company: "+s2[k][2]);
					lblNewLabel_7.setText("Price: "+s2[k][3]);
					lblNewLabel_4.setText("Socket: "+s2[k][4]);
					lblNewLabel_5.setText("Form Factor: "+s2[k][5]);
					lblNewLabel_6.setText("");
					cc = s2[k][0];
					k++;
				}
				else
					k++;
			}
		}
		else if(h==2) {
			while(k!=count[h]) {
				if(id.equals(s3[k][0])) {
					lblNewLabel_1.setText("Product ID: "+s3[k][0]);
					lblNewLabel_2.setText("Name: "+s3[k][1]);
					lblNewLabel_3.setText("Company: "+s3[k][2]);
					lblNewLabel_7.setText("Price: "+s3[k][3]);
					lblNewLabel_4.setText("Capacity: "+s3[k][4]);
					lblNewLabel_5.setText("Speed: "+s3[k][5]);
					lblNewLabel_6.setText("Type: "+s3[k][6]);
					cc = s3[k][0];
					k++;
				}
				else
					k++;
			}
		}
		else if(h==3) {
			while(k!=count[h]) {
				if(id.equals(s4[k][0])) {
					lblNewLabel_1.setText("Product ID: "+s4[k][0]);
					lblNewLabel_2.setText("Name: "+s4[k][1]);
					lblNewLabel_3.setText("Company: "+s4[k][2]);
					lblNewLabel_7.setText("Price: "+s4[k][3]);
					lblNewLabel_4.setText("Speed: "+s4[k][4]);
					lblNewLabel_5.setText("Memory: "+s4[k][5]);
					lblNewLabel_6.setText("");
					cc = s4[k][0];
					k++;
				}
				else
					k++;
			}
		}
		else if(h==4) {
			while(k!=count[h]) {
				if(id.equals(s5[k][0])) {
					lblNewLabel_1.setText("Product ID: "+s5[k][0]);
					lblNewLabel_2.setText("Name: "+s5[k][1]);
					lblNewLabel_3.setText("Company: "+s5[k][2]);
					lblNewLabel_7.setText("Price: "+s5[k][3]);
					lblNewLabel_4.setText("");
					lblNewLabel_5.setText("");
					lblNewLabel_6.setText("");
					cc = s5[k][0];
					k++;
				}
				else
					k++;
			}
		}
		else if(h==5) {
			while(k!=count[h]) {
				if(id.equals(s6[k][0])) {
					lblNewLabel_1.setText("Product ID: "+s6[k][0]);
					lblNewLabel_2.setText("Name: "+s6[k][1]);
					lblNewLabel_3.setText("Company: "+s6[k][2]);
					lblNewLabel_7.setText("Price: "+s6[k][3]);
					lblNewLabel_4.setText("Size: "+s6[k][4]);
					lblNewLabel_5.setText("Resolution: "+s6[k][5]);
					lblNewLabel_6.setText("Panel: "+s6[k][6]);
					cc = s6[k][0];
					k++;
				}
				else
					k++;
			}
		}
		else if(h==6) {
			while(k!=count[h]) {
				if(id.equals(s7[k][0])) {
					lblNewLabel_1.setText("Product ID: "+s7[k][0]);
					lblNewLabel_2.setText("Name: "+s7[k][1]);
					lblNewLabel_3.setText("Company: "+s7[k][2]);
					lblNewLabel_7.setText("Price: "+s7[k][3]);
					lblNewLabel_4.setText("Capacity: "+s7[k][4]);
					lblNewLabel_5.setText("Speed: "+s7[k][5]);
					lblNewLabel_6.setText("Type: "+s7[k][6]);
					cc = s7[k][0];
					k++;
				}
				else
					k++;
			}
		}else if(h==7) {
			while(k!=count[h]) {
				if(id.equals(s8[k][0])) {
					lblNewLabel_1.setText("Product ID: "+s8[k][0]);
					lblNewLabel_2.setText("Name: "+s8[k][1]);
					lblNewLabel_3.setText("Company: "+s8[k][2]);
					lblNewLabel_7.setText("Price: "+s8[k][3]);
					lblNewLabel_4.setText("PCIe Slots: "+s8[k][4]);
					lblNewLabel_5.setText("Form Factor: "+s8[k][5]);
					lblNewLabel_6.setText("");
					cc = s8[k][0];
					k++;
				}
				else
					k++;
			}
		}
		else if(h==8) {
			while(k!=count[h]) {
				if(id.equals(s9[k][0])) {
					lblNewLabel_1.setText("Product ID: "+s9[k][0]);
					lblNewLabel_2.setText("Name: "+s9[k][1]);
					lblNewLabel_3.setText("Company: "+s9[k][2]);
					lblNewLabel_7.setText("Price: "+s9[k][3]);
					lblNewLabel_4.setText("Wattage: "+s9[k][4]);
					lblNewLabel_5.setText("");
					lblNewLabel_6.setText("");
					cc = s9[k][0];
					k++;
				}
				else
					k++;
			}
		}
		
	}
}
