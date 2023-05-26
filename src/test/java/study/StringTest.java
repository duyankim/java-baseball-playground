package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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
}
