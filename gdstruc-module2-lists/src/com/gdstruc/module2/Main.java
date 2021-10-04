package com.gdstruc.module2;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {


      //  List<Player> playerList = new ArrayList<>();

        Player arts = new Player(1,"arts", 100);
        Player bacon = new Player(2,"bacon", 12);
        Player alan = new Player(3,"alan", 62);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(arts,playerLinkedList);
        playerLinkedList.addToFront(bacon,playerLinkedList);
        playerLinkedList.addToFront(alan,playerLinkedList);

        playerLinkedList.printList();

        playerLinkedList.deleteElement(playerLinkedList);

        playerLinkedList.printList();

        playerLinkedList.sizeVariable();
    }



}
