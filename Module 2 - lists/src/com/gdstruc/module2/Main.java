package com.gdstruc.module2;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        int size = 0;

        //  List<Player> playerList = new ArrayList<>();

        Player arts = new Player(1,"arts", 100);
        Player bacon = new Player(2,"bacon", 12);
        Player alan = new Player(3,"alan", 62);
        Player bum = new Player(4,"bum", 68);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();


        System.out.println("\n 2. Updates how many elements are present in the linked list.");

        playerLinkedList.addToFront(arts,playerLinkedList);
        playerLinkedList.addToFront(bacon,playerLinkedList);
        playerLinkedList.addToFront(alan,playerLinkedList);

        System.out.println("\n 1. Removes the first Element");

        System.out.println("\n Before Deleting: ");
        playerLinkedList.printList();


        playerLinkedList.deleteElement(playerLinkedList);

        System.out.println("\n After Deleting: ");
        playerLinkedList.printList();


        System.out.println("\n 3. Contains() and IndexOf");

        System.out.println("\n contains(): ");
        //If the element is contained in the list
        playerLinkedList.contains(bacon);

        //If the element isn't contained in the list
        playerLinkedList.contains(bum);

        System.out.println("\n indexOf(): ");
        playerLinkedList.indexOf(2,arts);
    }



}
