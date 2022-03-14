package com.company;
public class DLL<T> {
    Node<T> head;
    Node<T> tail;
    private int size;
    public int getSize() {
        return size;
    }
    public void add(T data) {
        Node<T> node = new Node<>(data);

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

    public T get(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }
        int currentIndex = 0;
        Node<T> node = head;
        while (currentIndex <= index) {
            if (currentIndex == index) {
                return node.data;
            }
            node = node.next;
            currentIndex++;
        }
        return null;
    }

    public boolean contains(T value) {
        Node<T> currentNode = head;
        while (currentNode != null){
            if(currentNode.data.equals(value)){
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

    private T remove(Node<T> node){
        if(node == null){
            throw new NullPointerException();
        }

        if(node.previous != null){
            node.previous.next = node.next;
        }

        if(node.next != null){
            node.next.previous = node.previous;
        }

        if(node.equals(tail)){
            tail = node.previous;
        }

        if(node.equals(head)){
            head = node.next;
        }
        size --;
        head.previous = null;
        tail.next = null;
        node.previous = null;
        node.next = null;
        return node.data;
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
            Node<T> temp = head;
            for (int i = 0; i < index  ; i++) {
                if (temp != null) {
                    temp = temp.next;
                }
            }
            if (temp != null) {
                temp.previous.next = temp.next;
                if (temp.next != null)
                    temp.next.previous = temp.previous.next;
                size--;
            }
        }
    }

    public Node<T> findFirstOccurrence(T data){

        Node<T> current = head;
        while (current != null){
            if(current.data.equals(data)){
                return current;
            }

            current = current.next;
        }

        return null;
    }

    public T removeFirstOccurrence(T data) {
        if((data == null)){
            throw new NullPointerException();
        }
        Node<T> node = findFirstOccurrence(data);
        return remove(node);
    }

    void print() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
