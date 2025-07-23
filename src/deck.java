import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class deck {
    private List<card> cards;
    public deck(){

        this.cards = new ArrayList<>();
        String[] suits= {"Hearts", "Diamond","Spade", "Club"};
        String[] ranks = {  "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"};
        int[] value = {2,3,4,5,6,7,8,9,10,11,12,13,14};
        for(String suit : suits){
            for(int i = 0; i<ranks.length;i++){
                cards.add(new card(suit,ranks[i],value[i]));
            }
        }
        shuffle();
    }
    public void shuffle(){
        Collections.shuffle(cards);
    }
    public card dealcard(){
        if(!cards.isEmpty()){
            return cards.remove(0);
        }
        return null;
    }
    public boolean isEmpty(){
        return cards.isEmpty();
    }


    }

