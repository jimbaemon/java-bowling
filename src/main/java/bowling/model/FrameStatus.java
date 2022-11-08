package bowling.model;

public enum FrameStatus {
    STRIKE,
    SPARE,
    MISS,
    GUTTER,
    NOT_AT_ALL;

    public static FrameStatus firstShot(final int firstBall) {
        if (firstBall == 10) {
            return STRIKE;
        }
        return NOT_AT_ALL;
    }

    public static FrameStatus secondShot(int firstShot, int secondShot) {
        //TODO: 첫번째 값이 10이면 오류 발생
        if (firstShot + secondShot == 10) {
            return SPARE;
        }
        return GUTTER;
    }
}
