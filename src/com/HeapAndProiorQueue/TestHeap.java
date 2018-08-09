package com.HeapAndProiorQueue;

import java.util.IntSummaryStatistics;
import java.util.concurrent.ForkJoinPool;

public class TestHeap {


    public static void main(String[] args) {
        Integer[] ints=new Integer[]{4,3,2,41,6,8,22,66,32};
        MaxHeap<Integer> maxHeap=new MaxHeap<>(ints);
        for (int i=0;i<ints.length;i++){
            System.out.println(maxHeap.remove());
        }
    }

}
