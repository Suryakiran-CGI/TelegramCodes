import java.util.*;

public class StrikeRate{
    Scanner scan=new Scanner(System.in);
    int ballsFaced, runs;
    double strikeRate;
    public void Calculate(){
        try{
            System.out.println("Enter Runs Scored: ");
            runs=scan.nextInt();
            System.out.println("Enter Balls Faced: ");
            ballsFaced=scan.nextInt();
        }
        catch(NumberFormatException e){
            System.err.println("Error Code: "+e);
            System.exit(0);
        }
    }

    public void displaySR(){  //display Strike Rate
        strikeRate=(100*runs)/ballsFaced;
        System.out.println(runs+" runs scored in "+ballsFaced+"\nStrike Rate: "+strikeRate);
    }

    public static void main(String[] args){
        StrikeRate obj=new StrikeRate();
        obj.Calculate();
        obj.displaySR();
    }
}

/**
 * 
 *TRY Anonymous if u want.....
 * 
 * public static void main(String[] args){
        StrikeRate obj= ()
        { 
            try{
                System.out.println("Enter Runs Scored: ");
                runs=scan.nextInt();
                System.out.println("Enter Balls Faced: ");
                ballsFaced=scan.nextInt();
            }
        
            catch(NumberFormatException e){
                System.err.println("Error Code: "+e);
                System.exit(0);
            }
        };
        obj.Calculate();
        obj.displaySR();
    }
 * 
 * 
 * 
**/


/*
 * CALCUATING AVERAGE
 * 
 * public double average() {
		double avg = 0;
		if (name.equals(name1)) {
			avg = (double) run / (double) iplayed;
			return avg;
		} else
			return 0;
	}
 * 
 * 
 * 
 * 
 * 
 * */
 