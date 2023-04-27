public class Stack<T> {

    private Node<T> head;

    public boolean isEmpty() {
       return  head == null;
    }



    public void push(T value) {
        if(isEmpty()) {
            head = new Node<>(value, null);
        } else {
            head = new Node<>(value, head);

        }

    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("нет элементов!");
        }

        T value = head.getValue();
        head = head.getPrev();
        return value;

    }

    public void printme() {
        if(isEmpty()) {
            System.out.println("Empty");
        } else {

           Node<T> currentPosition = head;
            while (currentPosition != null) {
                System.out.print(currentPosition.getValue());
                if (currentPosition.getPrev() != null) System.out.print(" -> ");
                currentPosition = currentPosition.getPrev();
            }

        }
        System.out.println();
    }
}
