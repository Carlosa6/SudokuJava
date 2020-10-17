/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computationlogic;

import javasudoku.SudokuGame;

/**
 *
 * @author AARON
 */
public class SudokuUtilities {
    
    public static void copySudokuArrayValues(int [][] oldArray,int[][] newArray){
        for (int xIndex = 0; xIndex < SudokuGame.GRID_BOUNDARY; xIndex++) {
            for (int yIndex = 0; yIndex < SudokuGame.GRID_BOUNDARY; yIndex++) {
                newArray[xIndex][yIndex] = oldArray[xIndex][yIndex];
            }
        }
    }
    
    public static int[][] copyToNewArray(int[][] oldArray){
        int[][] newArray = new int[SudokuGame.GRID_BOUNDARY][SudokuGame.GRID_BOUNDARY];
        for (int xIndex = 0; xIndex < SudokuGame.GRID_BOUNDARY; xIndex++) {
            for (int yIndex = 0; yIndex < SudokuGame.GRID_BOUNDARY; yIndex++) {
                newArray[xIndex][yIndex] = oldArray[xIndex][yIndex];
            }
        }
        return newArray;
    }
    
}
