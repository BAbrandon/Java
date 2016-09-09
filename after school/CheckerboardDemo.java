import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class CheckerboardDemo extends Applet implements MouseListener {
  
  /****************************************************************************
   * Below are the fields for this lab.  Scrolling down past the fields will  *
   * allow you to reach the method you need to write.  You must use the       *
   * boardState field to receive credit for this lab; the other fields are    *
   * optional but may assist you.                                             *
   ****************************************************************************/
  
  final int RED_PIECE   =  1;
  final int BLACK_PIECE = -1;
  final int RED_KING    =  2;
  final int BLACK_KING  = -2;
  final int EMPTY       =  0;
  
  int[][] boardState;
  int     cellSize = 62;
  Rectangle startBtn, midBtn, endBtn, strangeBtn, royalBtn, clearBtn;
  
  /****************************************************************************
   * Welcome to your first cooperative program.  Your lab partner has already *
   * written part of the code for this lab, and only your method is left. The *
   * method you need to write has already been moved to the top in this lab;  *
   * in future labs, you may have to go looking for it down in the code.      *
   ****************************************************************************/
  
  public void drawCheckerboard(Graphics g) {
       int i,s,r,b;
    for (i=0;i<4;i++) {
      for (s = 0; s<4; s++) {
        g.setColor(Color.pink);
        g.fillRect (50+(i*100),50+(s*100),50,50);
                g.fillRect (100+(i*100),100+(s*100),50,50);
        g.setColor(Color.gray);
        g.fillRect (100+(s*100),50+(i*100),50,50);
        g.fillRect (50+(i*100),100+(s*100),50,50);
      }
    }
  // pieces//
    for (r=0; r < boardState.length; r++){
      for (s=0; s < boardState[0].length;s++){
        if (boardState[r][s] == RED_PIECE){
          g.setColor(Color.red);
          g.fillOval(52+(s*50),52+(r*50),45,45);
        }
        if (boardState[r][s] == BLACK_PIECE){
          g.setColor(Color.black);
          g.fillOval(52+(s*50),52 +(r*50),45,45);
        }
        if (boardState[r][s] == BLACK_KING){
          g.setColor(Color.black);
          g.fillOval(52+(s*50),52 +(r*50),45,45);
          g.setColor(Color.yellow);
          g.fillRect(52+(s*50),76 +(r*50),35,5);
          g.fillRect(72+(s*50),54 +(r*50),5,35);
        }
        if (boardState[r][s] == RED_KING){
          g.setColor(Color.red);
          g.fillOval(52+(s*50),52 +(r*50),45,45);
          g.setColor(Color.yellow);
          g.fillRect(52+(s*50),72 +(r*50),40,5);
          g.fillRect(72+(s*50),52 +(r*50),5,40);
        }
      }
    }
  }
  /****************************************************************************
   * Your lab partner's code is displayed below.  Changing any of the below   *
   * code risks breaking the program!  Mr. Burns will not fix any code that   *
   * you break below.                                                         *
   ****************************************************************************/
  
  public void init() {
    // Assume size is 700 x 500
    startBtn   = new Rectangle(525, 25,150,cellSize);
    midBtn     = new Rectangle(525,100,150,cellSize);
    endBtn     = new Rectangle(525,175,150,cellSize);
    strangeBtn = new Rectangle(525,250,150,cellSize);
    royalBtn   = new Rectangle(525,325,150,cellSize);
    clearBtn   = new Rectangle(525,400,150,cellSize);
    boardState = new int[8][8];
    addMouseListener(this);
  }
  
  public void paint(Graphics g) {
    drawCheckerboard(g);
    g.setColor(Color.black);
    g.drawRect(  3,  3,697,497);
    g.drawRect(  3,  3,497,497);
    g.drawRect(525, 37,150, cellSize);
    g.drawRect(525,112,150, cellSize);
    g.drawRect(525,187,150, cellSize);
    g.drawRect(525,262,150, cellSize);
    g.drawRect(525,337,150, cellSize);
    g.drawRect(525,412,150, cellSize);
    g.setFont(new Font("Monaco",Font.PLAIN,18));
    g.setColor(Color.blue);
    g.drawString("Normal Start", 535, 74);
    g.drawString("Midway Game ", 535,149);
    g.drawString("End Of Game ", 535,224);
    g.drawString("Strange Game", 535,299);
    g.drawString("Royalty Game", 535,374);
    g.drawString("Clear Board ", 535,449);
  }
  
  private void clearBoard() {
    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            boardState[i][j] = EMPTY;
        }
    }

  }
  
  public void mouseClicked(MouseEvent e) {
    int x = e.getX();
    int y = e.getY();
    if (startBtn.contains(x,y)) {
      boardState = new int[8][8];
      for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
          if ((i < 3) && ((i + j) % 2 != 0))
            boardState[i][j] = BLACK_PIECE;
          else if ((i > 4) && ((i + j) % 2 != 0))
            boardState[i][j] = RED_PIECE;
          else
            boardState[i][j] = EMPTY;
        }
      }
    } else if (midBtn.contains(x,y)) {
      clearBoard();
      boardState[0][1] = BLACK_PIECE;
      boardState[0][7] = BLACK_PIECE;
      boardState[2][3] = RED_PIECE;
      boardState[2][5] = RED_PIECE;
      boardState[3][4] = RED_PIECE;
      boardState[5][4] = BLACK_PIECE;
      boardState[5][2] = BLACK_PIECE;
      boardState[6][3] = BLACK_PIECE;
      boardState[7][6] = RED_PIECE;
      boardState[7][0] = RED_PIECE;
    } else if (endBtn.contains(x,y)) {
      clearBoard();
      boardState[2][5] = BLACK_KING;
      boardState[7][4] = BLACK_KING;
      boardState[1][6] = RED_KING;
      boardState[5][4] = RED_KING;
    } else if (strangeBtn.contains(x,y)) {
      clearBoard();
      boardState[4][4] = BLACK_KING;
      boardState[3][4] = RED_PIECE;
      boardState[5][4] = RED_PIECE;
      boardState[4][5] = RED_PIECE;
      boardState[4][3] = RED_PIECE;
      boardState[2][4] = RED_KING;
      boardState[4][2] = RED_KING;
      boardState[6][4] = RED_KING;
      boardState[4][6] = RED_KING;
    } else if (royalBtn.contains(x,y)) {
      for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
          if ((i < 3) && ((i + j) % 2 != 0))
            boardState[i][j] = BLACK_KING;
          else if ((i > 4) && ((i + j) % 2 != 0))
            boardState[i][j] = RED_KING;
          else
            boardState[i][j] = EMPTY;
        }
      }
    } else if (clearBtn.contains(x,y)) {
      clearBoard();
    }
    repaint();
  }
  
  /****************************************************************************
   * The methods below are unused, but required for MouseListener.            *
   ****************************************************************************/
  
  public void mouseExited(MouseEvent e)   {}
  public void mouseEntered(MouseEvent e)  {}
  public void mouseReleased(MouseEvent e) {}
  public void mousePressed(MouseEvent e)  {}

}
