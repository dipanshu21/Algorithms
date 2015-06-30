package com.algorithms.linkedlist.exceptions;

/**
 *
 * @author Deepanshu_Agrawal
 */
public class LinkedListIndexOutOfBoundsException  extends Exception{
    private static final String msg = "Index is out of bounds!!";
    
    public LinkedListIndexOutOfBoundsException(){
        super(msg);
    }
}