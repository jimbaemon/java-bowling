package bowling.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class FrameTest {

    @Test
    void 투구_결과_확인() {
        Frame frame = new Frame(10);
        assertThat(frame.result()).isEqualTo(FrameStatus.STRIKE);
    }

    @Test
    void STRIKE_에서_두번쨰_점수_입력시_에러_발생() {
        Frame frame = new Frame(10);
        assertThatThrownBy(() -> frame.addScore(0))
            .isInstanceOf(IllegalStateException.class)
            .hasMessage("스트라이크 상태에서 점수를 추가 할 수 없습니다.");
    }

    @Test
    void 세번째_점수_입력시_에러_발생() {
        Frame frame = new Frame(8);
        frame.addScore(2);
        assertThatThrownBy(() -> frame.addScore(2))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("점수 입력은 최대 2회만 가능합니다.");
    }
}
