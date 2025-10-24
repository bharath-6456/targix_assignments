
package com.example;

public class Main {
    public static void main(String[] args) {
        CollectionDemo demo = new CollectionDemo();

        System.out.println("=== List Example ===");
        demo.addToList("Alice");
        demo.addToList("Bob");
        demo.addToList("Alice");
        System.out.println("List: " + demo.getStudentList());
        System.out.println("Search Bob: " + demo.searchInList("Bob"));
        demo.removeFromList("Alice");
        System.out.println("List after removal: " + demo.getStudentList());

        System.out.println("\n=== Set Example ===");
        demo.addToSet("Alice");
        demo.addToSet("Bob");
        demo.addToSet("Alice");
        System.out.println("Set: " + demo.getStudentSet());
        System.out.println("Search Bob: " + demo.searchInSet("Bob"));
        demo.removeFromSet("Alice");
        System.out.println("Set after removal: " + demo.getStudentSet());

        System.out.println("\n=== Map Example ===");
        demo.addToMap(101, "Alice");
        demo.addToMap(102, "Bob");
        demo.addToMap(103, "Charlie");
        System.out.println("Map: " + demo.getStudentMap());
        System.out.println("Search ID 102: " + demo.searchInMap(102));
        demo.removeFromMap(101);
        System.out.println("Map after removal: " + demo.getStudentMap());
    }
}
