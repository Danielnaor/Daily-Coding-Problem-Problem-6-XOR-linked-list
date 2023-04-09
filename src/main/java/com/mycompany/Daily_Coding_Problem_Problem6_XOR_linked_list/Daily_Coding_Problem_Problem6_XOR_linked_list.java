/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.Daily_Coding_Problem_Problem6_XOR_linked_list;

/**
 *
 * @author carmitnaor
 */
public class Daily_Coding_Problem_Problem6_XOR_linked_list {

    public static void main(String[] args) {
        XORLinkedList list = new XORLinkedList();

        // Add elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // Get elements from the list
        System.out.println(list.get(0).getValue()); // Output: 1
        System.out.println(list.get(1).getValue()); // Output: 2
        System.out.println(list.get(2).getValue()); // Output: 3
        System.out.println(list.get(3).getValue()); // Output: 4

        // Test exception handling
        try {
            list.get(4);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds"); // Output: Index out of bounds
        }
    }
}