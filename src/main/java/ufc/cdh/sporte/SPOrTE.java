/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ufc.cdh.sporte;

import ufc.cdh.sporte.torneio.*;

/**
 *
 * @author clara
 */
public class SPOrTE {

    public static void main(String[] args) {
    	
    	Bracket bracket = new Bracket();
        TeamArray teamArray = new TeamArray(8);
    	
        createTeams(teamArray);
        Team[] teamList = teamArray.listTeams();
        
//        for(int i=0;i<8;i++) {
//        	System.out.println(teamList[i].getName());
//        }
        
        createMatches(teamArray,bracket);
        for(int i=1; i<8; i++) {
        	System.out.println(bracket.searchMatch(i).getTeamA());
        }
    }
    
	public static void createTeams(TeamArray teamArray) {
    	Team team1 = new Team("time1",1);
    	teamArray.insertTeam(team1);
    	
        Team team2 = new Team("time2",2);
        teamArray.insertTeam(team2);
        
        Team team3 = new Team("time3",3);
        teamArray.insertTeam(team3);
        
        Team team4 = new Team("time4",4);
        teamArray.insertTeam(team4);
        
        Team team5 = new Team("time5",5);
        teamArray.insertTeam(team5);
        
        Team team6 = new Team("time6",6);
        teamArray.insertTeam(team6);
        
        Team team7 = new Team("time7",7);
        teamArray.insertTeam(team7);
        
        Team team8 = new Team("time8",8);
        teamArray.insertTeam(team8);
    }
    
	public static void createMatches(TeamArray teamArray, Bracket bracket) {
		InitMatch match1 = new InitMatch(1, teamArray);
		match1.setTeamA();
		match1.setTeamB();
		bracket.insertMatch(match1);
		
		InitMatch match2 = new InitMatch(2, teamArray);
		match2.setTeamA();
		match2.setTeamB();
		bracket.insertMatch(match2);
		
		InitMatch match3 = new InitMatch(3, teamArray);
		match3.setTeamA();
		match3.setTeamB();
		bracket.insertMatch(match3);
		
		InitMatch match4 = new InitMatch(4, teamArray);
		match4.setTeamA();
		match4.setTeamB();
		bracket.insertMatch(match4);
		
		match3.setWinner(match3.getTeamB());
		match4.setWinner(match4.getTeamA());
		
		Match match5 = new Match(5, bracket);
		match5.setTeamA();
		match5.setTeamB();
		bracket.insertMatch(match5);
		
		Match match6 = new Match(6, bracket);
		match6.setTeamA();
		match6.setTeamB();
		bracket.insertMatch(match6);
		
		Match match7 = new Match(7, bracket);
		match7.setTeamA();
		match7.setTeamB();
		bracket.insertMatch(match7);
	}
}
