import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class LionTest {
    private final String sex;
    private final String expected;
    private final Feline feline = new Feline();

    public LionTest(String sex, String expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] Data() {
        return new Object[][] {
                {"Самец", "true"},
                {"Самка", "false"},
                {"qwerty", "Используйте допустимые значения пола животного - самец или самка"}
        };
    }

    @Test
    public void testLionConstructor() {
        try {
            Lion lion = new Lion(sex, feline);
            boolean actual = lion.doesHaveMane();
            Assert.assertEquals(Boolean.parseBoolean(expected), actual);
        } catch (Exception exception){
            String actual = exception.getMessage();
            Assert.assertEquals(expected, actual);
        }
    }
}