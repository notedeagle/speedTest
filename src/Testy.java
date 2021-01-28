import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Testy {

    Sortowanie s;
    int[] arr;
    int a;

    @Before
    public void setClass() {
        s = new Sortowanie();
    }

    @Test
    public void test1() {
        a = 10000;
    }

    @Test
    public void test2() {
        a = 50000;
    }

    @Test
    public void test3() {
        a = 100000;
    }

    @Test
    public void test4() {
        a = 200000;
    }

    @Test
    public void test5() {
        a = 500000;
    }

    @After
    public void after() {
        arr = new int[a];
        s.wypelnij(arr);
        s.quickSort(arr);
        s.bubbleSort(arr);
    }
}
