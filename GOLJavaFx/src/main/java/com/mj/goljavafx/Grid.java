package com.mj.goljavafx;

public class Grid {

    boolean[][] board;
    int rows;
    int collumns;

    public Grid(int rows, int collums){
        this.rows = rows;
        this.collumns = collums;
        board = new boolean[rows][collums];//all dead (false) by default
    }

    public void print(){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < collumns; j++){
                if(board[i][j] == false){
                    System.out.print(" . ");
                }
                else{
                    System.out.print(" # ");
                }
            }
            System.out.println();
        }
    }

    public boolean isAlive(int row, int col){
        return board[row][col];
    }

    public void setState(int row, int col, boolean state){
        board[row][col] = state;
    }

    public void clear(){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < collumns; j++) {
                board[i][j] = false;
            }
        }
    }

    public int countAliveNeighbours(int row, int col){

        int count = 0;
        for(int i = row - 1; i <= row + 1; i++) {
            for(int j = col - 1; j <= col + 1; j++) {
                if(i == row && j == col){}
                else if(isValidTarget(i,j)) {
                    if(board[i][j] == true) {
                        count++;
                    }

                }
            }
        }
        return count;
    }

    private boolean isValidTarget(int row, int col){
        if(row < 0 || col < 0 || row > rows-1 || col > collumns -1){
            return false;
        }
        return true;
    }

    public void playTurn() {
        Grid nextBoard = new Grid(rows, collumns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < collumns; j++) {
                int numberOfNeighbours = countAliveNeighbours(i,j);
                if (board[i][j] == false) {
                    if(numberOfNeighbours == 3){
                        nextBoard.setState(i,j,true);
                    }
                }
                else if(numberOfNeighbours > 3 || numberOfNeighbours < 2){
                    nextBoard.setState(i,j,false);
                }
                else{
                    nextBoard.setState(i,j, true);
                }
            }
        }
        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < collumns; y++) {
                 setState(x, y, nextBoard.board[x][y]);
            }
        }
    }
}
