package com.algorithms.linkedlist;

import com.algorithms.linkedlist.exceptions.LinkedListEmptyException;
import com.algorithms.linkedlist.exceptions.LinkedListFullException;
import com.algorithms.linkedlist.exceptions.LinkedListIndexOutOfBoundsException;

/**
 *
 * @author Deepanshu_Agrawal
 */
public class SinglyLinkedList<T> implements ISinglyLinkedList<T> {

    private SinglyLinkedListNode<T> head, last;
    private Integer capacity;
    private int currentSize;

    public SinglyLinkedList() {
        this(0);
    }

    public SinglyLinkedList(int capacity) {
        if (capacity <= 0) {
            this.capacity = null;
        } else {
            this.capacity = capacity;
        }

        head = last = null;
        currentSize = 0;
    }

    public boolean rangeCheck(int index){
        return index >= 0 && index <= currentSize;
    }
    
    @Override
    public void addFirst(T data) throws LinkedListFullException {
        SinglyLinkedListNode<T> newNode = new SinglyLinkedListNode<>(data);

        if (isEmpty()) {
            last = newNode;
        } else if(isFull()){
            throw new LinkedListFullException();
        } else {
            newNode.setNext(head);
        }
        
        head = newNode;
        currentSize++;
    }

    @Override
    public void addLast(T data) throws LinkedListFullException {
        SinglyLinkedListNode<T> newNode = new SinglyLinkedListNode<>(data);
        
        if (isEmpty()) {
            head = newNode;
        } else if(isFull()){
            throw new LinkedListFullException();
        } else {
            last.setNext(newNode);
        }
        
        last = newNode;
    }

    @Override
    public void addAtIndex(T data, int index) throws LinkedListFullException, LinkedListIndexOutOfBoundsException {
        if(rangeCheck(index)){
            if(index == 0){
                addFirst(data);
            } else if(index == currentSize){
                addLast(data);
            } else {
                int i = 0;
                SinglyLinkedListNode<T> iterator = head;
                while(i < index){
                    i++;
                    iterator = iterator.getNext();
                }
            }
        } else {
            throw new LinkedListIndexOutOfBoundsException();
        }
    }

    @Override
    public void deleteFirst() throws LinkedListEmptyException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteLast() throws LinkedListEmptyException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteAtIndex(int index) throws LinkedListFullException, LinkedListIndexOutOfBoundsException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T getFirst() throws LinkedListEmptyException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T getLast() throws LinkedListEmptyException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T getAtIndex(int index) throws LinkedListFullException, LinkedListIndexOutOfBoundsException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }

    @Override
    public boolean isFull() {
        return currentSize == capacity;
    }

}
