public class Main {
    public static void main(String[] args) {
        LinkedList llA = new LinkedList();
        LinkedList llB = new LinkedList();

        llA.insertNode(7);
        llA.insertNode(1);
        llA.insertNode(6);
        llB.insertNode(5);
        llB.insertNode(9);
        llB.insertNode(2);

        LinkedList llC = sumLists(llA,llB);

        llC.traversalLinkedList();


    }

    public static LinkedList sumLists(LinkedList llA, LinkedList llB) {
        LinkedList llC = new LinkedList();

        llC.insertNode(7);
        llC.insertNode(1);
        llC.insertNode(6);

        //TODO
        return llC;
    }
}
