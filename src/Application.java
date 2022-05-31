import java.util.LinkedList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        while (true) {
            try {
                menu(linkedList);
            } catch (Exception e) {
                System.out.println("Insert a correct number!");
                System.out.println("==================");
            }
        }


    }

    public static void addNode(String node, LinkedList linkedList){
        linkedList.add(node);
        System.out.println("Added!");
    }

    public static void remNode(String node, LinkedList linkedList){

        if(search(node,linkedList)) {
            linkedList.remove(node);
            System.out.println("Removed!");
        }
        else
            System.out.println("not found!");
    }

    public static boolean search(String node, LinkedList linkedList){
        Scanner sc = new Scanner(System.in);
//        String node = sc.nextLine();

        if(linkedList.contains(node)){
            System.out.println("Contains!");
            return true;
        }

        else{
            System.out.println("Not Contains!");
            return false;
        }

    }
    public static String setNode(){
        Scanner sc = new Scanner(System.in);
        String node = sc.nextLine();
        return node;
    }

    public static void menu(LinkedList linkedList){

        while (true) {
            System.out.println("1.Check isEmpty()\n2.Add\n3.Remove\n4.Search\n5.Exit\n0.Show LinkedList");
            Scanner sc = new Scanner(System.in);
            int select = sc.nextInt();
            String node = "";

            if (select <= 5) {

                switch (select) {
                    case 0:
                        System.out.println(linkedList);
                        break;

                    case 1:
                        System.out.println(linkedList.isEmpty());
                        System.out.println("==================");
                        break;

                    case 2:
                        node = setNode();
                        addNode(node, linkedList);
                        System.out.println("==================");
                        break;

                    case 3:
                        node = setNode();
                        remNode(node, linkedList);
                        System.out.println("==================");
                        break;

                    case 4:
                        node = setNode();
                        search(node, linkedList);
                        System.out.println("==================");
                        break;

                    case 5:
                        System.exit(0);
                        break;
                }
            } else if (select > 5)
                throw new RuntimeException("Insert correct number!");
        }
    }
}