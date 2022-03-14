package com.company;


public class DllWithKey<K, V> {
    Node<V> head;
    Node<V> tail;
    private int size;


    public int getSize() {
        return size;
    }

    public void add(K key, V data) {
        NodeWithKey<K, V> node = new NodeWithKey<>(key, data);

        node.setPrevious(tail);
        node.setNext(null);

        if (tail != null) {
            tail.setNext(node);
        }
        tail = node;
        if (size == 0) {
            head = node;
            head.setPrevious(null);
        }
        size++;
    }


    public V get(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }
        int currentIndex = 0;
        Node<V> node = head;
        while (currentIndex <= index) {
            if (currentIndex == index) {
                return node.data;
            }
            node = node.next;
            currentIndex++;
        }
        return null;
    }

    public boolean contains(V value) {
        Node<V> currentNode = head;

        while (currentNode != null) {
            if (currentNode.data.equals(value)) {
                return true;
            }

            currentNode = currentNode.next;
        }

        return false;
    }


    public void removeFirst() {
        remove(0);
        size--;
    }

    public void removeLast() {
        remove(size - 1);
        size--;
    }

    public void removeAll() {
        head = null;
        tail = null;
        size = 0;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0 && head != null) {
            head = head.next;
            head.previous = null;
            size--;
        } else if (index == size - 1) {
            tail = tail.previous;
            tail.next = null;
            size--;
        } else {
            Node<V> temp = head;
            for (int i = 0; i < index - 1; i++) {
                System.out.println("inside for loop");
                if (temp != null) {
                    temp = temp.next;
                } else {
                    throw new NullPointerException();
                }
            }
            if (temp.next != null) {
                temp.next = temp.next.next;
                if (temp.next.next != null)
                    temp.next.next.previous = temp.next;
                size--;
            } else {
                throw new NullPointerException();
            }
        }
    }

    public void firstOccur(V data) {
        if (head.data == data) {
            head = head.next;
            head.previous = null;
            size--;
            return;
        } else {
            Node<V> deleteNode = new Node<>(data);
            Node<V> temp = head;
            while (temp != null) {
                temp = temp.next;
                if (temp.next.data == deleteNode.data) {
                    temp.next = temp.next.next;
                    if (temp.next.next != null)
                        temp.next.next.previous = temp.next;
                    size--;
                }
            }
        }
    }

    void print() {
        Node<V> temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public V getByKey(K key) {
        Node<V> currentNode = head;

        while (currentNode != null) {

            NodeWithKey<K, V> kvNodeWithKey = (NodeWithKey<K, V>) currentNode;
            if(kvNodeWithKey.getKey().equals(key)){
                return kvNodeWithKey.data;
            }

            currentNode = currentNode.next;
        }

        return null;
    }
}

// **problem is about head **
// **remove method need to check
// ** then firstOccur method should solved automatic;