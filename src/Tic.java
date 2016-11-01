import java.util.*;

import javax.annotation.PostConstruct;
public class Tic {
	 
	  public static   char posn[]={'A','B','C','D','E','F','G','H','I'};
	
	public boolean Check()
	{
		char winner =' ';
		
		if(posn[0] == posn[1] && posn[1] == posn[2]) { winner = posn[0]; return true;}
		else if(posn[3] == posn[4] && posn[4] == posn[5]) { winner = posn[3];return true;}
		else if(posn[6] == posn[7] && posn[7] == posn[8])  { winner = posn[6];return true;}
		
		else if(posn[0] == posn[3] && posn[3] == posn[6]) { winner = posn[0];return true;}
		else if(posn[1] == posn[4] && posn[4] == posn[7]) { winner = posn[1];return true;}
		else if(posn[2] == posn[5] && posn[5] == posn[8])  { winner = posn[2];return true;}
		
		else if(posn[0] == posn[4] && posn[4] == posn[8]) { winner = posn[8];return true;}
		else if(posn[2] == posn[4] && posn[4] == posn[6]) { winner = posn[4];return true;}
		
		return false;
		
	}
	
	
public void print()
{
	System.out.println("+---+---+---+");
	for(int row = 0; row < 9; row =row+3){
		for(int column =0; column<3; column++){
			System.out.print("|");
			char ch=posn[row+column];
			if(ch=='X' || ch=='O')
				System.out.print(" "+(ch)+" ");
			else
				System.out.print("   ");
		}
		
		System.out.print("|\n");
		System.out.println("+---+---+---+");
	}
	
/*System.out.println("|" +posn[0]+"|" +posn[1]+"|" +posn[2]+"|");
System.out.println("--" +"--"+"--");
System.out.println("|" +posn[3]+"|" +posn[4]+"|" +posn[5]+"|");
System.out.println("--" +"--"+"--");
System.out.println("|" +posn[6]+"|" +posn[7]+"|" +posn[8]+"|");
System.out.println("--" +"--"+"--");*/	
	}
	public static void main(String[] args) {
		
		
		
		Tic t = new Tic();
	
	
		int selectPlayer=0;
		
		Scanner sc = new Scanner(System.in);
		char matrix[]={'0','1','2','3','4','5','6','7','8','9'};
		t.print();	
	boolean flag = false;
		for(int i=1;i<=posn.length;i++)
		{
			
						
				
			boolean invalid = false;
			int spot = 0;
			do{
				
				System.out.println("player"+selectPlayer+" Enter position:");
				spot=sc.nextInt();				
				char availablevalue = posn[spot-1];
				if(availablevalue == 'X' || availablevalue == 'O'){
					System.out.println("already filled... ");
					invalid = true;
				}
				else
				{
					invalid = false;
				}
			}
			while(invalid);
			if(selectPlayer==0 )
			{
				posn[spot-1]='X';
			}
			else if(selectPlayer==1 )
			{
				posn[spot-1]='O';
			}
			t.print();		
			if(t.Check()){
				System.out.println("Player"+selectPlayer+" win");
				flag = true;
				break;
				
			}
			selectPlayer = selectPlayer+1;
			selectPlayer = selectPlayer%2;
		}
		if(!flag)
		System.out.println("Match Draw");
		
		System.out.println("Finished");
		
	}
		
		
	}
	

