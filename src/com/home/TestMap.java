package com.home;

import javax.crypto.interfaces.PBEKey;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Tao
 * @date 2020/5/30 - 9:33
 */
public class TestMap<K,V> {
    Node[] table;
    int size;

    public TestMap() {
        table = new Node[16];

    }


    public void put(K key, V value) {
        Node node = new Node();
        node.hash = myHash(key.hashCode(), table.length);
        node.key = key;
        node.value = value;
        node.next = null;

        Node temp = table[node.hash];

        Node iterLast = null;
        boolean keyRepeat = false;
        if (temp == null) {
            table[node.hash] = node;
            size++;

        } else {
            while (temp != null) {
                if (temp.key.equals(key)) {
                    temp.value = value;
                    return;
                } else {
                    iterLast = temp;
                    temp = temp.next;
                }
            }
            if (!keyRepeat) {
                iterLast.next = node;
                size++;
            }
        }
    }

    public int myHash(int v, int length) {
        return v & (length - 1);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < table.length; i++) {
            Node temp = table[i];
            while (temp != null) {

                sb.append(temp.key + ":" + temp.value + ",");
                temp = temp.next;
            }


        }
        sb.setCharAt(sb.length() - 1, '}');
        return sb.toString();


    }

    public V get(K key) {
        int hash = myHash(key.hashCode(), table.length );
        V value = null;
        if (table[hash] != null) {
            Node temp = table[hash];
            while (temp != null) {
                if (temp.key.equals(key)) {
                    value = (V)temp.value;
                    break;

                } else {
                    temp = temp.next;
                }
            }
        }
        return value;
    }

    public static void main(String[] args) {
        TestMap<Integer,String> testMap = new TestMap<>();
        testMap.put(10, "cat");
        testMap.put(20, "dog");
        testMap.put(30, "parrot");
        testMap.put(20, "panda");
        testMap.put(36, "kitten");
        System.out.println(testMap.get(36));

        System.out.println(testMap.toString());
    }
}
