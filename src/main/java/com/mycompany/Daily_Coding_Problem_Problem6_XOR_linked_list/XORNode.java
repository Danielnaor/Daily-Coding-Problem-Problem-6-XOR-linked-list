/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Daily_Coding_Problem_Problem6_XOR_linked_list;

/**
 *
 * @author carmitnaor
 */
public class XORNode {
  private int value;
  private XORNode next;
  private XORNode Previous;

  // Constructors
  
  
  public XORNode(int value){
    this.value = value;
    this.Previous = null;
    this.next = null;
  }
          
  public XORNode(int value, XORNode Previous, XORNode next) {
    this.value = value;
    this.Previous = Previous;
    this.next = next;
  }

  // Getters and setters
  public int getValue() {
    return this.value;
  }

  public XORNode getNext() {
    return this.next;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public void setNext(XORNode next) {
    this.next = next;
  }
  public XORNode getPrevious(){
      return this.Previous;
  }
  public void setPrevious(XORNode previous){
      this.Previous = previous;
  }
}