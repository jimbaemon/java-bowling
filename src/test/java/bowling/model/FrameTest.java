package bowling.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
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
        Assertions.assertThatThrownBy(() -> frame.addScore(0))
            .isInstanceOf(IllegalStateException.class)
            .hasMessage("스트라이크 상태에서 점수를 추가 할 수 없습니다.");
    }

    //TODO: 세번째 점수 입력시 에러 발생
}
