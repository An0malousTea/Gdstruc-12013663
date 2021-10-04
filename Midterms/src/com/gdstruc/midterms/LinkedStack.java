package com.gdstruc.midterms;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {

    private LinkedList<Card> stack;

    public LinkedStack()
    {
        stack = new LinkedList<Card>();
    }

    public void push(Card card)
    {
        stack.push(card);
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public Card pop()
    {
        return stack.pop();
    }

    public Card peek()
    {
        return stack.peek();
    }

    public void printStack()
    {
        ListIterator<Card> iterator = stack.listIterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }

    public int counter(int counter)
    {
        counter = 0;
        ListIterator<Card> iterator = stack.listIterator();
        while (iterator.hasNext())
        {
            counter++;
        }
        return counter;
    }

}
