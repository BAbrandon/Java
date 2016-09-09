public class RandomPlayer extends TTTPlayer {
  
  public RandomPlayer(int myPiece) {
    super(myPiece);
  }
  
  public int makeMove(int[] board) {
    int x = (int)(Math.random()*9);
    while (board[x] != 0)
      x = (int)(Math.random()*9);
    return x;
  }
  
}