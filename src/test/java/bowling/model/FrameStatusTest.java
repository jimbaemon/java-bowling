package bowling.model;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FrameStatusTest {

	@Test
	void 첫번째_공에_10핀을_쓰러뜨리면_STRIKE(){
		Assertions.assertThat(FrameStatus.valueOf(10)).isEqualTo(FrameStatus.STRIKE);
	}

	//TODO : 두번째 공에 10핀을 쓰러트리면 SPARE 이다.

	//TODO : 두번째 공에도 10핀을 모두 못 쓰러뜨리면 MISS 이다.

	//TODO : 마지막 공에도 0핀을 쓰러뜨리면 GUTTER 이다.

}
