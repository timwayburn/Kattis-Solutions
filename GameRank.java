/*
  Game Rank

  Written by: Tim Wayburn, Joel Vikström and Jacob Adlers
 */

public class GameRank{

  public static void main(String[] args){
    Kattio io = new Kattio(System.in, System.out);

    String sequence = io.getWord();

    int rank = 25;
    int currstars = 0;
    int streak = 0;

    for(int i = 0; i < sequence.length(); i++){

      if(rank == 0){
        io.println("Legend");
        io.close();
        return;
      }

      char currentresult = sequence.charAt(i);
      int starsrequired = starsrequired(rank);

      if(currentresult == 'W'){
        streak++;
        if (streak >= 3 && rank>=6) {
          currstars += 2;
        }
        else {
          currstars ++;
        }

        if (currstars > starsrequired) {
          rank--;
          currstars -= starsrequired;
        }
      }
      else {  // Lose
        streak = 0;

        if (rank == 20) {
          if (currstars>0) {
            currstars --;
          }
        }
        else if (rank < 20) {
          if (currstars == 0) {
            rank ++;
            currstars = starsrequired(rank)-1;
          }
          else {
            currstars--;
          }
        }
      }
    }

    if(rank == 0){
      io.println("Legend");
    }
    else {
      io.println(rank);
    }

    io.close();
  }


  public static int starsrequired(int rank){
    if(rank >= 21){ // 25-21
      return 2;
    }
    else if(rank >= 16){ //20-16
      return 3;
    }
    else if(rank >= 11){ // 15-11
      return 4;
    }
    else{ // 10-1
      return 5;
    }
  }
}
