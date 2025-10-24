
package com.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CollectionDemoTest {

    private CollectionDemo demo;

    @BeforeEach
    void setup() {
        demo = new CollectionDemo();
    }

    @Test
    void testListOperations() {
        demo.addToList("Alice");
        assertTrue(demo.searchInList("Alice"));
        assertEquals(1, demo.getStudentList().size());

        demo.removeFromList("Alice");
        assertFalse(demo.searchInList("Alice"));
    }

    @Test
    void testSetOperations() {
        demo.addToSet("Bob");
        demo.addToSet("Bob");
        assertEquals(1, demo.getStudentSet().size());
        assertTrue(demo.searchInSet("Bob"));

        demo.removeFromSet("Bob");
        assertFalse(demo.searchInSet("Bob"));
    }

    @Test
    void testMapOperations() {
        demo.addToMap(101, "Charlie");
        assertEquals("Charlie", demo.searchInMap(101));

        demo.removeFromMap(101);
        assertNull(demo.searchInMap(101));
    }
}
