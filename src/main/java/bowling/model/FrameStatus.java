package bowling.model;

public enum FrameStatus {
	STRIKE,
	SPARE,
	MISS,
	GUTTER,
	NOT_AT_ALL;

	public static FrameStatus valueOf(final int firstBall){
		if(firstBall == 10){
			return STRIKE;
		}
		return NOT_AT_ALL;
	}
}
