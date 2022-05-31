public class Application {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list = LinkList.insert(list, 3);
        list = LinkList.insert(list, 9);
        list = LinkList.insert(list, 7);
        list = LinkList.insert(list, 4);
        list = LinkList.deleteByKey(list, 7);
        LinkList.printList(list);

    }

}