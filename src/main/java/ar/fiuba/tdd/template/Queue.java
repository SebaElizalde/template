package ar.fiuba.tdd.template;

class Queue<T> implements QueueInterface<T> {

    private LinkedList<T> list = new LinkedList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public void add(T item) {
        list.add(item);
    }

    public T top() {
        return list.getFirst();
    }

    public void remove() {
        list.removeFirst();
    }
}
