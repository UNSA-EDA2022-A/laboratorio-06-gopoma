package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestExercise3 {

  Exercise3 obj = new Exercise3();

  @Test
  public void case_1() {

    BST<Integer> tree1 = new BST<Integer>();

    Integer array [] = {1, 2, 3, 4, 5, 6};

    for(Integer value : array){
        tree1.insert(value);
    }

    boolean result = obj.bstEstrictamenteBinario(tree1);
    boolean expected = false;

    assertEquals(expected, result, "La salida esperada es: " + expected + " pero fue retornado: " + result);
  }

  @Test
  public void case_2() {

    BST<Integer> tree1 = new BST<Integer>();

    Integer array [] = {5, 1, 7, 0, 2};

    for(Integer value : array){
        tree1.insert(value);
    }

    boolean result = obj.bstEstrictamenteBinario(tree1);
    boolean expected = true;

    assertEquals(expected, result, "La salida esperada es: " + expected + " pero fue retornado: " + result);
  }

  @Test
  public void case_3() {

    BST<Integer> tree1 = new BST<Integer>();

    Integer array [] = {5, 2, 8, 1, 5, 7};

    for(Integer value : array){
        tree1.insert(value);
    }

    boolean result = obj.bstEstrictamenteBinario(tree1);
    boolean expected = false;

    assertEquals(expected, result, "La salida esperada es: " + expected + " pero fue retornado: " + result);
  }

  @Test
  public void case_4() {

    BST<Integer> tree1 = new BST<Integer>();

    Integer array [] = {1};

    for(Integer value : array){
        tree1.insert(value);
    }

    boolean result = obj.bstEstrictamenteBinario(tree1);
    boolean expected = true;

    assertEquals(expected, result, "La salida esperada es: " + expected + " pero fue retornado: " + result);
  }

  @Test
  public void case_5() {

    BST<Integer> tree1 = new BST<Integer>();

    Integer array [] = {1, 2};

    for(Integer value : array){
        tree1.insert(value);
    }

    boolean result = obj.bstEstrictamenteBinario(tree1);
    boolean expected = false;

    assertEquals(expected, result, "La salida esperada es: " + expected + " pero fue retornado: " + result);
  }

  @Test
  public void case_6() {

    BST<Integer> tree1 = new BST<Integer>();

    Integer array [] = {2, 1, 3};

    for(Integer value : array){
        tree1.insert(value);
    }

    boolean result = obj.bstEstrictamenteBinario(tree1);
    boolean expected = true;

    assertEquals(expected, result, "La salida esperada es: " + expected + " pero fue retornado: " + result);
  }
}
