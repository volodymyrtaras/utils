package vtaras.own.utils.lotus.flare;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

public class RemoveNodesGreaterThanXTest {

    static LinkedList<SinglyLinkedListNode> firstTestList = new LinkedList<>();
    static LinkedList<SinglyLinkedListNode> secondTestList = new LinkedList<>();
    static LinkedList<SinglyLinkedListNode> thirdTestList = new LinkedList<>();
    static LinkedList<SinglyLinkedListNode> fourthTestList = new LinkedList<>();

    @Before
    public void setUp() {
        firstTestList.add(new SinglyLinkedListNode(1));
        firstTestList.add(new SinglyLinkedListNode(2));
        firstTestList.add(new SinglyLinkedListNode(3));
        firstTestList.add(new SinglyLinkedListNode(4));
        firstTestList.add(new SinglyLinkedListNode(5));
        firstTestList.add(new SinglyLinkedListNode(6));
        firstTestList.add(new SinglyLinkedListNode(7));
    }

    @Test
    public void testNullableNode() {
        Assert.assertNull(RemoveNodesGreaterThanX.removeNodes(null, 1));
    }

    @Test
    public void testSimpleList() {
        SinglyLinkedListNode neededNode = new SinglyLinkedListNode(3);
        SinglyLinkedListNode testNode = RemoveNodesGreaterThanX.removeNodes(firstTestList.getFirst(), 3);
        Assert.assertEquals(neededNode.data, testNode.data);
    }
}
