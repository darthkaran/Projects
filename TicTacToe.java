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

   while(!userWinCondition(board) || !computerWinCondition(board)){
     getInput(board);
     printBoard(board);
     System.out.println("");
     userWinCondition(board);
     computerInput(board);
     printBoard(board);
     System.out.println("");
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

 public static boolean userWinCondition(String board[][]){
   if( board[0][0].equals("X") && (board[0][1].equals("X")) && (board[0][2].equals("X") ) ){
     System.out.println("You win");
     return true;
   } else if((board[1][0].equals("X")) && (board[1][1].equals("X")) && (board[1][2].equals("X"))){
     System.out.println("You win");
     return true;
   } else if((board[2][0].equals("X")) && (board[2][1].equals("X")) && (board[2][2].equals("X"))){
     System.out.println("You win");
     return true;
   } else if(board[0][0].equals("X") && board[1][0].equals("X") && board[2][0].equals("X")){
     System.out.println("You win");
     return true;
   } else if(board[0][1].equals("X") && board[1][1].equals("X") && board[2][1].equals("X")){
     System.out.println("You win");
     return true;
   } else if(board[0][2].equals("X") && board[1][2].equals("X") && board[2][2].equals("X")){
     System.out.println("You win");
     return true;
   } else if(board[0][0].equals("X") && board[1][0].equals("X") && board[2][0].equals("X")){
     System.out.println("You win");
     return true;
   }else if(board[0][0].equals("X") && board[1][1].equals("X") && board[2][2].equals("X")){
     System.out.println("You win");
      return true;
   }else if(board[0][2].equals("X") && board[1][1].equals("X") && board[2][0].equals("X")){
     System.out.println("You win");
      return true;
   }else{
     return false;
   }
  }


  public static boolean computerWinCondition(String board[][]){
    if( board[0][0].equals("O") && (board[0][1].equals("O")) && (board[0][2].equals("O") ) ){
      System.out.println("Computer wins");
      return true;
    } else if((board[1][0].equals("O")) && (board[1][1].equals("O")) && (board[1][2].equals("O"))){
      System.out.println("Computer wins");
      return true;
    } else if((board[2][0].equals("O")) && (board[2][1].equals("O")) && (board[2][2].equals("O"))){
      System.out.println("Computer wins");
      return true;
    } else if(board[0][0].equals("O") && board[1][0].equals("O") && board[2][0].equals("O")){
      System.out.println("Computer wins");
      return true;
    } else if(board[0][1].equals("O") && board[1][1].equals("O") && board[2][1].equals("O")){
      System.out.println("Computer wins");
      return true;
    } else if(board[0][2].equals("O") && board[1][2].equals("O") && board[2][2].equals("O")){
      System.out.println("Computer wins");
      return true;
    } else if(board[0][0].equals("O") && board[1][0].equals("O") && board[2][0].equals("O")){
      System.out.println("Computer wins");
      return true;
    }else if(board[0][0].equals("O") && board[1][1].equals("O") && board[2][2].equals("O")){
      System.out.println("Computer wins");
      return true;
    }else if(board[0][2].equals("O") && board[1][1].equals("O") && board[2][0].equals("O")){
      System.out.println("Computer wins");
      return true;
    }else{
      return false;
    }
   }

 }
