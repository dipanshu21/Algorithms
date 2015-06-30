package com.algorithms.linkedlist;

/**
 *
 * @author Deepanshu_Agrawal
 */
public class SinglyLinkedListNode<T> {

    private T data;
    private SinglyLinkedListNode<T> next;

    public SinglyLinkedListNode(T data){
        this.data = data;
        next = null;
    }
    
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public SinglyLinkedListNode<T> getNext() {
        return next;
    }

    public void setNext(SinglyLinkedListNode<T> next) {
        this.next = next;
    }
}
