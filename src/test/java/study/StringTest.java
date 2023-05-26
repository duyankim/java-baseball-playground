package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class StringTest {
    @Test
    void splitTwo() {
        String[] oneTwo = "1,2".split(",");
        assertThat(oneTwo).contains("1");
        assertThat(oneTwo).contains("2");
    }
    @Test
    void splitOne() {
        String[] oneTwo = "1".split(",");
        assertThat(oneTwo).containsExactly("1");
    }

    @Test
    void removeBrackets() {
        String noBracketString = "(1,2)".substring(1, 4);
        assertThat(noBracketString).isEqualTo("1,2");
    }

    @Test
    @DisplayName("특정 위치의 문자를 가져오는 학습 테스트")
    void findIndex() {
        assertThat("abc".charAt(1)).isEqualTo('b');
        assertThatExceptionOfType(StringIndexOutOfBoundsException.class)
                .isThrownBy(() ->
                    "abc".charAt(3)
                ).withMessageMatching("String index out of range: 3");
    }
}
