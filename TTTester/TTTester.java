public class TTTester implements Runnable {
 
  protected TTTPlayer p1,p2;
  protected int[] board;
  protected int   waitCount;
  
  public TTTester() {
    p1 = new RandomPlayer(1);
    p2 = new KingFred(-1);
    board = new int[9];
    for (int i = 0; i < 9; i++)
      board[i] = 0;
    waitCount = 1000;
    new Thread(this).start();
  }
  
  public int[] cloneBoard(int[] board) {
    int[] newBoard = new int[9];
    for (int i = 0; i < 9; i++)
      newBoard[i] = board[i];
    return newBoard;
  }
    
  public void run() {
    int xMove,yMove;
    while (true) {
      try {
        xMove = p1.makeMove(board);
        if (board[xMove] == 0)
          board[xMove] = 1;
        displayBoard();
        Thread.sleep(waitCount);
        yMove = p2.makeMove(board);
        if (board[yMove] == 0)
          board[yMove] = -1;
        displayBoard();
        Thread.sleep(waitCount);
      } catch (Exception e) {
      }
    }
  }
  
  public void displayBoard() {
    for (int i = 0; i < 9; i++) {
      if (board[i] == 1)
        System.out.print("X");
      else if (board[i] == -1)
        System.out.print("O");
      else
        System.out.print(".");
      if ((i+1)%3 == 0)
        System.out.println();
    }
    System.out.println("==========");
  }
  
  public static void main(String[] args) {
    TTTester myTest = new TTTester();
  }
}