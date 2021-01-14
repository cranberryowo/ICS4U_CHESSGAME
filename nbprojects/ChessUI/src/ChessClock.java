/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adrian
 */
public class ChessClock {
    private float baseTime;
    private float incrementTime;
    private float blackTime;
    private float whiteTime;
    public final short WHITE = 0, BLACK = 1;
    private short player = WHITE;
       
    public ChessClock(float base, float increment) {
        baseTime = base;
        incrementTime = increment;
    }
    
    public void startClock() {
        whiteTime = baseTime;
        blackTime = baseTime;
    }
    
    public void flipClock() {
        switch (player) {
            case 0:
                whiteTime += incrementTime;
                break;
            case 1:
                blackTime += incrementTime;
                break;
        }
    }
    public void stopClock() {
        
    }
    public float getTime(int player) {
        switch (player) {
            case 0:
                return whiteTime;
            case 1:
                return blackTime;
            default:
                return -1;
        }
    }
    
}
