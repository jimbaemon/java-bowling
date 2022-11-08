package bowling.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FrameTest {

    @Test
    void 투구_결과_확인() {
        Frame frame = new Frame(10);
        assertThat(frame.result()).isEqualTo(FrameStatus.STRIKE);
    }

    //TODO: 투구 결과가 Strike 인데 두번째 점수 입력시 에러 발생

    //TODO: 세번째 점수 입력시 에러 발생
}
