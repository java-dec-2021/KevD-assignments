package ListAssignment;

public class SLLTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.AddBack(1);
        sll.AddBack(3);
        sll.AddBack(4);
        sll.AddBack(6);

        int val = sll.removeBack();
        sll.DisplayValues();
    }
}
