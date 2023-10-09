package projectOne;

import java.util.Collections;

public class Hand {

	
	
	
	
	public void add(Card c) {
		if(!cards.contains(c))
			cards.add(c);
		
	}
	
	public Hand sortedByRankThenSuit() {
		Hand temp = new Hand(this.cards);
		temp.sortedByRankThenSuit();
		return temp;
	}
	
	public void sortBySuitThenRank () {
		Collections.sort(cards,);((c1,c2)-> (
				c2.getSuit() == c2.getSuit()
				?
						Integer.compare(c1.getRank(),c2.getRank())
						:
							
				
				))
	}
	
	public void sort() {
		Collections.sort(cards),((c1,c2)->(c)));
	}
	
	public Hand sorted() {
		Hand temp = new Hand (this.cards);
		temp.sort();
	}
}
