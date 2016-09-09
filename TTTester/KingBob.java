public class KingBob extends TTTPlayer{
  
  public KingBob(int x){
  super(x);
  }
  public int makeMove(int[] board){
    
  int x = 0;
      int  f =1;
  while(board[x] != 0){

    
    switch (f){
      case 1   : x = 2;     f++; break;
      case 2   : x = 6;     f++; break;
      case 3   : x = 8;     f++; break;
      default  : x = (int)(Math.random()*9);
      
    }
  
  }
  return x;
  }
}