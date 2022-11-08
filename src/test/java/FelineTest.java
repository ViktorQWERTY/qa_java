import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    Feline feline;


    @Before
    public void createFeline() {
        this.feline = new Feline();
    }

    @Test
    public void getFamilyTest() {
        assertEquals("Кошачьи", feline.getFamily());
    }


    @Test
    public void getKittensTest() {
        assertEquals(1, feline.getKittens());
    }

}




