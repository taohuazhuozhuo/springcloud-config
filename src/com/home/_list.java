package com.home;

import javafx.geometry.VPos;

import javax.sound.midi.Soundbank;

/**
 * @author Tao
 * @date 2020/5/30 - 7:29
 */
public class _list<E> {

    public static void main(String[] args) {
        _list<Integer> blist = new _list<>(5);
        for (int i = 0; i < 30; i++) {
            blist.add(0 + i);

        }


        blist.set(0, 100);
        System.out.println(blist.size);
        blist.remove(1);
        System.out.println(blist.size);


        System.out.println(blist);
        System.out.println(blist.getValueByIndex(0));

    }


    private Object[] elementData;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public _list() {
        elementData = new Object[DEFAULT_CAPACITY];

    }

    public _list(int capacity) {
        elementData = new Object[capacity];


    }

    public E getValueByIndex(int index) {
        CheckRange(index);

        return (E) elementData[index];

    }

    public void set(int index, E element) {
        CheckRange(index);
        elementData[index] = element;
    }

    public void CheckRange(int index) {
        if (index < 0 || index > elementData.length - 1) {
            System.out.println("数组越界");
        }

    }

    public void add(E element) {
        if (size == elementData.length - 1) {
            Object[] newArray = new Object[elementData.length + (elementData.length >> 1)];
            System.arraycopy(elementData, 0, newArray, 0, elementData.length);
            elementData = newArray;


        }
        elementData[size++] = element;


    }

    public void remove(int index) {
        if (elementData.length - index > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, elementData.length - index - 1);
        }
        elementData[--size] = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(elementData[i] + ",");


        }
        sb.setCharAt(sb.length() - 1, ']');


        return sb.toString();


    }
}