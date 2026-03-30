package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Profiler {

    private SortServiceLib sortServiceLib;
    private SortType sortType;

    private ArrayList<Integer> input;

    private int changeCnt;

    public void setData(ArrayList<Integer> input) {
        this.input = input;
    }

    public void setLib(SortServiceLib sortServiceLib) {
        this.sortServiceLib = sortServiceLib;
    }

    public void runLib() {

        if (sortServiceLib == null) {
            throw new NullPointerException("SortServiceLib is null");
        }

        sortServiceLib.sort(input);
        changeCnt = sortServiceLib.getChangeCnt();
        sortType = sortServiceLib.getSortType();
    }

    public void showResult() {
        System.out.println(sortType + " 테스트");
        System.out.println(Arrays.toString(input.toArray()));
        System.out.println("swap횟수: " + changeCnt);
    }
}
