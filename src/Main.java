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

        LinkedList llC = sumLists(llA, llB);

        llC.traversalLinkedList();
    }

    //  7 -> 1 -> 6 / +  / 5 -> 9 -> 2 / = /2 -> 9 -> 1/
    //  716 +  592 = 291
    public static LinkedList sumLists(LinkedList llA, LinkedList llB) {
        LinkedList llC = new LinkedList();

        Node currA = llA.getHead();
        Node currB = llB.getHead();

        int dec = 0;
        int unit;
        int aux = 0;

        while (currA != null) {

            aux += currA.getValue() + currB.getValue();
            if (aux > 10) {
                dec = aux / 10;
                unit = aux % 10;
                llC.insertNode(unit);
                aux = 0;
            } else {
                llC.insertNode(dec + currA.getValue() + currB.getValue());
            }

            currA = currA.getNext();
            currB = currB.getNext();
            aux += dec;
        }
        return llC;
    }
}
