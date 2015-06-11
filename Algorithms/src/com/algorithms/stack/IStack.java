package com.algorithms.stack;

import com.algorithms.stack.exceptions.StackOverFlowException;
import com.algorithms.stack.exceptions.StackUnderFlowException;

/**
 *
 * @author Deepanshu_Agrawal
 */
public interface IStack<T> {

    public T pop() throws StackOverFlowException;

    public void push() throws StackUnderFlowException;

    public T peek() throws StackOverFlowException;

    public boolean isEmpty();

    public boolean isFull();
}
