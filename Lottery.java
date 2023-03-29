import java.util.PriorityQueue;

public class Lottery {
    PriorityQueue<LotteryItem> items = new PriorityQueue<LotteryItem>();
    
    public void add(Toy toy, Integer count) {
        for(int i = 0; i < count; i++) {
            this.items.add(new LotteryItem(toy, count));
        }
    }

    public LotteryItem get(){
        return this.items.poll();
    }
}