package com.algorithms.stack.exceptions;

/**
 *
 * @author Deepanshu_Agrawal
 */
public class StackUnderFlowException extends Exception{

    private static final String msg = "Stack is empty, It is not possible to pop any element";

    public StackUnderFlowException() {
        super(msg);
    }
}
