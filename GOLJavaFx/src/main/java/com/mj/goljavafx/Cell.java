package com.mj.goljavafx;

public class Cell {

    private boolean state; //if state is true cell is "alive"
    private int cellId;

    static int nextCellId = 1;

    public Cell(boolean state){
        cellId = nextCellId;
        setState(state);
        nextCellId++;
    }

    public void setState(boolean state){
        this.state = state;
    }

    public boolean getState(){
        return state;
    }

    public int getId(){
        return cellId;
    }
}
