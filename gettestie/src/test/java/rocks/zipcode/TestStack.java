package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods......

    // Test Array Deque
    @Test
    public void testDequeAddFirst(){
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("first");
        deque.addLast("last");
        Assert.assertEquals("first", deque.element());
    }

    @Test
    public void testDequeAddLast(){
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("first");
        deque.addLast("last");
        Assert.assertEquals("last", deque.getLast());
    }

    // Test ArrayList
    @Test
    public void testArrayListAdd(){
        ArrayList<String> list = new ArrayList<>();
        list.add("add");
        Assert.assertTrue(list.contains("add"));
    }

    @Test
    public void testArrayListRemove(){
        ArrayList<String> list = new ArrayList<>();
        list.add("add");
        list.remove("add");
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void testArrayListSize(){
        ArrayList<String> list = new ArrayList<>();
        list.add("add");
        Assert.assertEquals(1, list.size());
    }
}
