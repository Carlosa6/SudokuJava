/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import javasudoku.SudokuGame;

/**
 *
 * @author AARON
 */
public interface IUserInterfaceContract {
    interface EventListener{
        void onSudokuInput(int x,int y,int input);
        void onDialogClick();
    }
    
    interface View{
        void setListener(IUserInterfaceContract.EventListener listener);
        void updateSquare(int x,int y,int input);
        void updateBoard(SudokuGame game);
        void showDialog(String message);
        void showError(String message);
    }
}
