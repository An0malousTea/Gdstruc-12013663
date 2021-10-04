package com.gdstruc.midterms;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(30);
        ArrayStack playerHand = new ArrayStack(30);
        ArrayStack discarded = new ArrayStack(30);

        stack.push(new Card(1, "WindRanger"));
        stack.push(new Card(2, "Queen of Pain"));
        stack.push(new Card(3, "Riki"));
        stack.push(new Card(4, "Zeus"));
        stack.push(new Card(5, "Anti-Mage"));
        stack.push(new Card(6, "Centaur Warrunner"));
        stack.push(new Card(7, "Witch Doctor"));
        stack.push(new Card(8, "Lone Druid"));
        stack.push(new Card(9, "IO"));
        stack.push(new Card(10, "Rubick"));
        stack.push(new Card(11, "Axe"));
        stack.push(new Card(12, "Abbadon"));
        stack.push(new Card(13, "Shadow Fiend"));
        stack.push(new Card(14, "Spirit Breaker"));
        stack.push(new Card(15, "Storm Spirit"));
        stack.push(new Card(16, "Ember Spirit"));
        stack.push(new Card(17, "Earth Spirit"));
        stack.push(new Card(18, "Void Spirit"));
        stack.push(new Card(19, "Vengeful Spirit"));
        stack.push(new Card(20, "Skywrath"));
        stack.push(new Card(21, "Enchantress"));
        stack.push(new Card(22, "Drow Ranger"));
        stack.push(new Card(23, "Crystal Maiden"));
        stack.push(new Card(24, "Lina"));
        stack.push(new Card(25, "Bloodseeker"));
        stack.push(new Card(26, "EarthShaker"));
        stack.push(new Card(27, "Silencer"));
        stack.push(new Card(28, "Dazzle"));
        stack.push(new Card(29, "Omniknight"));
        stack.push(new Card(30, "Lion"));


        display(stack,playerHand,discarded);
        System.out.println("Press Any Key To Continue...");
        new java.util.Scanner(System.in).nextLine();

        while(stack.size() != 0)
        {

            turns(stack,playerHand,discarded);
            display(stack,playerHand,discarded);

            System.out.println("Press Any Key To Continue...");
            new java.util.Scanner(System.in).nextLine();
        }

        if (stack.size() <= 0)
        {
            System.out.println("There are no more cards remaining in the deck. :>");
        }

    }

    public static void turns(ArrayStack deck, ArrayStack hand, ArrayStack discard)
    {
        Random rand = new Random();
        int max = 3;
        int ranValue = 5;
        int randCommand = rand.nextInt(max);

        if(randCommand == 0)            //Drawing Cards
        {
            int randDraw = rand.nextInt(ranValue);
            System.out.println("Drawing from player's deck...");
            System.out.println("Press Any Key To Continue...");
            new java.util.Scanner(System.in).nextLine();

            for (int i = 0; i <= randDraw; i++)
            {
                hand.push(deck.peek());
                deck.pop();
            }
        }
        else if(randCommand == 1)       // Discarding Cards from hand
        {
            int randDiscard = rand.nextInt(ranValue);
            System.out.println("Discarding cards from hand...");
            System.out.println("Press Any Key To Continue...");
            new java.util.Scanner(System.in).nextLine();

            if(hand.size() < randDiscard)
            {
                System.out.println("There are not enough cards to discard.");
                System.out.println("Press Any Key To Continue...");
                new java.util.Scanner(System.in).nextLine();
            }
            else
            {
                for (int i = 0; i < randDiscard; i++)
                {
                    discard.push(hand.peek());
                    hand.pop();
                }
            }


        }
        else if(randCommand == 2)       //Grabbing discarded cards
        {
            int randDiscDraw = rand.nextInt(ranValue);
            System.out.println("Grabbing from discarded cards...");
            System.out.println("Press Any Key To Continue...");
            new java.util.Scanner(System.in).nextLine();

            if(discard.size() < randDiscDraw)
            {
                System.out.println("There are not enough cards to grab.");
                System.out.println("Press Any Key To Continue...");
                new java.util.Scanner(System.in).nextLine();
            }
            else
            {
                for (int i = 0; i < randDiscDraw; i++)
                {
                    hand.push(discard.peek());
                    discard.pop();

                }
            }

        }

    }

    public static void display(ArrayStack deck, ArrayStack hand, ArrayStack discard)
    {
        System.out.println("Player's Deck: ");
        deck.printStack();

        System.out.println("Player's Hand: ");
        hand.printStack();

        System.out.println("Player's Deck has " + deck.size() + " cards remaining.\n");
        System.out.println("Discarded Pile has " + discard.size() + " cards.\n");



    }

}
