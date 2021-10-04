package com.gdstruc.midterms;

import java.util.EmptyStackException;


public class ArrayStack {

    private Card[] stack;
    private int top;

    public ArrayStack(int capacity)
    {
        stack = new Card[capacity];
    }

    public void push(Card card)
    {
        if (top == stack.length) //check if stack is full
        {
            Card[] newStack = new Card[2 * stack.length];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }

        stack[top++] = card;
    }

    public Card pop()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }

        Card poppedCard = stack[--top];
        stack[top] = null;
        return poppedCard;
    }

    public boolean isEmpty()
    {
        return top == 0;
    }

    public Card peek()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    public void printStack()
    {
        for (int i = top -1; i >= 0; i--)
        {
            System.out.println(stack[i]);
        }
    }

    public int size()
    {
        return top;
    }
}
