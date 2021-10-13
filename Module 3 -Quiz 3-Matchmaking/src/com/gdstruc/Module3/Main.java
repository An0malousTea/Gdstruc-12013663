package com.gdstruc.Module3;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int gameCount = 0;
        Scanner scanner = new Scanner(System.in);

        ArrayQueue playerList = new ArrayQueue(10);
        ArrayQueue queue = new ArrayQueue(7);

        playerList.add(new Player(1,"milk", 100));
        playerList.add(new Player(2,"bacon", 12));
        playerList.add(new Player(3,"coffee", 62));
        playerList.add(new Player(4,"bun", 68));
        playerList.add(new Player(5,"tea", 100));
        playerList.add(new Player(6,"rice", 12));
        playerList.add(new Player(7,"chicken", 62));
        playerList.add(new Player(8,"steak", 68));
        playerList.add(new Player(9,"fries", 62));
        playerList.add(new Player(10,"stew", 68));


        Random rand = new Random();
        int ranValue = 8;

        System.out.println("Current Players: ");
        playerList.printQueue();

        while (gameCount < 10) {
            int randQueue = rand.nextInt(ranValue) + 1;


            for (int i = 0; i < randQueue; i++) { //Adds players to the queue
                queue.add(playerList.peek());
                playerList.remove();

                if (queue.size() >= 7) {
                    break;
                }
            }
            System.out.println("Game Count: " + gameCount);
            System.out.println("In Queue: ");
            queue.printQueue();
            scanner.nextLine();



            if (queue.size() >= 5) {
                for (int i = 0; i < 5; i++) { //Starts of the game and removes them from queue and back to the playerList
                    playerList.add(queue.peek());
                    queue.remove();
                }
                gameCount++;
                System.out.println("Game Starting... (Press Any key)");
                scanner.nextLine();
                System.out.println("Finishing Game... (Press Any key)");
                scanner.nextLine();
                System.out.println("Players will now be returned. (Press Any key)");
                scanner.nextLine();
            }


        }



    }

}
