/**
 * TicTacToe --- tic tac toe game where user plays a computer
 * @author   Karan Damodar
 */

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

   while(!userWinCondition(board) || !computerWinCondition(board)){
     //Loops while no one has won
     getInput(board);
     printBoard(board);
     System.out.println("");
     userWinCondition(board);
     if(userWinCondition(board) == true){
       System.out.println("You win!");
       break;
     }
     computerInput(board);
     printBoard(board);
     System.out.println("");
     computerWinCondition(board);
     if(computerWinCondition(board) == true){
       System.out.println("Computer Wins!");
       break;
     }
   }

 }
 /**
  * Prints a board for the user to visualize the game
  * @param board - the board that needs to be printed
  *
  */
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
 /**
  * gets input from the user and makes sure to check nothing is placed
  * in the spot the user wants to place their 'x' in
  * @param board - the board that needs to be altered
  *
  */
 public static void getInput(String board[][]){
   Scanner scan = new Scanner(System.in);
   boolean openSpace = false;



   while(!openSpace){
     System.out.println("Where do you want to place your \"X\"");
     int n = scan.nextInt();

     if(n == 3 || n == 4 || n == 5){
       if((board[1][n-3].equals("X")) || (board[1][n-3].equals("O"))){
        openSpace =false;
        System.out.println("There is already something in that spot");
      }else{
        board[1][n-3] = "X";
        openSpace = true;
      }
     }else if(n == 6|| n == 7|| n == 8){
       if((board[2][n-6].equals("X")) || (board[2][n-6].equals("O"))){
        openSpace = false;
        System.out.println("There is already something in that spot");
      }else{
        board[2][n-6] = "X";
        openSpace = true;
      }
     } else if(n == 0|| n == 1|| n == 2){
       if((board[0][n].equals("X")) || (board[0][n].equals("O"))){
        openSpace = false;
        System.out.println("There is already something in that spot");
      }else{
        board[0][n] = "X";
        openSpace = true;
      }
     }
   }


 }

 /**
  * Input from the computer, right now the computer places its 'O' in a Random
  * spot but I will make it more challenging in the future
  * @param board - the board that needs to be altered
  *
  */
 public static void computerInput(String board[][]){
   boolean openSpace = false;



   while(!openSpace){
     Random rand = new Random();
     int n = rand.nextInt(8) + 0;
     if(n == 3 || n == 4 || n == 5){
       if((board[1][n-3].equals("X")) || (board[1][n-3].equals("O"))){
        openSpace =false;
      }else{
        board[1][n - 3] = "O";
        openSpace = true;
        System.out.println(n);
      }
     }else if(n == 6|| n == 7|| n == 8){
       if((board[2][n-6].equals("X")) || (board[2][n-6].equals("O"))){
        openSpace = false;
      }else{
        board[2][n-6] = "O";
        openSpace = true;

        System.out.println(n);
      }
     } else if(n == 0|| n == 1|| n == 2){
       if((board[0][n].equals("X")) || (board[0][n].equals("O"))){
        openSpace = false;
      }else{
        board[0][n] = "O";
        openSpace = true;
        System.out.println(n);
      }
     }
   }

 }
 /**
  * Checks if the user has won
  * @param board - the board that needs to be checked
  * @return boolean - True if user has won
  */
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

  /**
   * Checks if computer has won
   * @param board - the board that needs to be printed
   * @return boolean - returns true if computer wins
   */
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
