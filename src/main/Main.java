package main;

import collections.*;
import collections.ArrayAndArrayList;
import collections.HashMapMethodsDemo;
import collections.HashSetBulkOperations;
import collections.HashSetMethods;
import collections.ListMethods;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        ArrayAndArrayList.arrayDemo();
        ArrayAndArrayList.arrayListDemo();
        ListMethods.runListMethodsDemo();
        CopyOnWriteArrayListDemo.runCopyOnWriteArrayListDemo();
        LinkedListMethods.runLinkedListMethodsDemo();
        HashMapMethodsDemo.runHashMapDemo();
        HashSetMethods.runHashSetMethodsDemo();
        HashSetBulkOperations.runBulkOperationsDemo();


    }
}