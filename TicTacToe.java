//Karan Damodar
//September 16/01/2018
//TicTacToe

/**************************
Design of the Board
Will use a 2D String array to store values
 1|2|3
 4|5|6
 7|8|9
***************************/


public class TicTacToe{

  public static void main(String[] args) {
   String[][] board = new String[3][5]; //UI for the user

   /*while(gameCondition == true){

   }*/

   buildBoard(board);
   printBoard(board);

   System.out.println("");

 }

 public static boolean gameCondition(){
 return true;
 }

 public static void printBoard(String board[][]){
   for(int i = 0; i < board.length; i++){
     for(int j = 0; j < board[i].length; j++){
       System.out.print(board[i][j]);
     }
     System.out.println("");
   }
}

 public static void buildBoard(String board[][]){
   board[0][0] = "-";
   board[0][1] = "|";
   board[0][2] = "-";
   board[0][3] = "|";
   board[0][4] = "-";

   board[1][0] = "-";
   board[1][1] = "|";
   board[1][2] = "-";
   board[1][3] = "|";
   board[1][4] = "-";

   board[2][0] = "-";
   board[2][1] = "|";
   board[2][2] = "-";
   board[2][3] = "|";
   board[2][4] = "-";
 }

/*public static void printSong(Song song) {
  int min = song.getDuration() / 60;
  int sec = song.getDuration() % 60;
  System.out.printf("%s (%s) - %d:%d\n",
  song.getTitle(), song.getArtist(), min, sec);
  }

  */
}
