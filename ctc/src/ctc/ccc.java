package ctc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ccc extends JFrame {


	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ccc frame = new ccc();
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
	public ccc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	   boolean NEXTMOVE = false;
	     String WHEREISMYNEXTMOVE= "";
	     
	     static int[][] SCOREARRAY = new int[9][4];
	     
	      setTotals();
	      if(canComputerWin()){
	    	  WHEREISMYNEXTMOVE = whereCanComputerWin();
	    	  convertToBoard();
	      }
	      
	      if(canComputerLose()){
	    	  WHEREISMYNEXTMOVE = whereCanComputerLose();
	    	  convertToBoard();
	      }
	      System.out.println(selectBestMove());
	      }
	static boolean canComputerLose(){
	      for(int i=1; i<=8; i= i+1){
	            if(SCOREARRAY[i][0]==2){
	                  return true;
	            }           
	      }
	      return false;
	}
	static boolean canComputerWin(){
	      for(int i=1; i<=8; i= i+1){
	            if(SCOREARRAY[i][0]==-2){
	                  return true;
	            }           
	      }
	      return false;
	      
	}
	static String whereCanComputerLose(){  
	      String returnString="";
	      for(int i=1; i<=8; i= i+1){
	            if(SCOREARRAY[i][0]==2){
	                  for(int k=1;k<=3; k=k+1){
	                        if(SCOREARRAY[i][k]!= 1){
	                        returnString= String.valueOf(i)+ String.valueOf(k);
	                        return returnString;
	                        }
	                  }
	            }           
	      }
	      return returnString;
	}

	static String whereCanComputerWin(){
	      String returnString="";
	      for(int i=1; i<=8; i= i+1){
	            if(SCOREARRAY[i][0]==-2){
	                  for(int k=1;k<=3; k=k+1){
	                        if(SCOREARRAY[i][k]!= -1){
	                        returnString= String.valueOf(i)+ String.valueOf(k);
	                        return returnString;
	                        }
	                  }
	            }           
	      }
	      return returnString;
	      
	}
	static void setTotals(){
		int lineTotal = 0;
		for(int i=1; i<=8; i = i+1) {
			for( int k=1; k<=3; k=k+1) {
				lineTotal= lineTotal+SCOREARRAY[i][k];
			}
			SCOREARRAY[i][0]= lineTotal;
			lineTotal= 0;
			
			
	}
	}

	static void convertToBoard(){
		
	}



	static int convertToArray(int line, int column){
		int strength = 2;
		SCOREARRAY[line][column] = -1;
		SCOREARRAY[3+column][line] = -1;
		if(column + line == 4){
			SCOREARRAY[7][column]= -1;
			strength = strength +1;
		}
		if(line == column){
			SCOREARRAY[8][column]= -1;
			strength = strength +1;
		}
		return strength;
	}
	static void userMove(int line, int column){
		SCOREARRAY[line][column] = 1;
		SCOREARRAY[3+column][line] = 1;
		if(column + line == 4){
			SCOREARRAY[7][column]= 1;
		}
		if(line == column){
			SCOREARRAY[8][column]= 1;
		}
	}
	static String selectBestMove(){
		int[][] TEMPARRAY= new int[9][4];
		for(int i=1; i<=8; i++){
			for(int j=0; j<=3;j++){
				TEMPARRAY[i][j]=SCOREARRAY[i][j];
			}
		}
		String currentBestMovePosition = "";
		int strongestMove = 2;
		int currentMove = 0;
		for(int line=1; line<=3; line++){
			for(int column=1; column<=3; column++){
				if(SCOREARRAY[line][column] == 0){
					currentMove = convertToArray(line,column);
					if(currentMove > strongestMove){
						strongestMove = currentMove;
						currentBestMovePosition = String.valueOf(line)+String.valueOf(column);
					}
				}
				for(int i=1; i<=8; i++){
					for(int j=0; j<=3;j++){
						SCOREARRAY[i][j]=TEMPARRAY[i][j];
					}
				}
			}
		}
		return currentBestMovePosition;
	}
	}


	
	
	

}
