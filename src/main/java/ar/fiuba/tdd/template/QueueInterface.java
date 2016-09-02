package ar.fiuba.tdd.template;

interface QueueInterface<T> {
    boolean isEmpty();

    int size();

    void add(T item);

    T top();

    void remove();
}
