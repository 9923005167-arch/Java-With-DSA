static void deleteBeginning() {

    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    if (head.next == head) {
        head = null;
        return;
    }

    Node temp = head;

    while (temp.next != head) {
        temp = temp.next;
    }

    head = head.next;
    temp.next = head;
}
