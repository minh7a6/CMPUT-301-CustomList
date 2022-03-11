import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
public class test {
    private CustomList list;
    @Before
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }
    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(), listSize+1);
    }
    @Test
    public void hasCityTest() {
        list.addCity(new City("Halifax", "NS"));
        boolean isThere = list.hasCity(new City("Halifax", "NS"));
        assertEquals(isThere, true);
    }
}
