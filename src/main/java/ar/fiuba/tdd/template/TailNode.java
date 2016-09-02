package ar.fiuba.tdd.template;

class TailNode<T> extends Node<T> {

    TailNode() {
        super(null,null);
    }

    public void addLast(Node<T> previous, T item) {
        previous.setNext(new Node<>(item, this));
    }

    public T getData() {
        throw new AssertionError();
    }

    public Node<T> getNext() {
        throw new AssertionError();
    }
}
