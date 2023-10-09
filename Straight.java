package projectOne;

public class Straight {
	
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Random;
	import java.util.Scanner;

	class Dice {
	    private int value;

	    public void roll() {
	        Random random = new Random();
	        value = random.nextInt(6) + 1;
	    }

	    public int getValue() {
	        return value;
	    }
	}

	
	public class YahtzeeGame {
	    private List<Dice> dice;
	    private int rollsLeft;

	    public YahtzeeGame(String playerName) {
	        player = new Player(playerName);
	        dice = new ArrayList<>();
	        for (int i = 0; i < 5; i++) {
	            dice.add(new Dice());
	        }
	        rollsLeft = 3;
	    }

	    public void rollDice() {
	        for (Dice die : dice) {
	            die.roll();
	        }
	        rollsLeft--;
	    }

	    public void displayDiceValues() {
	        System.out.print("Dice values: ");
	        for (Dice die : dice) {
	            System.out.print(die.getValue() + " ");
	        }
	        System.out.println();
	    }

	    private int calculateOfAKind(int count) {
	        int[] frequency = new int[7];
	        for (Dice die : dice) {
	            frequency[die.getValue()]++;
	        }
	        for (int i = 6; i >= 1; i--) {
	            if (frequency[i] >= count) {
	                return i * count;
	            }
	        }
	        return 0;
	    }

	    private int calculateThreeOfAKind() {
	        return calculateOfAKind(3);
	    }

	    private int calculateFourOfAKind() {
	        return calculateOfAKind(4);
	    }

	    private int calculateFullHouse() {
	        int[] frequency = new int[7];
	        for (Dice die : dice) {
	            frequency[die.getValue()]++;
	        }
	        boolean hasTwo = false, hasThree = false;
	        for (int i = 1; i <= 6; i++) {
	            if (frequency[i] == 2) {
	                hasTwo = true;
	            } else if (frequency[i] == 3) {
	                hasThree = true;
	            }
	        }
	        if (hasTwo && hasThree) {
	            return 25;
	        }
	        return 0;
	    }

	    private int calculateSmallStraight() {
	        int[] frequency = new int[7];
	        for (Dice die : dice) {
	            frequency[die.getValue()]++;
	        }
	        int count = 0;
	        for (int i = 1; i <= 6; i++) {
	            if (frequency[i] > 0) {
	                count++;
	            } else {
	                count = 0;
	            }
	            if (count >= 4) {
	                return 30;
	            }
	        }
	        return 0;
	    }

	    private int calculateLargeStraight() {
	        int[] frequency = new int[7];
	        for (Dice die : dice) {
	            frequency[die.getValue()]++;
	        }
	        int count = 0;
	        for (int i = 1; i <= 6; i++) {
	            if (frequency[i] == 1) {
	                count++;
	            } else {
	                count = 0;
	            }
	            if (count >= 5) {
	                return 40;
	            }
	        }
	        return 0;
	    }

	    private int calculateYahtzee() {
	        int[] frequency = new int[7];
	        for (Dice die : dice) {
	            frequency[die.getValue()]++;
	        }
	        for (int i = 1; i <= 6; i++) {
	            if (frequency[i] == 5) {
	                return 50;
	            }
	        }
	        return 0;
	    }

	    private int calculateUpperCategory(int value) {
	        int sum = 0;
	        for (Dice die : dice) {
	            if (die.getValue() == value) {
	                sum += value;
	            }
	        }
	        return sum;
	    }

	    private int calculateUpperSectionScore() {
	        int upperScore = 0;
	        for (int i = 1; i <= 6; i++) {
	            int score = calculateUpperCategory(i);
	            upperScore += score;
	        }
	        return upperScore;
	    }

	    public void calculateScore() {
	        int upperScore = calculateUpperSectionScore();

	        // Calculate the lower section scores
	        int threeOfAKindScore = calculateThreeOfAKind();
	        int fourOfAKindScore = calculateFourOfAKind();
	        int fullHouseScore = calculateFullHouse();
	        int smallStraightScore = calculateSmallStraight();
	        int largeStraightScore = calculateLargeStraight();
	        int yahtzeeScore = calculateYahtzee();

	        // Chance - Sum of all dice values
	        int chanceScore = 0;
	        for (Dice die : dice) {
	            chanceScore += die.getValue();
	        }

	        // Add scores to the player
	        player.addScore(threeOfAKindScore);
	        player.addScore(fourOfAKindScore);
	        player.addScore(fullHouseScore);
	        player.addScore(smallStraightScore);
	        player.addScore(largeStraightScore);
	        player.addScore(yahtzeeScore);
	        player.addScore(chanceScore);

	        // Update the upper score
	        player.addScore(upperScore);
	    }

	    public void displayPlayerScore() {
	        List<Integer> scores = player.getScores();
	        System.out.println("Player: " + player.getName());
	        System.out.println("Scores: " + scores);
	        int totalScore = scores.stream().mapToInt(Integer::intValue).sum();
	        System.out.println("Total Score: " + totalScore);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter your name: ");
	        String playerName = scanner.nextLine();

	        YahtzeeGame game = new YahtzeeGame(playerName


}
