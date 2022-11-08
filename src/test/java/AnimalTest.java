import com.example.Animal;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class AnimalTest {

    Animal animal;

    @Before
    public void createAnimal() {
        this.animal = new Animal();
    }

    @Test
    public void getFamilyTest() {
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(expected, animal.getFamily());
    }

    @Test
    public void getFoodHerbivoreTest() throws Exception {
        List<String> expected = List.of("Трава", "Различные растения");
        List<String> actual = animal.getFood("Травоядное");
        assertEquals(expected, actual);
    }

    @Test
    public void getFoodPredatorTest() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = animal.getFood("Хищник");
        assertEquals(expected, actual);
    }

    @Test
    public void getFoodTest()  {
        Exception e = assertThrows(Exception.class, () -> {
            animal.getFood("песок");
        });
        String expected = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        String actual = e.getMessage();
        assertEquals(expected, actual);
    }
}
