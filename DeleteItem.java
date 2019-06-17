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

public class DeleteItem extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteItem frame = new DeleteItem();
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
	public DeleteItem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 260, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterProductId = new JLabel("Enter Product ID to delete:");
		lblEnterProductId.setBounds(10, 60, 166, 14);
		contentPane.add(lblEnterProductId);
		
		textField = new JTextField();
		textField.setBounds(10, 85, 210, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
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
				if(f==1) {
					File f2 = new File("hash.txt"); //Change to hash.txt file later
					try {
						FileWriter fw = new FileWriter(f2);
						BufferedWriter br = new BufferedWriter(fw);
						for(int i=0;i<10;i++)
							br.write(lines[i]+"\n");
						br.close();
						fw.close();
					} catch(Exception e1) { }
					
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
					
					File f4 = new File("products.txt"); //Change to products.txt once done
					try {
						FileWriter fw = new FileWriter(f4);
						BufferedWriter bw = new BufferedWriter(fw);
						for(int i=lno;i<count-1;i++)
							ll[i] = ll[i+1];
						for(int i=0;i<count-1;i++)
							bw.write(ll[i]+"\n");
						bw.close();
						fw.close();
					} catch(Exception e1) { }
				}
				if(f == 1)
					JOptionPane.showMessageDialog(null, "Deleted successfully!");
				else
					JOptionPane.showMessageDialog(null, "Product ID not found!");
			}
		});
		btnDelete.setBounds(76, 139, 89, 23);
		contentPane.add(btnDelete);
	}
}
