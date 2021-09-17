package com.gdstruc.module2;

import java.util.LinkedList;


public class PlayerLinkedList {

    private PlayerNode head;


    public void addToFront(Player player, PlayerLinkedList playerLinkedList, int size)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;

        System.out.println("*Added Element*");
        playerLinkedList.sizeVariable(size);
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

    public void deleteElement(PlayerLinkedList playerLinkedList, int size){
        PlayerNode current1 = head;
        PlayerNode current2 = current1.getNextPlayer();
        head = current2;

        System.out.println("*Deleted Element*");
        playerLinkedList.sizeVariable(size);
        System.out.println("");
    }

    public void sizeVariable(int size){

        PlayerNode current1 = head;
        int counter = 0;
        while (current1 != null){

            counter++;
            current1 = current1.getNextPlayer();
        }
        System.out.println("Element count: " + counter);

        size = counter;

    }

    public void playerChecker(Player player, PlayerLinkedList playerLinkedList){

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

    public void indexChecker(int size,Player player){

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