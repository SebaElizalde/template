package ar.fiuba.tdd.template;

class Node<T> {

    private T data;
    Node<T> next;

    void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public T getData() {
        return this.data;
    }

    public void addLast(Node<T> previous, T item) {
        this.next.addLast(this,item);
    }

    Node(T item, Node<T> next) {
        this.data = item;
        this.next = next;
    }

}
