package vandan;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class shitfacecockmuncher extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtLastName;
	private JTextField txtAge;

	
String agee, namee, lastnamee;	
private JTextField Showname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					shitfacecockmuncher frame = new shitfacecockmuncher();
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
	public shitfacecockmuncher() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtName = new JTextField();
		txtName.setText("name");
		txtName.setBounds(28, 42, 130, 26);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		namee = txtName.getText();

		
		txtLastName = new JTextField();
		txtLastName.setText("Last Name");
		txtLastName.setBounds(28, 92, 130, 26);
		contentPane.add(txtLastName);
		txtLastName.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setText("Age");
		txtAge.setBounds(28, 142, 130, 26);
		contentPane.add(txtAge);
		txtAge.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Showname.setText(namee);
			}
		});
		btnSubmit.setBounds(230, 92, 117, 29);
		contentPane.add(btnSubmit);
		
		Showname = new JTextField();
		Showname.setBounds(230, 159, 130, 26);
		contentPane.add(Showname);
		Showname.setColumns(10);
	}

}
