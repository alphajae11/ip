package chingu;

import chingu.task.Events;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EventsTest {
    @Test
    public void toStringTest() {
        Events testEvent = new Events("Testing for Java", "2024/03/28 1900", "2024/03/28 2100", "High");
        String expected = "[E][ ] Testing for Java Priority: High (from: Mar 28 2024 1900 to: Mar 28 2024 2100)";

        assertEquals(expected, testEvent.toString());
    }
}
