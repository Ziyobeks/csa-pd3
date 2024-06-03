public class Feeder {

private int currentFood;
private int numBirds;
private int numDays;

public Feeder(int c, int b, int d){
	currentFood = c;
	numBirds = b;
	numDays = d;
}

public void simulateOneDay(int numBirds){
	int birdFeed = numBirds * ((int) (Math.random() * 50) + 10);
	
	if(Math.random() <= .95){
		if(birdFeed > currentFood){
			currentFood = 0;
		}
		else{
		currentFood -= birdFeed;
		}
	}
	else{
		currentFood = 0;
	}
}
	
public int simualateManyDays(int numBirds, int numDays){
	int days = 0;

	for(int i = 0; i < numDays; i++){	
		if(currentFood != 0){
			simulateOneDay(numBirds);
			days++;
		}
	}
	
	return days;
}

	
}
