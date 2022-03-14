package com.company;

public class NodeWithKey<K, V> extends Node<V> {
    private final K key;

    public NodeWithKey(K key, V data) {
        super(data);
        this.key= key;
    }


    public K getKey(){
        return key;
    }
}
