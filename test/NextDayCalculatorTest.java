import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NextDayCalculatorTest {
    @Test
    @DisplayName("1 1 2018  --> 2 1 2018")
    public void testNextDay1() {
        int[] day = new int[] {1,1,2018};
        int[] expected = new int[] {2,1,2018};
        int[] actual = NextDayCalculator.nextDay(day);
        assertArrayEquals(expected, actual);
    }
    @Test
    @DisplayName("31 1 2018  --> 1 2 2018")
    public void testNextDay2() {
        int[] day = new int[] {31,1,2018};
        int[] expected = new int[] {1,2,2018};
        int[] actual = NextDayCalculator.nextDay(day);
        assertArrayEquals(expected, actual);
    }
    @Test
    @DisplayName("30 4 2018  --> 1 5 2018")
    public void testNextDay3() {
        int[] day = new int[] {30,4,2018};
        int[] expected = new int[] {1,5,2018};
        int[] actual = NextDayCalculator.nextDay(day);
        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("28 2 2018  --> 1 3 2018")
    public void testNextDay4() {
        int[] day = new int[] {28,2,2018};
        int[] expected = new int[] {1,3,2018};
        int[] actual = NextDayCalculator.nextDay(day);
        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("29 2 2020  --> 1 3 2020")
    public void testNextDay5() {
        int[] day = new int[] {29,2,2020};
        int[] expected = new int[] {1,3,2020};
        int[] actual = NextDayCalculator.nextDay(day);
        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("31 12 2018  --> 1 1 2019")
    public void testNextDay6() {
        int[] day = new int[] {31,12,2018};
        int[] expected = new int[] {1,1,2019};
        int[] actual = NextDayCalculator.nextDay(day);
        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Wrong input 111224")
    public void testNextDay7() {
        int[] day = new int[] {111224};
        int[] expected = null;
        int[] actual = NextDayCalculator.nextDay(day);
        assertArrayEquals(expected, actual);
    }

}