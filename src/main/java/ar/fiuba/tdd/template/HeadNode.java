package ar.fiuba.tdd.template;

class HeadNode<T> extends Node<T> {

    private Node<T> next;

    HeadNode(Node<T> tail){
        super(null,tail);
    }

    void addLast(T item){
        next.addLast(this,item);
    }
}
