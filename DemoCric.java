
import java.io.*;
import java.util.*;

class Cricket_Stats extends StrikeRate{
	
	private int playerCode;
	static int runs;
	private static int overs;
	static int count6,count4,count3,count2,count1;
	private String playerName;
	
	static {
		runs=0;
		overs=0;
		count6=0;
		count4=0;
		count3=0;
		count2=0;
		count1=0;
	}
	
	public Cricket_Stats() {
		this.playerCode = 7;
		this.playerName = "Dhoni";
		this.runs = 0;
		this.overs = 5;
	}
	
	public Cricket_Stats(int playerCode,String PlayerName,int runs,int overs) {
		this.playerCode = playerCode;
		this.playerName = playerName;
		this.runs = runs;
	}
	
	public int Score() {
		Random r = new Random();
		int currentRun = r.nextInt(7 - 1);
		
		switch(currentRun) {
		case 1:
			count1++;
			break;
		
		case 2:
			count2++;
			break;
		
		case 3:
			count3++;
			break;
			
		case 4:
			count4++;
			break;
		
		default :
			count6++;
			break;
	}
		
		this.runs += runs + currentRun + 1;
		return this.runs;
	}
	
	public int playedOvers(int overs) {
		this.overs += overs;
		return this.overs;
	}

	public int getPlayerCode() {
		return playerCode;
	}

	public void setPlayerCode(int playerCode) {
		this.playerCode = playerCode;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	public int getOvers() {
		return overs;
	}

	public void setOvers(int overs) {
		this.overs = overs;
	}
	
}

public class DemoCric{

	public static void main(String[] args) {
		
        Cricket_Stats cs = new Cricket_Stats();
        
        //Encapsulation 
        cs.setPlayerCode(7);
        cs.setPlayerName("Dhoni");
        cs.setOvers(5);
        cs.setRuns(30);
        
        //for score analysis
        System.err.println("Score : "+cs.Score());
        
        //Counting Random generated strikes
        System.out.println("1's : "+cs.count1+"\n"+"2's : "+cs.count2+"\n"+"3's : "+cs.count3+"\n"+"4's : "+cs.count4+"\n"+"6's : "+cs.count6);
        
        //Getting Strike Rate as per above Score and balls faced
        cs.ballsFaced = 30;
        cs.runs = cs.Score();
        
        cs.Calculate();
        cs.displaySR();
        
	}

}



/*
 * Score : 61
   1's : 0
   2's : 0
   3's : 0
   4's : 0
   6's : 1
   Enter Runs Scored: 34
   Enter Balls Faced: 30
   
   34 runs scored in 30
   Strike Rate: 113.0
 * 
 * */
