import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    Cat cat;
    public List<String> meat = List.of("Животные", "Птицы", "Рыба");

    @Mock
    Feline feline;

    @Before
    public void createCat(){
        this.cat = new Cat(feline);
    }

    @Test
    public void getSoundTest(){
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodTest() throws Exception{
        Mockito.when(feline.eatMeat()).thenReturn(meat);
        List<String> testFood = cat.getFood();
        assertEquals(testFood, meat);
    }
}
