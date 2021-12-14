package com.homework.daniel;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Integer> distinctArray(int[] arr1, int[] arr2) {
        boolean[] boolean1 = new boolean[10];
        boolean[] boolean2 = new boolean[10];
        for (int i = 0; i < arr1.length; i++) {
            boolean1[arr1[i]] = true;
        }
        for (int i = 0; i < arr2.length; i++) {
            boolean2[arr2[i]] = true;
        }
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (boolean1[i] ^ boolean2[i]){
                integerList.add(i);
            }
        }
        return integerList;
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{0,4,5,2,6,5,1};
        int[] array2 = new int[]{0,4,8,7,7,1,6};
        System.out.println(distinctArray(array1,array2));

    }

}
