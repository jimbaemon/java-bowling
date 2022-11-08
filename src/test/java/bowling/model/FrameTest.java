package bowling.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FrameTest {

    @Test
    void 투구_결과_확인() {
        Frame frame = new Frame(10);
        assertThat(frame.result()).isEqualTo(FrameStatus.STRIKE);
    }
}
