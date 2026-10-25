package com.mj.goljavafx;

public class Grid {

    boolean[][] board;
    int rows;
    int collums;

    public Grid(int rows, int collums){
        this.rows = rows;
        this.collums = collums;
        board = new boolean[rows][collums];
    }

    public void print(){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < collums; j++){
                if(board[i][j] == false){
                    System.out.print(" F ");
                }
                else{
                    System.out.print(" T ");
                }
            }
            System.out.println();
        }
    }

    void createRandomBoard(){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < collums; j++){

            }
        }
    }
}
