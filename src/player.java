import java.util.ArrayList;
import java.util.List;

public class player {
    private String name;
    private List<card>hand;

    public player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }
    public void drawCard(deck deck){
        card card = deck.dealcard();
        if(card != null){
            hand.add(card);
        }
    }
    public List<card>gethand(){
        return hand;
    }
    public String getname(){
        return name;
    }
    public void showhand(){
        System.out.println(name+"'s Hand:");
        for(card card : hand){
            System.out.println(" "+ card);
        }
    }
}
