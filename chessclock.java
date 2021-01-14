/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adrian
 */
public class chessclock {
    private float baseTime;
    private float incrementTime;
    private float blackTime;
    private float whiteTime;
    public final int WHITE = 0, BLACK = 1;
    
    public void flipClock() {
        
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
