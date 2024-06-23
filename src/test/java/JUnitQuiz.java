import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnitQuiz {

    @DisplayName("모든값이 들어있는지 확인")
    @Test
    public void junitTest(){
        String name1 = "홍길동";
        String name2 = "홍길동";
        String name3 = "홍길은";
//
//        Assertions.assertNotNull(name1);
//        Assertions.assertNotNull(name2);
//        Assertions.assertNotNull(name3);

        assertThat(name1).isNotNull();
        assertThat(name2).isNotNull();
        assertThat(name3).isNotNull();

        assertThat(name1).isEqualTo(name2);
        assertThat(name1).isNotEqualTo(name3);
    }

    @DisplayName("테스트 퀴즈2")
    @Test
    public void junitTest2(){
        int number1 = 15;
        int number2 = 0;
        int number3 = -5;

        assertThat(number1).isPositive();
        assertThat(number2).isZero();
        assertThat(number3).isNegative();
        assertThat(number1).isGreaterThan(number2);
        assertThat(number3).isLessThan(number2);
    }
}
