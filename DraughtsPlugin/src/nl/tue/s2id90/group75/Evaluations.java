/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.tue.s2id90.group75;

import nl.tue.s2id90.draughts.DraughtsState;

/**
 *
 * @author s149489
 */
public class Evaluations {
    
    /**
     * Global declarations
     */
    
    // Value given to each piece of own color
    private final static int pieceV = 100;
    // Factor by which a king has greater value than a standard piece
    private final static int kingF = 2;
    // Factor by which a piece value is modified if it is in the back row
    private final static double homeF = 0.5;
    
    public static int botV1(DraughtsState state) {
        int evaluation = backRowEval(state);
        return evaluation;
    }
    
    /**
     * Evaluation function that eveluates the amount of pieces on the home row.
     * The home row is the row closest to the the player's side, a.k.a. the 
     * most back row for that player.
     *
     * @param state Current to be evaluated state
     * @return a score based on the amount of pieces in back row
     */
    private static int backRowEval(DraughtsState state) {
        int value = 0;

        /**
         * White side player
         */
        for (int i = 1; i < 6; i++) {
            if (state.getPiece(i) == DraughtsState.BLACKPIECE) {
                value += -pieceV * homeF;
            }
        }

        /**
         * Black side player
         */
        for (int i = 46; i < 51; i++) {
            if (state.getPiece(i) == DraughtsState.WHITEPIECE) {
                value += pieceV * homeF;
            }
        }
        return value;
    }
}
