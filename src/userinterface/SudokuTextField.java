/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import javafx.scene.control.TextField;

/**
 *
 * @author AARON
 */
public class SudokuTextField extends TextField{
    
    private final int x;
    private final int y;
    
    public SudokuTextField(int x,int y){
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
    public void replaceText(int i,int i1,String s){
        if(!s.matches("[0-9]")){
            super.replaceText(i, i1, s);
        }
    }
    
    @Override
    public void replaceSelection(String s){
        if(!s.matches("[0-9]")){
            super.replaceSelection(s);
        }
    }
    
}
