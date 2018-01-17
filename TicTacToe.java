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

 public static int getInput(){
   Scanner scan = new Scanner(System.in);


   System.out.println("Where do you want to place your \"X\"");
   int i = scan.nextInt();
   return i;
 }

 public static void computerInput(String board[][]){
   Random rand = new Random();
   int n = rand.nextInt(8) + 0;

   if(n == 3 || n == 4 || n == 5){
     board[1][n] = "O";
   }else if(n == 6|| n == 7|| n == 8){
     board[1][n] = "O";
   } else{
     board[0][n] = "O";
   }
 }


}
