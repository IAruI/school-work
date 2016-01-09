import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test2 extends JFrame {
int count = 1;
	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test2 frame = new Test2();
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
	public Test2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(count % 2 == 1){
					btnNewButton.setText("x");
					count = count +1;

				} else{
					btnNewButton.setText("o");
					count = count +1;


				}
				
				
			}
		});
		btnNewButton.setBounds(52, 46, 117, 29);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count % 2 == 1){
					btnNewButton_1.setText("x");
					count = count +1;

				} else{
					btnNewButton_1.setText("o");
					count = count +1;


				}
				
				
			}
		});
		btnNewButton_1.setBounds(210, 46, 117, 29);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count % 2 == 1){
					btnNewButton_2.setText("x");
					count = count +1;

				} else{
					btnNewButton_2.setText("o");
					count = count +1;


				}
				
				
			}
		});
		
		button = new JButton("Reset");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setText(" ");
				btnNewButton_1.setText(" ");
				btnNewButton_2.setText(" ");
				btnNewButton_3.setText(" ");
				btnNewButton_4.setText(" ");
				btnNewButton_5.setText(" ");
				btnNewButton_6.setText(" ");
				btnNewButton_7.setText(" ");
				btnNewButton_8.setText(" ");



			}
		});
		button.setBounds(210, 141, 117, 29);
		contentPane.add(button);
		btnNewButton_2.setBounds(367, 46, 117, 29);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("New button");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count % 2 == 1){
					btnNewButton_3.setText("x");
					count = count +1;

				} else{
					btnNewButton_3.setText("o");
					count = count +1;

				}
				
				
				
			}
		});
		btnNewButton_3.setBounds(52, 101, 117, 29);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("New button");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count % 2 == 1){
					btnNewButton_4.setText("x");
					count = count +1;

				} else{
					btnNewButton_4.setText("o");
					count = count +1;


				}
				
				
			}
		});
		btnNewButton_4.setBounds(210, 101, 117, 29);
		contentPane.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("New button");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count % 2 == 1){
					btnNewButton_5.setText("x");
					count = count +1;

				} else{
					btnNewButton_5.setText("o");
					count = count +1;


				}
				
				
			}
		});
		btnNewButton_5.setBounds(367, 101, 117, 29);
		contentPane.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("New button");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count % 2 == 1){
					btnNewButton_6.setText("x");
					count = count +1;

				} else{
					btnNewButton_6.setText("o");
					count = count +1;


				}
				
				
			}
		});
		btnNewButton_6.setBounds(52, 182, 117, 29);
		contentPane.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("New button");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count % 2 == 1){
					btnNewButton_7.setText("x");
					count = count +1;

				} else{
					btnNewButton_7.setText("o");
					count = count +1;

				}
				
				
			}
		});
		btnNewButton_7.setBounds(210, 182, 117, 29);
		contentPane.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("New button");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count % 2 == 1){
					btnNewButton_8.setText("x");
					count = count +1;

				} else{
					btnNewButton_8.setText("o");
					count = count +1;


				}
				
				
			}
		});
		btnNewButton_8.setBounds(367, 182, 117, 29);
		contentPane.add(btnNewButton_8);
	}

}
