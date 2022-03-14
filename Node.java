package com.company;

public class Node<T> {
    Node<T> next;
    Node<T> previous;
    T data;


public  Node(T data){
    this.data = data;
}
    public Node<T> getNext() {
        return next;
    }
    public void setNext(Node<T> data) {
        this.next = data;
    }
    public Node<T> getPrevious() {
        return previous;
    }
    public void setPrevious(Node<T> data) {
        this.previous = data;
    }

}