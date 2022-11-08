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

    public void addScore(int score) {
        if (result() == FrameStatus.STRIKE) {
            throw new IllegalStateException("스트라이크 상태에서 점수를 추가 할 수 없습니다.");
        }
    }
}
