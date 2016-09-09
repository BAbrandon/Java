public class KingFred extends TTTPlayer { //implements TicTacPlayer {
  
  
  public KingFred(int x){
    super(x);
  }
  
  public int makeMove(int[] board){
    int a = 1;
    int f= 1;  
    int x=0;
    while(board[x] != 0){
      
      if (myPiece == 1){
        int n = xCheckBlock(board);
        if (n > -1) {
          
          return n;
        }
        switch (f){
          
          case 1   : x = 0;     f++; break;
          case 2   : x = 8;     f++; break;
          case 3   : x = 6;     f++; break;
          default  : x = (int)(Math.random()*9);
        }
      }else if( myPiece == -1) {
        int n = xCheckBlock(board);
        if (n > -1) {
        
          return n;
        }
        if ( board[0] == 1){
        switch (a){
          case 1   : x = 4;     a++; break;
          case 2   : x = 2;     a++; break;
          case 3   : x = 8;     a++; break;
          default  : x = (int)(Math.random()*9);
        }
        }else
          switch (a){
          case 1   : x = 0;     a++; break;
          case 2   : x = 8;     a++; break;
          default  : x = (int)(Math.random()*9);
      }
    }
    }
    return x;
  }
  public int xCheckBlock(int[] board){
    int x = -1;
    if (board[0]==1 && board[1]==1 || board[5]==1 && board[8]==1 || board[4]==1 && board[6]==1 ||board[0]==-1 && board[1]==-1 || board[5]==-1 && board[8]==-1 || board[4]==-1 && board[6]==-1)
      x=2;
    if (board[1]==1 && board[2]==1 || board[4]==1 && board[8]==1 || board[3]==1 && board[6]==1||board[1]==-1&& board[2]==-1 || board[4]==-1 && board[8]==-1 || board[3]==0 && board[6]==-1 || board[1]==-1&& board[2]==-1 || board[4]==-1 && board[8]==-1 || board[3]==0 && board[6]==-1)
      x= 0;
    if (board[4]==1 && board[7]==1 || board[0]==1 && board[2]==1 || board[4]==-1&& board[7]==-1 || board[0]==-1 && board[2]==-1)
      x=1;
    if (board[4]==1 && board[5]==1 || board[0]==1 && board[6]==1|| board[4]==-1 && board[5]==-1 || board[0]==-1 && board[6]==-1)
      x = 3;
    if (board[1]==1 && board[7]==1 || board[2]==1 && board[6]==1 || board[5]==1 && board[3]==1|| board[0]==1 && board[8]==1 || board[1]==-1 && board[7]==-1 || board[2]==-1 && board[6]==-1 || board[5]==-1 && board[3]==-1|| board[0]==-1 && board[8]==-1)
      x= 4;
    if (board[3]==1 && board[4]==1 || board[2]==1 && board[8]==1 || board[3]==-1 && board[4]==-1 || board[2]==-1 && board[8]==-1)
      x = 5;
    if (board[0]==1 && board[3]==1 || board[2]==1 && board[4]==1|| board[7]==1 && board[8]==1 || board[0]==-1 && board[3]==-1 || board[2]==-1 && board[4]==-1|| board[7]==-1 && board[8]==-1)
      x= 6;
    if (board[1]==1 && board[4]==1 || board[6]==1 && board[8]==1 || board[1]==-1 && board[4]==-1 || board[6]==-1 && board[8]==-1)
      x= 7;
    if (board[6]==1 && board[7]==1 || board[0]==1 && board[4]==1|| board[5]==1 && board[2]==1 || board[6]==-1 && board[7]==-1 || board[0]==-1 && board[4]==-1|| board[5]==-1 && board[2]==-1)
      x=8;

    
    if (x == -1)
      return -1;
    else if (board[x] == 0)
      return x;
    else
      return -1;
  }  
  
  
  
}