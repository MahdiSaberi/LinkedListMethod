public class LinkList {
    Node head;

    public static LinkList insert(LinkList list, int data) {

        Node new_node = new Node(data);
        new_node.next = null;


        if (list.head == null) {
            list.head = new_node;
        } else {

            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = new_node;
        }


        return list;
    }

    public static LinkList deleteByKey(LinkList list, int key) {
        Node currNode = list.head, prev = null;


        if (currNode != null && currNode.data == key) {
            list.head = currNode.next;


            System.out.println(key + " found and deleted");

            return list;
        }

        while (currNode != null && currNode.data != key) {

            prev = currNode;
            currNode = currNode.next;
        }


        if (currNode != null) {

            prev.next = currNode.next;

            System.out.println(key + " found and deleted");
        }

        if (currNode == null) {
            System.out.println(key + " not found");
        }

        return list;
    }

    public static void printList(LinkList list) {
        Node currNode = list.head;
        System.out.print("LinkedList: ");

        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
}