package ar.fiuba.tdd.template;

class HeadNode<T> extends Node<T> {

    HeadNode(Node<T> tail){
        super(null,tail);
    }

    void addLast(T item){
        this.next.addLast(this,item);
    }
}
