package vtaras.own.utils.examples.linked;

import org.junit.Assert;
import org.junit.Test;
import vtaras.own.utils.examples.linked.lists.LinkedListUtils;
import vtaras.own.utils.examples.linked.lists.OwnLinkedList;
import vtaras.own.utils.examples.linked.lists.OwnSinglyLinkedList;

public class LinkedListUtilsTest {

    @Test
    public void testGetMiddleElement() {
        OwnLinkedList firstOwnLinkedList = new OwnLinkedList();
        firstOwnLinkedList.add(new OwnLinkedList.Node("a"));
        firstOwnLinkedList.add(new OwnLinkedList.Node("b"));
        firstOwnLinkedList.add(new OwnLinkedList.Node("c"));
        firstOwnLinkedList.add(new OwnLinkedList.Node("d"));
        Assert.assertEquals("b", LinkedListUtils.getMiddleElement(firstOwnLinkedList).data());
        OwnLinkedList secondOwnLinkedList = new OwnLinkedList();
        secondOwnLinkedList.add(new OwnLinkedList.Node("a"));
        secondOwnLinkedList.add(new OwnLinkedList.Node("b"));
        secondOwnLinkedList.add(new OwnLinkedList.Node("c"));
        secondOwnLinkedList.add(new OwnLinkedList.Node("d"));
        secondOwnLinkedList.add(new OwnLinkedList.Node("e"));
        Assert.assertEquals("c", LinkedListUtils.getMiddleElement(secondOwnLinkedList).data());
    }

    @Test
    public void testReverse() {
        OwnSinglyLinkedList list = new OwnSinglyLinkedList();
        list.append("a");
        list.append("b");
        list.append("c");
        list.append("d");
        list.append("e");
        list.append("f");
        Assert.assertEquals("f", LinkedListUtils.reverseIteratively(list).head.data);
        Assert.assertEquals("a", LinkedListUtils.reverseRecursively(list).head.data);
    }

    @Test
    public void testRemoveNodesGreaterThanValue() {
        OwnSinglyLinkedList testList = new OwnSinglyLinkedList();
        testList.append(new OwnSinglyLinkedList.Node(1));
        testList.append(new OwnSinglyLinkedList.Node(2));
        testList.append(new OwnSinglyLinkedList.Node(3));
        testList.append(new OwnSinglyLinkedList.Node(4));
        testList.append(new OwnSinglyLinkedList.Node(5));
        testList.append(new OwnSinglyLinkedList.Node(6));
        testList.append(new OwnSinglyLinkedList.Node(7));
        Assert.assertNull(LinkedListUtils.removeNodesGreaterThanValue(null, 1));
        OwnSinglyLinkedList.Node neededNode = new OwnSinglyLinkedList.Node(3);
        OwnSinglyLinkedList.Node testNode = LinkedListUtils.removeNodesGreaterThanValue(testList.head, 3);
        Assert.assertEquals(neededNode.data, testNode.data);
    }
}
