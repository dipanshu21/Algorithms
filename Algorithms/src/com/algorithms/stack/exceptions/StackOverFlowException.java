package com.algorithms.stack.exceptions;

/**
 *
 * @author Deepanshu_Agrawal
 */
public class StackOverFlowException extends Exception{
    private static final String msg = "Stack is full, It is not possible to push any more elements";
    
    public StackOverFlowException(){
        super(msg);
    }
}
