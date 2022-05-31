public class Application {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.insert(list, 3);
        list.insert(list, 9);
        list.insert(list, 7);
        list.insert(list, 4);

        list.delete(list, 7);

        list.search(list, 3);

        list.printList(list);

    }

}