package bowling.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FrameStatusTest {

    @Test
    void 첫번째_공에_10핀을_쓰러뜨리면_STRIKE() {
        assertThat(FrameStatus.firstShot(10)).isEqualTo(FrameStatus.STRIKE);
    }
    
    @Test
    void 두번째_던진_공에_10핀을_쓰러뜨리면_SPARE_이다() {
        assertThat(FrameStatus.secondShot(5, 5)).isEqualTo(FrameStatus.SPARE);
    }

    //TODO : 두번째 공에도 10핀을 모두 못 쓰러뜨리면 MISS 이다.

    //TODO : 마지막 공에도 0핀을 쓰러뜨리면 GUTTER 이다.

}
