package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void request1() {
        //요구사항 1
        String[] actual1 = "1,2".split(",");
        assertThat(actual1).contains("1", "2");

        String[] actual2 = "1".split(",");
        assertThat(actual2).containsExactly("1");
    }

    @Test
    void request2() {
        //요구사항 2
        String actual1 = "(1,2)".substring(1,4);
        assertThat(actual1).isEqualTo("1,2");
    }

    @Test
    @DisplayName("charAt 테스트")
    void request3() {
        //요구사항 3
        assertThatExceptionOfType(StringIndexOutOfBoundsException.class)
            .isThrownBy(() -> {
                char actual1 = "abc".charAt(5);
        }).withMessageMatching("Index: \\d+, Size: \\d+");
    }

}
