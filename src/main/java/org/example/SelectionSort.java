package org.example;

import java.util.ArrayList;

public class SelectionSort implements SortServiceLib {

    private int changeCnt = 0;
    private final SortType sortType = SortType.SELECTION;

    @Override
    public void sort(ArrayList<Integer> arr) {
        changeCnt = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    changeCnt++;
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
    }

    @Override
    public int getChangeCnt() {
        return changeCnt;
    }

    @Override
    public SortType getSortType() {
        return sortType;
    }

    /**
     * public static void main(String[] args) {
     *         SelectionSort sort = new SelectionSort();
     *         ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5,2,1,3,1,2,6,9));
     *         sort.sort(arr);
     *         System.out.println(arr);
     *     }
     */
}