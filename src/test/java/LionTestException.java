import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


public class LionTestException {
    @Mock
    Feline feline;

    @Test
    public void getFoodTest() {
        Exception e = assertThrows(Exception.class, () -> {
            Lion lion = new Lion("qweqwe", feline);
        });
        String expected = "Используйте допустимые значения пола животного - самец или самка";
        String actual = e.getMessage();
        assertEquals(expected, actual);
    }
}
