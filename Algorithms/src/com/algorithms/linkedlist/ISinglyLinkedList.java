package com.algorithms.linkedlist;

import com.algorithms.linkedlist.exceptions.LinkedListEmptyException;
import com.algorithms.linkedlist.exceptions.LinkedListFullException;
import com.algorithms.linkedlist.exceptions.LinkedListIndexOutOfBoundsException;

/**
 *
 * @author Deepanshu_Agrawal
 */
public interface ISinglyLinkedList<T> {
    public void addFirst(T data) throws LinkedListFullException;
    public void addLast(T data) throws LinkedListFullException;
    public void addAtIndex(T data, int index) throws LinkedListFullException, LinkedListIndexOutOfBoundsException;
    
    public void deleteFirst() throws LinkedListEmptyException;
    public void deleteLast() throws LinkedListEmptyException;
    public void deleteAtIndex(int index) throws LinkedListFullException, LinkedListIndexOutOfBoundsException;
    
    public T getFirst() throws LinkedListEmptyException;
    public T getLast() throws LinkedListEmptyException;
    public T getAtIndex(int index) throws LinkedListFullException, LinkedListIndexOutOfBoundsException;
    
    public boolean isEmpty();
    public boolean isFull();
}
