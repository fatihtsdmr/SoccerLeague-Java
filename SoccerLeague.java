package ceng344_labwork6;
import java.util.Scanner;
public class SoccerLeague {
	Team team;
	Team[] teamlist;
	public static int countlist=0;
	int[] startDate;
	int[] endDate;
	int currentWeek;
	Team currentChampion;
	
	
	 SoccerLeague() {
		
		// team = new Team("Beþiktaþ", 50);
		 //teamlist[0] = team;
		 
		teamlist[0]= new Team("Besiktas", 50);
		teamlist[1] = new Team("Fenerbahçe", 25);
		teamlist[2] = new Team("Galatasaray", 35);
		teamlist[3] = new Team("Trabzonspor", 35);
		countlist++;
	}
	
 SoccerLeague(String t) {
	
	teamlist[countlist] = new Team(t, currentWeek);
	countlist++;
		
	}

public void addSeasonInfo(int[] start, int[] end, int cw) {
	
	
	
	
}

public void addTeam(Team t) {

	teamlist[countlist]=t;
			countlist++;
	
}


public void deleteTeam(Team t) {
	
	for(int i =0;i<teamlist.length; i++ ) {
		
		if(teamlist[i]==t ) {
			
			teamlist[i]=null;
			
		}
	
	
}
}

public void findChampion() {
	
	int max;
	String maxName;
	
	max=teamlist[0].currentMatchPoint;
	maxName=teamlist[0].teamName;
	
for(int i=1 ;i<teamlist.length; i++ ) {
		
		if(max>teamlist[i].currentMatchPoint ) {
			
			max=teamlist[i].currentMatchPoint;
			maxName=teamlist[i].teamName;
		}
		
}
	
	System.out.println("Champion Team is "+ maxName );
	
}


public void displayAllTeams() {
	
	System.out.println("SOCCER LEAGUE TEAMS:");
	
for(int i=0 ;i<teamlist.length; i++ ) {
		
	System.out.println(teamlist[i].teamName);
	
		
}
	
	
}

public void findPlayer(String plyr) {
	
for(int i =0;i<teamlist.length; i++ ) {
		
		if(plyr==teamlist[i].PlayerList[0]) {
			System.out.println(teamlist[i]+", " +teamlist[i].PlayerList[0]);
			
		}
			
			
			for(int j =0;j<teamlist[i].PlayerList.length; j++ ) {
				
				if(plyr==teamlist[i].PlayerList[j])
				{
					System.out.println(teamlist[i]+", " +teamlist[i].PlayerList[j]);
				}
				
			}
	
}

}

	public static void main(String[] args) {
		 System.out.println("HELLO");
		SoccerLeague sl = new SoccerLeague();
	
		// String PlayerName = input.nextLine();
		 
		 
		 int x=0;
		 
		 
		 
		 while(x!=11){
			 
			 System.out.println("1. Add information about the current season ");
			 System.out.println("2. Add a team");
			 System.out.println("3. Remove a team  ");
			 System.out.println("4. Add a player to the team ");
			 System.out.println("5. Remove a player from the team  ");
			 System.out.println("6. Display all registered teams ");
			 System.out.println("7. Display detailed information about a particular team ");
			 System.out.println("8. Find which team(s) a player is playing for  ");
			 System.out.println("9. Find current champion  ");
			 System.out.println("10. Find out if a player is playing for a specific team ");
			 System.out.println("11. EXIT");
			 
			 Scanner input = new Scanner(System.in);
			 
			  x = input.nextInt();
			 switch(x) {
			  case 1:
			    // code block
			    break;
			    
			    
			  case 2:
				  System.out.println("Enter Team name to add: ");
				  Scanner input2 = new Scanner(System.in);
				  String TeamName = input.nextLine();
				
				  
				  sl.team.teamName=TeamName;
				  sl.addTeam(sl.team);
			    break;
			    
			    
			  case 3:
				  System.out.println("Enter Team name to delete: ");
				  Scanner input3 = new Scanner(System.in);
				  String TeamName2 = input3.nextLine();
				 
				  
				  sl.team.teamName=TeamName2;
				  
				  sl.deleteTeam(sl.team);
				    break;
				    
				    
				  case 4:
					  System.out.println("Enter Player name to add: ");
					  Scanner input4 = new Scanner(System.in);
					  String PlayerName3 = input4.nextLine();
					 
					  sl.team.addPlayer(PlayerName3);
					  
				    break;
				    
				    
				  case 5: 
					  
					  System.out.println("Enter Player name to delete: ");
					  Scanner input5 = new Scanner(System.in);
					  String PlayerName4 = input5.nextLine();
					 
					  sl.team.deletePlayer(PlayerName4);
					    break;
					    
					    
					  case 6:
					  
						  sl.displayAllTeams();
						  
					    break;
					    
					  case 7:
						  System.out.println("Enter Team Name for detailed information: ");
						  Scanner input6 = new Scanner(System.in);
						  String TeamName5 = input6.nextLine();
						  
					    break;
					    
					  case 8:
							  
						  System.out.println("Enter Player Name for which team(s) is playing:");
						  Scanner input7 = new Scanner(System.in);
						  String PlayerName6 = input7.nextLine();
							  sl.findPlayer(PlayerName6);
						    break;
						    
					  case 9:
						  
						  sl.findChampion();
						  
					    break;
					    
					  	case 10:
						  
						  sl.findChampion();
						  
					    break;
					    
			  default:
			    // code block
			}
			 
		 }
		
		 
		 
		 

	}

}
