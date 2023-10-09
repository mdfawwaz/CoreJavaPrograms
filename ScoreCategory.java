package projectOne;

import java.util.*; 

public class ScoreCategory {

    public List<Integer> currentRound = new ArrayList<>();

    public int upperCategory(int c, FiveDice D) {
        int sum = 0;
        currentRound =D.getDiceValues();

        for(int i = 0 ; i< 5 ; i++) {

            if( currentRound.get(i) == c) {
                sum+=currentRound.get(i);

            }

        }

        return sum;

    }

}}
