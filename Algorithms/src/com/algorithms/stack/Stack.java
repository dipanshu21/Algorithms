package com.algorithms.stack;

import com.algorithms.stack.exceptions.StackOverFlowException;
import com.algorithms.stack.exceptions.StackUnderFlowException;

/**
 *
 * @author Deepanshu_Agrawal
 */
public class Stack<T> implements IStack<T> {
    private T[] elements;
    private int top;
    
    public Stack(int capacity){
        elements = new T[capacity];
        top = -1;
    }
    
    @Override
    public T pop() throws StackOverFlowException {
        
    }

    @Override
    public void push() throws StackUnderFlowException {
        
    }

    @Override
    public T peek() throws StackOverFlowException {
        T element = null;
        if(!isEmpty()){
            element = elements[top];
        } else {
            throw new StackOverFlowException();
        }
        return element;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == elements.length - 1;
    }
    
}
