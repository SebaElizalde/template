package ar.fiuba.tdd.template;

class LinkedList<T> {

    private int size = 0;
    private TailNode<T> tail = new TailNode<>();
    private HeadNode<T> head = new HeadNode<>(tail);

    int size() {
        return this.size;
    }

    boolean isEmpty() {
        return this.size == 0;
    }

    void add(T item) {
        head.addLast(item);
        size++;
    }

    T getFirst() {
        return head.getNext().getData();
    }

    void removeFirst() {
        head.setNext(head.getNext().getNext());
        size--;
    }

}
