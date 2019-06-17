package test1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

public class ModifyItem extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField,tf[] = new JTextField[6];
//	private JTextField textField_1;
//	private JTextField textField_2;
//	private JTextField textField_3;
//	private JTextField textField_4;
//	private JTextField textField_5;
//	private JTextField textField_6;
	private JLabel lblModifyProductProperties;
	private JButton btnModify;
	String sUpdate;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifyItem frame = new ModifyItem();
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
	public ModifyItem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterProductId = new JLabel("Enter product ID to modify:");
		lblEnterProductId.setBounds(10, 11, 169, 14);
		contentPane.add(lblEnterProductId);
		
		textField = new JTextField();
		textField.setBounds(170, 8, 130, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File f1 = new File("hash.txt");
				String id = textField.getText();
				Scanner sc;
				String lines[] = new String[10];
				int c=0;
				String l[] = null;
				int f=0,n=0,pos=-1;
				try {
					sc = new Scanner(f1);
					while(sc.hasNextLine()) {
						lines[c++] = sc.nextLine();
					}
					int h = Integer.parseInt(id) % 10;
					l = lines[h].split("[|]");
					n = l.length;
					for(int i=0;i<n;i++) {
						if(l[i].equals(id)) {
							pos = i;
							f = 1;
							break;
						}
					}
					String t = "";
					for(int i=pos;i<n-1;i++)
						l[i] = l[i+1];
					for(int i=0;i<n-1;i++)
						t+=l[i]+"|";
					lines[h] = t;
					sc.close();
				} catch(Exception e1) { }
				if(f == 1){
					File f3 = new File("products.txt");
					String ll[] = new String[200];
					int count = 0;
					@SuppressWarnings("unused")
					int lno = -1;
					try {
						Scanner sc1 = new Scanner(f3);
						while(sc1.hasNextLine()) {
							ll[count] = sc1.nextLine();
							String tem[] = ll[count].split("[|]");
							if(id.equals(tem[0]))
								lno = count;
							count++;
						}
						sc1.close();
					} catch(Exception e1) { }
					String temp[] = ll[lno].split("[|]");
					int cFields = ll[lno].split("[|]").length;
					if(cFields == 7) {
						for(int k = 0;k<cFields-1;k++)
							tf[k].setText(temp[k+1]);
					}
					else if(cFields==6) {
						for(int k = 0;k<cFields-1;k++)
							tf[k].setText(temp[k+1]);
						tf[5].setText("----");
						tf[5].setEditable(false);
					}
					else if(cFields==5) {
						for(int k = 0;k<cFields-1;k++)
							tf[k].setText(temp[k+1]);
						tf[4].setText("----");
						tf[4].setEditable(false);
						tf[5].setText("----");
						tf[5].setEditable(false);
					}
					else if(cFields==4) {
						for(int k = 0;k<cFields-1;k++)
							tf[k].setText(temp[k+1]);
						tf[3].setText("----");
						tf[3].setEditable(false);
						tf[4].setText("----");
						tf[4].setEditable(false);
						tf[5].setText("----");
						tf[5].setEditable(false);
					}
					
					btnModify.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent ee) {
							File f4 = new File("temp.txt");
							String ts = id+"|";
							for(int j=0;j<6;j++) {
								if(!tf[j].getText().equals("----"))
									ts+=tf[j].getText()+"|";
							}
							try {
								FileWriter fw1 = new FileWriter(f4);
								BufferedWriter bw1 = new BufferedWriter(fw1);
								bw1.write(ts+"\n");
								bw1.close();
								fw1.close();
							}catch(Exception e11) { }
							btnSearch.setText("Confirm");
							btnSearch.setBounds(335, 227, 89, 23);
							JOptionPane.showMessageDialog(null, "Product details updated, check in file!");
						}
					});
					
					File ff = new File("products.txt");
					File fff = new File("temp.txt");
					try {
						Scanner sc2 = new Scanner(fff);
						sUpdate = sc2.nextLine();
						FileWriter fw = new FileWriter(ff);
						BufferedWriter bw = new BufferedWriter(fw);
						for(int k = 0;k<count;k++) {
							if(k==lno)
								bw.write(sUpdate+"\n");
							else
								bw.write(ll[k]+"\n");
						}
						bw.close();
						fw.close();
						sc2.close();
					} catch(Exception e10) { }
					
				}
				else
					JOptionPane.showMessageDialog(null, "The product ID you searched for is not present!");
				
			}
		});
		btnSearch.setBounds(318, 7, 89, 23);
		contentPane.add(btnSearch);
		
		tf[0] = new JTextField();
		tf[0].setBounds(69, 100, 86, 20);
		contentPane.add(tf[0]);
		tf[0].setColumns(10);
		
		tf[1] = new JTextField();
		tf[1].setBounds(183, 100, 86, 20);
		contentPane.add(tf[1]);
		tf[1].setColumns(10);
		
		tf[2] = new JTextField();
		tf[2].setBounds(69, 140, 86, 20);
		contentPane.add(		tf[2]);
		tf[2].setColumns(10);
		
		tf[3] = new JTextField();
		tf[3].setBounds(183, 140, 86, 20);
		contentPane.add(tf[3]);
		tf[3].setColumns(10);
		
		tf[4] = new JTextField();
		tf[4].setBounds(69, 180, 86, 20);
		contentPane.add(tf[4]);
		tf[4].setColumns(10);
		
		tf[5] = new JTextField();
		tf[5].setBounds(183, 180, 86, 20);
		contentPane.add(tf[5]);
		tf[5].setColumns(10);
		
		lblModifyProductProperties = new JLabel("Modify product properties:");
		lblModifyProductProperties.setBounds(10, 67, 169, 14);
		contentPane.add(lblModifyProductProperties);
		
		btnModify = new JButton("Modify");
		btnModify.setBounds(127, 227, 89, 23);
		contentPane.add(btnModify);
	}
	
	public JPanel createString(String name) {
		JPanel str = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public String toString() {
				return name;
			}
		};
		return str;
	} 

}
