import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class Things extends JFrame {
int count = 0;
int store =0;
int max =0;
	private JPanel contentPane;
	private JButton btnCount;
	private JTextField textField;
	private JButton btnStore;
	private JTextField textField_1;
	private JButton btnReset;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Things frame = new Things();
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
	public Things() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnCount = new JButton("Count");
		btnCount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = count+ 1;
				btnCount.setText("" +count);
				if(count > max){
					max = count;
					textField.setText("" + max);
				}
			}
		});
		btnCount.setBounds(26, 30, 117, 29);
		contentPane.add(btnCount);
		
		textField = new JTextField(max);
		textField.setBackground(Color.ORANGE);
		textField.setBounds(23, 98, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextField txtMax = new JTextField();
		txtMax.setBackground(Color.ORANGE);
		txtMax.setText("Max");
		txtMax.setBounds(26, 71, 130, 26);
		contentPane.add(txtMax);
		txtMax.setColumns(10);
		
		btnStore = new JButton("Store");
		btnStore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText("" + count);
				
			}
		});
		btnStore.setBounds(205, 30, 117, 29);
		contentPane.add(btnStore);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.ORANGE);
		textField_1.setBounds(215, 71, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 0;
				btnCount.setText("0");
			}
		});
		btnReset.setBounds(26, 155, 117, 29);
		contentPane.add(btnReset);
	}
}
