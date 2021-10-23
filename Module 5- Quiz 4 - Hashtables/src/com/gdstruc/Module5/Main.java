package com.gdstruc.Module5;

public class Main {

    public static void main(String[] args) {

        Player milk = new Player(1,"milk", 100);
        Player bacon = new Player(2,"bacon", 12);
        Player coffee = new Player(3,"coffee", 62);
        Player bun = new Player(4,"bun", 68);
        Player tea = new Player(5,"tea", 100);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(milk.getUserName(), milk);
        hashtable.put(bacon.getUserName(), bacon);
        hashtable.put(coffee.getUserName(), coffee);
        hashtable.put(bun.getUserName(), bun);
        hashtable.put(tea.getUserName(), tea);

        System.out.println("Old hashtable: ");
        hashtable.printHashtable();
        hashtable.remove("bun");
        hashtable.remove("coffee");
        System.out.println("New hashtable: ");
        hashtable.printHashtable();
        System.out.println("Printed: ");
        System.out.println(hashtable.get("tea"));
    }
}
