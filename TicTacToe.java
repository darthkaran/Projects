//Karan Damodar
//September 16/01/2018
//TicTacToe

/**************************
Design of the Board
Will use a 2D String array to store values
|0|1|2|
|3|4|5|
|6|7|8|

board[0][0] = "0";
board[0][1] = "1";
board[0][2] = "2";

board[1][0] = "3";
board[1][1] = "4";
board[1][2] = "5";

board[2][0] = "6";
board[2][1] = "7";
board[2][2] = "8"

***************************/
import java.util.Random;
import java.util.Scanner;


public class TicTacToe{

  public static void main(String[] args) {
   String[][] board = new String[3][3]; //UI for the user

   buildBoard(board);
   printBoard(board);

   System.out.println("");

   while(!userWinCondition(board)){
     getInput(board);
     printBoard(board);
     userWinCondition(board);
     computerInput(board);
     printBoard(board);
     computerWinCondition(board);

   }

 }

 public static boolean gameCondition(){
 return true;
 }

 public static void printBoard(String board[][]){
   for(int i = 0; i < board.length; i++){
     System.out.print("|");
     for(int j = 0; j < board[i].length; j++){
       System.out.print(board[i][j] + "|");
     }
     System.out.println("");
   }
}

 public static void buildBoard(String board[][]){
   board[0][0] = "0";
   board[0][1] = "1";
   board[0][2] = "2";

   board[1][0] = "3";
   board[1][1] = "4";
   board[1][2] = "5";

   board[2][0] = "6";
   board[2][1] = "7";
   board[2][2] = "8";
 }

 public static void getInput(String board[][]){
   Scanner scan = new Scanner(System.in);


   System.out.println("Where do you want to place your \"X\"");
   int n = scan.nextInt();
   if(n == 3 || n == 4 || n == 5){
     board[1][n-3] = "X";
   }else if(n == 6|| n == 7|| n == 8){
     board[1][n-6] = "X";
   } else{
     board[0][n] = "X";
   }
 }

 public static void computerInput(String board[][]){
   Random rand = new Random();
   int n = rand.nextInt(8) + 0;

   if(n == 3 || n == 4 || n == 5){
     board[1][n - 3] = "O";
   }else if(n == 6|| n == 7|| n == 8){
     board[1][n - 6] = "O";
   } else{
     board[0][n] = "O";
   }
 }

 public static boolean userWinCondition(String board[][]){
   if( board[0][0].equals("X") && (board[0][1].equals("X")) && (board[0][2].equals("X") ) ){
     return true;
   } else if((board[1][0].equals("X")) && (board[1][1].equals("X")) && (board[1][2].equals("X"))){
     return true;
   } else if((board[2][0].equals("X")) && (board[2][1].equals("X")) && (board[2][2].equals("X"))){
     return true;
   } else if(board[0][0].equals("X") && board[1][0].equals("X") && board[2][0].equals("X")){
     return true;
   } else if(board[0][1].equals("X") && board[1][1].equals("X") && board[2][1].equals("X")){
     return true;
   } else if(board[0][2].equals("X") && board[1][2].equals("X") && board[2][2].equals("X")){
     return true;
   } else if(board[0][0].equals("X") && board[1][0].equals("X") && board[2][0].equals("X")){
     return true;
   }else if(board[0][0].equals("X") && board[1][1].equals("X") && board[2][2].equals("X")){
      return true;
   }else if(board[0][2].equals("X") && board[1][1].equals("X") && board[2][0].equals("X")){
      return true;
   }else{
     return false;
   }
  }


  public static boolean computerWinCondition(String board[][]){
    if( board[0][0].equals("O") && (board[0][1].equals("O")) && (board[0][2].equals("O") ) ){
      return true;
    } else if((board[1][0].equals("O")) && (board[1][1].equals("O")) && (board[1][2].equals("O"))){
      return true;
    } else if((board[2][0].equals("O")) && (board[2][1].equals("O")) && (board[2][2].equals("O"))){
      return true;
    } else if(board[0][0].equals("O") && board[1][0].equals("O") && board[2][0].equals("O")){
      return true;
    } else if(board[0][1].equals("O") && board[1][1].equals("O") && board[2][1].equals("O")){
      return true;
    } else if(board[0][2].equals("O") && board[1][2].equals("O") && board[2][2].equals("O")){
      return true;
    } else if(board[0][0].equals("O") && board[1][0].equals("O") && board[2][0].equals("O")){
      return true;
    }else if(board[0][0].equals("O") && board[1][1].equals("O") && board[2][2].equals("O")){
       return true;
    }else if(board[0][2].equals("O") && board[1][1].equals("O") && board[2][0].equals("O")){
       return true;
    }else{
      return false;
    }
   }

 }
