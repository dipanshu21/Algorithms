package com.algorithms.linkedlist.exceptions;

/**
 *
 * @author Deepanshu_Agrawal
 */
public class LinkedListEmptyException extends Exception {

    private static final String msg = "Linked list is empty!!";

    public LinkedListEmptyException() {
        super(msg);
    }
}
