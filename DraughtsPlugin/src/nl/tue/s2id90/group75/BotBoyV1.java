package nl.tue.s2id90.group75;

import nl.tue.s2id90.draughts.DraughtsState;

/**
 * Implements AlphaBeta with given evaluations
 *
 * @author s149489
 */
public class BotBoyV1 extends AlphaBetaBase {
    
    @Override
    int evaluate(DraughtsState state) {
        return Evaluations.botV1(state);
    }
}
