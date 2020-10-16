/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasudoku;

import java.util.Objects;

/**
 *
 * @author AARON
 */
public class Coordinates {
    
    private final int x;
    private final int y;
    
    public Coordinates(int x,int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return x == that.x && y == that.y;
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(x,y);
    }
    
}
