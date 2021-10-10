package com.gdstruc.module2;

import java.util.LinkedList;


public class PlayerLinkedList {

    private PlayerNode head;


    public void addToFront(Player player, PlayerLinkedList playerLinkedList)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;

        System.out.println("*Added Element*");
        playerLinkedList.getSize();
        System.out.println("");
    }

    public void printList() {
        PlayerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.print("null");
        System.out.println("\n\n    ");
    }

    public void deleteElement(PlayerLinkedList playerLinkedList){
        PlayerNode current1 = head;
        PlayerNode current2 = current1.getNextPlayer();
        head = current2;
        current1 = null;

        System.out.println("*Deleted Element*");
        playerLinkedList.getSize();
        System.out.println("");
    }

    public int getSize(){

        PlayerNode current1 = head;
        int counter = 0;
        while (current1 != null){

            counter++;
            current1 = current1.getNextPlayer();
        }
        System.out.println("Element count: " + counter);

        return counter;

    }

    public void contains(Player player){

        String check = "doesn't exist in this list.";

        PlayerNode current1 = head;
        while (current1 != null){

            if (player == current1.getPlayer()){

                check = "exists in this list.";
            }

            current1 = current1.getNextPlayer();
        }

        System.out.println("The element " + check);
    }

    public void indexOf(int size,Player player){

        int indexNum = size - 1;

        PlayerNode current1 = head;

        while(current1.getPlayer() != player){

            indexNum--;
            current1 = current1.getNextPlayer();
        }

        if (indexNum < 0){

            System.out.println("This element doesn't exist in this list.");
        }


        System.out.println("The element's index number is " + indexNum);

}
}