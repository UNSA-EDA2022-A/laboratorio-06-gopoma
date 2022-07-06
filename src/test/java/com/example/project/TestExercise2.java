package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestExercise2 {

  Exercise2 obj = new Exercise2();

  @Test
  public void case_1() {

    BST<Integer> tree1 = new BST<Integer>();
    BST<Integer> tree2 = new BST<Integer>();

    Integer array [] = {1, 2,3, 4, 5, 6};

    for(Integer value : array){
        tree1.insert(value);
        tree2.insert(value);
    }

    boolean result = obj.bstIguales(tree1, tree2);
    boolean expected = true;

    assertEquals(expected, result, "La salida esperada es: " + expected + " pero fue retornado: " + result);
  }

  @Test
  public void case_2() {

    BST<Integer> tree1 = new BST<Integer>();
    BST<Integer> tree2 = new BST<Integer>();

    Integer array [] = {1, 2, 3, 4, 5, 6};

    for(Integer value : array){
        tree1.insert(value);
        tree2.insert(value * 10);
    }

    boolean result = obj.bstIguales(tree1, tree2);
    boolean expected = false;

    assertEquals(expected, result, "La salida esperada es: " + expected + " pero fue retornado: " + result);
  }

  @Test
  public void case_3() {

    BST<Integer> tree1 = new BST<Integer>();
    BST<Integer> tree2 = new BST<Integer>();

    Integer array [] = {};

    for(Integer value : array){
        tree1.insert(value);
        tree2.insert(value);
    }

    boolean result = obj.bstIguales(tree1, tree2);
    boolean expected = true;

    assertEquals(expected, result, "La salida esperada es: " + expected + " pero fue retornado: " + result);
  }

  @Test
  public void case_4() {

    BST<Integer> tree1 = new BST<Integer>();
    BST<Integer> tree2 = new BST<Integer>();

    Integer array [] = {1, 2, 3, 4, 5, 6, 7, 8};

    for(Integer value : array){
        tree1.insert(value);
        if(value < 7){
          tree2.insert(value);
        }          
    }

    boolean result = obj.bstIguales(tree1, tree2);
    boolean expected = false;

    assertEquals(expected, result, "La salida esperada es: " + expected + " pero fue retornado: " + result);
  }

  @Test
  public void case_5() {

    BST<Integer> tree1 = new BST<Integer>();
    BST<Integer> tree2 = new BST<Integer>();

    Integer array [] = {10, 12, 3, 6, 15, 14, 9, 1};

    for(Integer value : array){
        tree1.insert(value);
        tree2.insert(value);
    }

    boolean result = obj.bstIguales(tree1, tree2);
    boolean expected = true;

    assertEquals(expected, result, "La salida esperada es: " + expected + " pero fue retornado: " + result);
  }

  @Test
  public void case_6() {

    BST<Integer> tree1 = new BST<Integer>();
    BST<Integer> tree2 = new BST<Integer>();

    Integer array [] = {10, 12, 3, 6, 15, 14, 9, 1};

    for(Integer value : array){
        tree1.insert(value);
        if(value < 12){
          tree2.insert(value);
        }          
    }

    boolean result = obj.bstIguales(tree1, tree2);
    boolean expected = false;

    assertEquals(expected, result, "La salida esperada es: " + expected + " pero fue retornado: " + result);
  }
}