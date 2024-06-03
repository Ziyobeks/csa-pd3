public class Scoreboard {
String team1;
String team2;
boolean isT1Active;
int score1;
int score2;

public Scoreboard(String t1, String t2){
	team1 = t1;
	team2 = t2;
	isT1Active = true;
	score1 = 0;
	score2 = 0;
}

public void recordPlay(int point){
	if(point != 0){
		if(isT1Active == true){
			score1 += point;
		}
		else {
			score2 += point;
		}
	}
	else{
		isT1Active = !isT1Active;
	}
}

public String getScore(){
	if(isT1Active == true){
		return score1 + "-" + score2 + "-" + team1;
	}
	else {
		return score1 + "-" + score2 + "-" + team2;
	}
}
  
