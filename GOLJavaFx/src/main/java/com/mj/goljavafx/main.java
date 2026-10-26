package com.mj.goljavafx;

public class main {

    public static void main(String[] args){
        Grid board = new Grid(5,5);
        board.setState(2,1,true);
        board.setState(2,2,true);
        board.setState(2,3,true);
        board.print();
        System.out.println();
        board.playTurn();
        board.print();
        System.out.println();
        board.playTurn();
        board.print();

    }
}
