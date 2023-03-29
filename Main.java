import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {
  public static void main(String[] args) throws IOException {
      System.out.println("Розыгрыш проведен... Смотрите файл 'results.txt'");
      Lottery raffle = new Lottery();
      raffle.add(new Toy(1, "Акула"), 2);
      raffle.add(new Toy(2, "Динозавр"), 2);
      raffle.add(new Toy(3, "Машинка"), 6);

      saveResults(raffle);
  }

  public static void saveResults (Lottery raffle) throws IOException{
    BufferedWriter outputWriter = null;
    outputWriter = new BufferedWriter(new FileWriter("results.txt"));
    LotteryItem result = raffle.get();
    while(result != null){
      outputWriter.write(result.toString());
      outputWriter.newLine();
      result = raffle.get();
    }
    outputWriter.flush();  
    outputWriter.close();  
  }
}