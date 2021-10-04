package com.gdstruc.module2;

import java.util.LinkedList;


public class PlayerLinkedList {

    private PlayerNode head;

    private void remove(int i) {
    }

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
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
    }
    public void deleteElement(PlayerLinkedList playerLinkedList){

        playerLinkedList.remove(0);

    }



}
