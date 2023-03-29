import java.util.Random;

public class LotteryItem implements Comparable<LotteryItem> {
    Toy toy;
    Integer weight;
    Integer priority;

    public LotteryItem(Toy toy, Integer weight){
        this.toy = toy;
        this.weight = weight;
        Random r = new Random();
        this.priority = r.nextInt(weight);
    }

    public Integer getPriority() {
        return this.priority;
    }

    public int compareTo(LotteryItem item) {
        if (this.getPriority() > item.getPriority()) {
            return -1;
        } else {
            return 1;
        } 
    }

    @Override
    public String toString() {
        return this.toy.toString() + " Вес: " + this.weight + "; Приоритет: " + this.priority + ";";
    }
}