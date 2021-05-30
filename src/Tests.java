/*
* Luis Eduardo Núñez Altamirano A01633894
* Test Driven Development
* */

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Tests {
    /* UNIT TESTING FOR LIST SIZE*/

    @Test
    public void getSizeOfList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        assertEquals(4, list.size());
    }

    @Test
    public void getSizeOfEmptyList(){
        List<Integer> list = new ArrayList<>();

        assertEquals(0,list.size());
    }

    @Test
    public void getSizeWhenRemoving(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        assertEquals(5,list.size());

        list.remove(4);
        assertEquals(4,list.size());
    }

    /* UNIT TESTING FOR CLEAR SIZE*/

    @Test
    public void clearList(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        assertEquals(5,list.size());

        list.clear();

        assertEquals(0,list.size());
    }

    @Test
    public void clearEmptyList(){
        List<Integer> list = new ArrayList<>();

        list.clear();
        assertEquals(0,list.size());
    }

    @Test(expected = NullPointerException.class)
    public void clearListNull(){
        List<Integer> list=null;

        list.clear();
    }

    /* UNIT TESTING FOR ADDING ITEMS TO LIST */

    @Test
    public void addToList(){
        List<Float> list = new ArrayList<>();
        list.add(1f);
        list.add(2f);
        list.add(3f);
        list.add(4f);

        assertEquals(4,list.size());

        list.add(5f);

        assertEquals(5,list.size());
    }

    @Test
    public void addEmptyList(){
        List<Float> list = new ArrayList<>();

        assertEquals(0,list.size());

        list.add(1f);
        list.add(2f);

        assertEquals(2,list.size());
    }

    @Test(expected = NullPointerException.class)
    public void AddingItemsToNullList(){
        List<Float> list = null;

        list.add(1f);

    }
    /* UNIT FOR TESTING IF ITEM EXISTS*/

    @Test
    public void existsItem(){
        List <Character> list = new ArrayList<>();
        list.add('a');
        list.add('b');
        list.add('c');

        assertTrue(list.contains('b'));
    }

    @Test
    public void existItemEmptyList(){
        List <Character> list = new ArrayList<>();

        assertEquals(0,list.size());
        assertTrue(!list.contains('a'));
    }

    @Test(expected = NullPointerException.class)
    public void existItemNullList(){
        List <Character> list = null;
        list.contains('a');
    }

    /* UNIT TESTING FOR GETTING ELEMENTS BY INDEX*/

    @Test
    public void getByIndex(){
        List <String> list = new ArrayList<>();
        list.add("hola");
        list.add("tdd");
        list.add("test");

        assertEquals("tdd",list.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getByIndexElementNotExists(){
        List <String> list = new ArrayList<>();
        list.add("hola");
        assertEquals("tdd",list.get(1));
    }

    @Test
    public void getByIndexRemoving(){
        List <String> list = new ArrayList<>();
        list.add("hola");
        list.add("tdd");
        list.add("test");

        assertEquals("tdd",list.get(1));

        list.remove(1);
        assertNotEquals("tdd",list.get(1));
    }

    /* UNIT TESTING FOR SEARCHING INDEX OF AN OBJECT*/

    @Test
    public void getIndex(){
        List <Double> list = new ArrayList<>();
        list.add(1.0);
        list.add(2.0);
        list.add(3.0);
        list.add(4.0);

        assertEquals(0,list.indexOf(1.0));
    }

    @Test
    public void getIndexEmptyList(){
        List <Double> list = new ArrayList<>();

        assertEquals(-1,list.indexOf(1.0));
    }

    @Test(expected = AssertionError.class)
    public void getIndexNotExists(){
        List <Double> list = new ArrayList<>();
        list.add(1.0);
        list.add(2.0);
        list.add(3.0);
        list.add(4.0);

        assertEquals(4,list.indexOf(5.0));
    }

    /* UNIT TESTING FOR REMOVING BY INDEX*/

    @Test
    public void deleteByIndex(){
        List <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        assertEquals(1,(int)list.get(0));

        list.remove(0);
        assertEquals(2,(int)list.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void deleteByIndexEmptyList(){
        List <Integer> list = new ArrayList<>();

        assertEquals(0,list.size());
        list.remove(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void deleteByIndexNotExists(){
        List <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        assertEquals(1,(int)list.get(0));

        list.remove(5);
    }
}
