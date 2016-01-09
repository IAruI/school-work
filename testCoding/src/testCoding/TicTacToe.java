package testCoding;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.border.EtchedBorder;
import java.awt.Panel;
import javax.swing.border.TitledBorder;
import java.awt.Cursor;

public class TicTacToe {

	static void SCOREARRAY = new int[9][4];
	private JFrame frame;
	private JTextField player1In;
	private JTextField player2In;
	int count;
	int SCORE[][];
	String Player1, Player2, xo;
	private JButton replayButt;
	private JButton topLeft;
	private JButton topMiddle;
	private JButton topRight;
	private JButton middleLeft;
	private JButton middleMiddle;
	private JButton middleRight;
	private JButton bottomLeft;
	private JButton bottomMiddle;
	private JButton bottomRight;
	private JButton playButt;
	private Canvas line4;
	private Canvas line1;
	private Canvas line2;
	private Canvas line3;
	private JLabel Win;
	private JLabel title;
	private JLabel player1Instruct;
	private JLabel player2Instruct;
	private JLabel playerTurn;
	private JButton exitButt;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
					
				}
			}
		});
	}

	 // Create the application.

	public TicTacToe() {
		initialize();
		
	}
	
	 // Initialize the contents of the frame.

	private void initialize() {
	
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(176, 196, 222));
		frame.setBounds(100, 100, 662, 677);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Win = new JLabel("Win Sign");
		Win.setVisible(false);
		
		replayButt = new JButton("Replay");
		replayButt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		replayButt.setVisible(false);
		replayButt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count=0;
				Player1 = player1In.getText();
				Player2 = player2In.getText();
				playButt.setVisible(true);
				exitButt.setVisible(false);
				player1In.setVisible(true);
				player2In.setVisible(true);
				player1Instruct.setVisible(true);
				player2Instruct.setVisible(true);
				topLeft.setVisible(false); topLeft.setText(""); topLeft.setEnabled(true);
				topMiddle.setVisible(false); topMiddle.setText(""); topMiddle.setEnabled(true);
				topRight.setVisible(false); topRight.setText(""); topRight.setEnabled(true);	
				middleLeft.setVisible(false); middleLeft.setText(""); middleLeft.setEnabled(true);
				middleMiddle.setVisible(false); middleMiddle.setText(""); middleMiddle.setEnabled(true);
				middleRight.setVisible(false); middleRight.setText(""); middleRight.setEnabled(true);
				bottomLeft.setVisible(false); bottomLeft.setText(""); bottomLeft.setEnabled(true);
				bottomMiddle.setVisible(false); bottomMiddle.setText(""); bottomMiddle.setEnabled(true);
				bottomRight.setVisible(false); bottomRight.setText(""); bottomRight.setEnabled(true);
				line1.setVisible(false);
				line2.setVisible(false);
				line3.setVisible(false);
				line4.setVisible(false);
				title.setVisible(true);
				playerTurn.setVisible(false);
				playerTurn.setText(Player1+"'s turn");
				replayButt.setVisible(false);
				Win.setVisible(false);
			}
		});
		
	
		replayButt.setHorizontalTextPosition(SwingConstants.CENTER);
		replayButt.setBorder(null);
		replayButt.setBackground(new Color(95, 158, 160));
		replayButt.setFont(new Font("Segoe UI Light", Font.PLAIN, 25));
		replayButt.setBounds(0, 0, 150, 65);
		frame.getContentPane().add(replayButt);
		Win.setOpaque(true);
		Win.setBackground(new Color(95, 158, 160));
		Win.setHorizontalAlignment(SwingConstants.CENTER);
		Win.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		Win.setBounds(150, 0, 346, 65);
		frame.getContentPane().add(Win);
		
		line1 = new Canvas();
		line1.setVisible(false);

		playerTurn = new JLabel("(PlayerName)'s turn");
		playerTurn.setForeground(new Color(105, 105, 105));
		playerTurn.setVisible(false);
		playerTurn.setHorizontalAlignment(SwingConstants.CENTER);
		playerTurn.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 30));
		playerTurn.setBounds(39, 28, 570, 41);
		frame.getContentPane().add(playerTurn);
		
		title = new JLabel("Tic-Tac-Toe");
		title.setForeground(new Color(105, 105, 105));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 60));
		title.setBounds(39, 33, 569, 60);
		frame.getContentPane().add(title);
		
		player2In = new JTextField();
		player2In.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		player2In.setBorder(null);
		player2In.setColumns(10);
		player2In.setBounds(184, 305, 274, 25);
		frame.getContentPane().add(player2In);
		
		player1In = new JTextField();
		player1In.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		player1In.setBorder(null);
		player1In.setBounds(184, 223, 274, 25);
		frame.getContentPane().add(player1In);
		player1In.setColumns(10);
		
		player2Instruct = new JLabel("Enter player two's name:");
		player2Instruct.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 17));
		player2Instruct.setHorizontalAlignment(SwingConstants.CENTER);
		player2Instruct.setBounds(0, 282, 653, 25);
		frame.getContentPane().add(player2Instruct);
		
		player1Instruct = new JLabel("Enter player one's name:");
		player1Instruct.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 17));
		player1Instruct.setHorizontalAlignment(SwingConstants.CENTER);
		player1Instruct.setBounds(0, 200, 653, 25);
		frame.getContentPane().add(player1Instruct);
		line1.setBackground(Color.BLACK);
		line1.setBounds(213, 86, 20, 525);
		frame.getContentPane().add(line1);
		
		line2 = new Canvas();
		line2.setVisible(false);
		line2.setBackground(Color.BLACK);
		line2.setBounds(411, 86, 20, 525);
		frame.getContentPane().add(line2);
		
		line3 = new Canvas();
		line3.setVisible(false);
		line3.setBackground(Color.BLACK);
		line3.setBounds(39, 245, 570, 20);
		frame.getContentPane().add(line3);
		
		line4 = new Canvas();
		line4.setVisible(false);
		line4.setBackground(Color.BLACK);
		line4.setBounds(39, 431, 570, 20);
		frame.getContentPane().add(line4);
		
		middleLeft = new JButton("");
		middleLeft.setOpaque(false);
		middleLeft.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		middleLeft.setVisible(false);
		middleLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modulus(); // Checks whether to change to X and O and changes winner name
				middleLeft.setText(xo);
				middleLeft.setEnabled(false);
				count++;
				drawTasks(); // Checks if all buttons have been pushed yet
				winCheck(); // checks if user win or not
			}
		});
		middleLeft.setBorder(null);
		middleLeft.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 99));
		middleLeft.setBackground(new Color(165, 42, 42));
		middleLeft.setBounds(39, 262, 175, 170);
		frame.getContentPane().add(middleLeft);
		
		middleRight = new JButton("");
		middleRight.setOpaque(false);
		middleRight.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		middleRight.setVisible(false);
		middleRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modulus(); // Checks whether to change to X and O and changes winner name
				middleRight.setText(xo);
				middleRight.setEnabled(false);
				count++;
				drawTasks(); // Checks if all buttons have been pushed yet
				winCheck(); // checks if user win or not
			}
		});
		middleRight.setBorder(null);
		middleRight.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 99));
		middleRight.setBackground(new Color(165, 42, 42));
		middleRight.setBounds(426, 262, 183, 170);
		frame.getContentPane().add(middleRight);
		
		middleMiddle = new JButton("");
		middleMiddle.setOpaque(false);
		middleMiddle.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		middleMiddle.setVisible(false);
		middleMiddle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modulus(); // Checks whether to change to X and O and changes winner name
				middleMiddle.setText(xo);
				middleMiddle.setEnabled(false);
				count++;
				drawTasks(); // Checks if all buttons have been pushed yet
				winCheck(); // checks if user win or not
			}
		});
		middleMiddle.setBorder(null);
		middleMiddle.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 99));
		middleMiddle.setBackground(new Color(165, 42, 42));
		middleMiddle.setBounds(224, 262, 192, 170);
		frame.getContentPane().add(middleMiddle);
		
		bottomLeft = new JButton("");
		bottomLeft.setOpaque(false);
		bottomLeft.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		bottomLeft.setVisible(false);
		bottomLeft.setBorder(null);
		bottomLeft.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 99));
		bottomLeft.setBackground(new Color(165, 42, 42));
		bottomLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modulus(); // Checks whether to change to X and O and changes winner name
				bottomLeft.setText(xo);
				bottomLeft.setEnabled(false);
				count++;
				drawTasks(); // Checks if all buttons have been pushed yet
				winCheck(); // checks if user win or not
			}
		});
		bottomLeft.setBounds(39, 443, 175, 168);
		frame.getContentPane().add(bottomLeft);
		
		bottomRight = new JButton("");
		bottomRight.setOpaque(false);
		bottomRight.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		bottomRight.setVisible(false);
		bottomRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modulus(); // Checks whether to change to X and O and changes winner name
				bottomRight.setText(xo);
				bottomRight.setEnabled(false);
				count++;
				drawTasks(); // Checks if all buttons have been pushed yet
				winCheck(); // checks if user win or not
			}
		});
		bottomRight.setBorder(null);
		bottomRight.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 99));
		bottomRight.setBackground(new Color(165, 42, 42));
		bottomRight.setBounds(426, 450, 183, 161);
		frame.getContentPane().add(bottomRight);
		
		topLeft = new JButton("");
		topLeft.setOpaque(false);
		topLeft.setForeground(new Color(0, 0, 0));
		topLeft.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		topLeft.setVisible(false);
		topLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modulus(); // Checks whether to change to X and O and changes winner name
				topLeft.setText(xo);
				topLeft.setEnabled(false);
				count++;
				drawTasks(); // Checks if all buttons have been pushed yet
				winCheck(); // checks if user win or not
			}
		});
		topLeft.setBorder(null);
		topLeft.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 99));
		topLeft.setBackground(new Color(165, 42, 42));
		topLeft.setBounds(39, 86, 183, 161);
		frame.getContentPane().add(topLeft);
		
		topMiddle = new JButton("");
		topMiddle.setOpaque(false);
		topMiddle.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		topMiddle.setVisible(false);
		topMiddle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modulus(); // Checks whether to change to X and O and changes winner name
				topMiddle.setText(xo);
				topMiddle.setEnabled(false);
				count++;
				drawTasks(); // Checks if all buttons have been pushed yet
				winCheck(); //checks if win
			}
		});
		topMiddle.setBorder(null);
		topMiddle.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 99));
		topMiddle.setBackground(new Color(165, 42, 42));
		topMiddle.setBounds(224, 86, 192, 161);
		frame.getContentPane().add(topMiddle);
		
		topRight = new JButton("");
		topRight.setOpaque(false);
		topRight.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		topRight.setVisible(false);
		topRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modulus(); // Checks whether to change to X and O and changes winner name
				topRight.setText(xo);
				topRight.setEnabled(false);
				count++;
				drawTasks(); // Checks if all buttons have been pushed yet
				winCheck(); // checks if user win or not
			}
		});
		topRight.setBorder(null);
		topRight.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 99));
		topRight.setBackground(new Color(165, 42, 42));
		topRight.setBounds(417, 86, 192, 161);
		frame.getContentPane().add(topRight);
	
		
		bottomMiddle = new JButton("");
		bottomMiddle.setOpaque(false);
		bottomMiddle.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		bottomMiddle.setVisible(false);
		bottomMiddle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modulus(); // Checks whether to change to X and O and changes winner name
				bottomMiddle.setText(xo);
				bottomMiddle.setEnabled(false);
				count++;
				drawTasks(); // Checks if all buttons have been pushed yet
				winCheck(); // checks if user win or not
			}
		});
		bottomMiddle.setBorder(null);
		bottomMiddle.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 99));
		bottomMiddle.setBackground(new Color(165, 42, 42));
		bottomMiddle.setBounds(230, 450, 186, 161);
		frame.getContentPane().add(bottomMiddle);
		
		playButt = new JButton("Play");
		playButt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		playButt.setVerticalTextPosition(SwingConstants.TOP);
		playButt.setVerticalAlignment(SwingConstants.TOP);
		playButt.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 60));
		playButt.setBackground(new Color(95, 158, 160));
		playButt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Player1 = player1In.getText();
				Player2 = player2In.getText();
				playButt.setVisible(false);
				player1In.setVisible(false);
				player2In.setVisible(false);
				player1Instruct.setVisible(false);
				player2Instruct.setVisible(false);
				topLeft.setVisible(true);
				topMiddle.setVisible(true);
				topRight.setVisible(true);
				middleLeft.setVisible(true);
				middleMiddle.setVisible(true);
				middleRight.setVisible(true);
				bottomLeft.setVisible(true);
				bottomMiddle.setVisible(true);
				bottomRight.setVisible(true);
				line1.setVisible(true);
				line2.setVisible(true);
				line3.setVisible(true);
				line4.setVisible(true);
				title.setVisible(false);
				topLeft.setOpaque(false);
				topMiddle.setOpaque(false);
				topRight.setOpaque(false);
				middleLeft.setOpaque(false);
				middleMiddle.setOpaque(false);
				middleRight.setOpaque(false);
				bottomLeft.setOpaque(false);
				bottomMiddle.setOpaque(false);
				bottomRight.setOpaque(false);
				playerTurn.setVisible(true);
				playerTurn.setText(Player1+"'s turn");
			}
		});
		playButt.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		playButt.setBounds(39, 443, 570, 100);
		frame.getContentPane().add(playButt);
		
		exitButt = new JButton("Exit");
		exitButt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		exitButt.setVisible(false);
		exitButt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitButt.setBackground(new Color(95, 158, 160));
		exitButt.setBorder(null);
		exitButt.setFont(new Font("Segoe UI Light", Font.PLAIN, 25));
		exitButt.setBounds(496, 0, 150, 65);
		frame.getContentPane().add(exitButt);
		
		JLabel lblMadeByPradnya = new JLabel("Pradnya Sadhu Putra");
		lblMadeByPradnya.setHorizontalAlignment(SwingConstants.CENTER);
		lblMadeByPradnya.setForeground(new Color(0, 0, 0));
		lblMadeByPradnya.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		lblMadeByPradnya.setBounds(502, 615, 148, 23);
		frame.getContentPane().add(lblMadeByPradnya);

	}
	
	public void winCheck(){
		if(middleLeft.getText().equals(middleMiddle.getText()) &&  middleMiddle.getText().equals(middleRight.getText()) && !middleLeft.getText().equals("") && !middleMiddle.getText().equals("") && !middleRight.getText().equals("")){
			winTasks();
			middleLeft.setOpaque(true); middleMiddle.setOpaque(true); middleRight.setOpaque(true);
		}
		if(topMiddle.getText().equals(middleMiddle.getText()) && middleMiddle.getText().equals(bottomMiddle.getText()) && !topMiddle.getText().equals("") && !middleMiddle.getText().equals("") && !bottomMiddle.getText().equals("")){
			winTasks();
			topMiddle.setOpaque(true); middleMiddle.setOpaque(true); bottomMiddle.setOpaque(true);
		}//error
		if(topLeft.getText().equals(middleMiddle.getText()) && middleMiddle.getText().equals(bottomRight.getText()) && !topLeft.getText().equals("") && !middleMiddle.getText().equals("") && !bottomRight.getText().equals("")){
			winTasks();
			topLeft.setOpaque(true); middleMiddle.setOpaque(true); bottomRight.setOpaque(true);
		}//error
		if(topRight.getText().equals(middleMiddle.getText()) && middleMiddle.getText().equals(bottomLeft.getText()) && !topRight.getText().equals("") && !middleMiddle.getText().equals("") && !bottomLeft.getText().equals("")){
			winTasks();
			topRight.setOpaque(true); middleMiddle.setOpaque(true); bottomLeft.setOpaque(true);
		}//error
		if(bottomLeft.getText().equals(bottomMiddle.getText()) && bottomMiddle.getText().equals(bottomRight.getText()) && !bottomLeft.getText().equals("") && !bottomMiddle.getText().equals("") && !bottomRight.getText().equals("")){
			winTasks();
			bottomLeft.setOpaque(true); bottomMiddle.setOpaque(true); bottomRight.setOpaque(true);
		}
		if(topLeft.getText().equals(topRight.getText()) && topRight.getText().equals(topMiddle.getText()) && !topLeft.getText().equals("") && !topRight.getText().equals("") && !topMiddle.getText().equals("")){
			winTasks();
			topLeft.setOpaque(true); topRight.setOpaque(true); topMiddle.setOpaque(true);
		}
		if(middleRight.getText().equals(topRight.getText()) && topRight.getText().equals(bottomRight.getText()) && !middleRight.getText().equals("") && !topRight.getText().equals("") && !bottomRight.getText().equals("")){
			winTasks();
			middleRight.setOpaque(true); topRight.setOpaque(true); bottomRight.setOpaque(true);
		}
		if(middleLeft.getText().equals(topLeft.getText()) && topLeft.getText().equals(bottomLeft.getText()) && !middleLeft.getText().equals("") && !topLeft.getText().equals("") && !bottomLeft.getText().equals("")){
			winTasks();
			middleLeft.setOpaque(true); topLeft.setOpaque(true); bottomLeft.setOpaque(true);
		}
	}
	
	public void modulus(){
		if((count % 2) == 1){
			xo = "X";
			playerTurn.setText(Player1+"'s turn");
			Win.setText(Player2+" Wins");
		}
		else{
			xo = "O";
			playerTurn.setText(Player2+"'s turn");
			Win.setText(Player1+" Wins");
		}
	}
	
	public void winTasks(){
		if((count % 2) == 1){
			Win.setText(Player1+" Wins");
		}
		else{
			Win.setText(Player2+" Wins");
		}
		playerTurn.setVisible(false);
		replayButt.setVisible(true);
		Win.setVisible(true);
		exitButt.setVisible(true);
		topLeft.setEnabled(false);
		topMiddle.setEnabled(false);
		topRight.setEnabled(false);
		middleLeft.setEnabled(false);
		middleMiddle.setEnabled(false);
		middleRight.setEnabled(false);
		bottomLeft.setEnabled(false);
		bottomMiddle.setEnabled(false);
		bottomRight.setEnabled(false);
	}
	
	public void drawTasks(){
		if(count==9){
		playerTurn.setVisible(false);
		replayButt.setVisible(true);
		Win.setText("Draw.");
		Win.setVisible(true);
		exitButt.setVisible(true);
		}
	}
}