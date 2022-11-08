package bowling.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FrameStatusTest {

    //TODO: 잘못된 값이 들어가면 에러처리 EX) 10이상 0이하

    //TODO: 매개변수 하나로 통합.


    @Test
    void 첫번째_공에_10핀을_쓰러뜨리면_STRIKE() {
        assertThat(FrameStatus.firstShot(10)).isEqualTo(FrameStatus.STRIKE);
    }

    @Test
    void 두번째_던진_공에_10핀을_쓰러뜨리면_SPARE_이다() {
        assertThat(FrameStatus.secondShot(5, 5)).isEqualTo(FrameStatus.SPARE);
    }

    @Test
    void 두번째_공에도_10핀을_모두_못_쓰러뜨리면_MISS() {
        assertThat(FrameStatus.secondShot(5, 3)).isEqualTo(FrameStatus.MISS);
    }

    @Test
    void 마지막_공에도_0핀을_쓰러뜨리면_GUTTER() {
        assertThat(FrameStatus.secondShot(0, 0)).isEqualTo(FrameStatus.GUTTER);
    }

}
