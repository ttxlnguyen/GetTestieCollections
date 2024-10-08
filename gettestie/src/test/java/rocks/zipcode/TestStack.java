package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

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

    // Make a bigger test exercising more Stack methods.......

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

    // Test HashMap
    @Test
    public void testHashMapPut(){
        HashMap<String, String> map = new HashMap<>();
        map.put("k", "v");
        Assert.assertEquals("v", map.get("k"));
    }

    @Test
    public void testHashMapGet(){
        HashMap<String, String> map = new HashMap<>();
        map.put("k", "v");
        Assert.assertEquals("v", map.get("k"));
    }

    @Test
    public void testHashMapSize(){
        HashMap<String, String> map = new HashMap<>();
        map.put("k", "v");
        int expected = 1;
        Assert.assertEquals(expected, map.size());
    }

    @Test
    public void testHashMapContainsKey(){
        HashMap<String, String> map = new HashMap<>();
        map.put("k", "v");
        Assert.assertTrue(map.containsKey("k"));
    }

    @Test
    public void testHashMapClear(){
        HashMap<String, String> map = new HashMap<>();
        map.put("k", "v");
        map.clear();
        Assert.assertEquals(0, map.size());
    }

    // Test HashSet
    @Test
    public void testHashSetAdd(){
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        Assert.assertTrue(set.contains(1));
    }

    @Test
    public void testHashSetContains(){
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        Assert.assertTrue(set.contains(1));
    }

    @Test
    public void testHashSetSize(){
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        Assert.assertEquals(1, set.size());
    }

    @Test
    public void testHashSetClear(){
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.clear();
        Assert.assertEquals(0, set.size());
    }

    // Test Iterator
    @Test
    public void iteratorNext(){
        ArrayList<String> letters = new ArrayList<String>();
        letters.add("a");
        letters.add("b");

        Iterator<String> it = letters.iterator();
        String expected = "a";
        String next = it.next();
        Assert.assertEquals(expected, next);
    }

    @Test
    public void iteratorHasNext(){
        int i = 0;

        ArrayList<String> letters = new ArrayList<String>();
        letters.add("a");
        letters.add("b");
        letters.add("c");

        Iterator<String> it = letters.iterator();
        while (it.hasNext()) {
            it.next();
            i += 1;
        }
        Assert.assertEquals(3,i);
    }

    // Test LinkedList
    @Test
    public void testLinkedListAddFirst(){
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.addLast("b");
        Assert.assertEquals("a", list.getFirst());
    }

    @Test
    public void testLinkedListRemoveFirst(){
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.remove("a");
        Assert.assertEquals("b", list.getFirst());
    }

    // Test PriorityQueue
    @Test
    public void testPeek(){
        PriorityQueue<String> q = new PriorityQueue<>();
        q.add("a");
        q.add("b");
        Assert.assertEquals("a", q.peek());
    }

    @Test
    public void testPoll(){
        PriorityQueue<String> q = new PriorityQueue<>();
        q.add("a");
        q.add("b");
        Assert.assertEquals("a", q.poll());
    }

    // Test Stack
    @Test
    public void testPush() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @Test
    public void testPop(){
        Stack<String> stack = new Stack<>();
        stack.push("popped");
        stack.pop();
        assertEquals(true, stack.isEmpty());
    }

    @Test
    public void testStackPeek(){
        Stack<String> stack = new Stack<>();
        stack.push("peek");
        assertEquals("peek", stack.peek());
    }

    @Test
    public void isEmpty(){
        Stack<String> stack = new Stack<>();
        assertTrue(stack.isEmpty());
    }

    // Test TreeMap
    @Test
    public void testGet(){
        TreeMap<String, String> t = new TreeMap<>();
        t.put("k", "v");
        Assert.assertEquals("v", t.get("k"));
    }

    @Test
    public void testFirstKey(){
        TreeMap<String, String> t = new TreeMap<>();
        t.put("k", "v");
        t.put("a", "c");
        Assert.assertEquals("a", t.firstKey());
    }

    // Test TreeSet
    @Test
    public void testTreeSetFirst(){
        TreeSet<String> t = new TreeSet<>();
        t.add("b");
        t.add("a");
        Assert.assertEquals("a", t.first());
    }

    @Test
    public void testTreeSetLast(){
        TreeSet<String> t = new TreeSet<>();
        t.add("b");
        t.add("a");
        Assert.assertEquals("b", t.last());
    }

    // Test Vector
    @Test
    public void testCap(){
        Vector<String> v = new Vector<>();
        Assert.assertEquals(10, v.capacity());
    }

    @Test
    public void testEnsureCap(){
        Vector<String> v = new Vector<>();
        v.ensureCapacity(21);
        Assert.assertEquals(21, v.capacity());
    }
}
