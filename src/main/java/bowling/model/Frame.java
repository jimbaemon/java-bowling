package bowling.model;

import java.util.ArrayList;
import java.util.List;

public class Frame {

    private List<Integer> scores;

    public Frame(final int score) {
        List<Integer> scores = new ArrayList<>();
        scores.add(score);
        this.scores = scores;
    }


    public FrameStatus result() {
        return FrameStatus.firstShot(scores.get(0));
    }
}
