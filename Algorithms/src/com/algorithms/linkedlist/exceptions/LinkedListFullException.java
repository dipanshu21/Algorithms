package com.algorithms.linkedlist.exceptions;

/**
 *
 * @author Deepanshu_Agrawal
 */
public class LinkedListFullException extends Exception {

    private static final String msg = "Linked list is full!!";

    public LinkedListFullException() {
        super(msg);
    }
}
