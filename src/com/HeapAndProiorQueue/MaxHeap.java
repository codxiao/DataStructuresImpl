package com.HeapAndProiorQueue;


import java.lang.annotation.Repeatable;

public class MaxHeap<E extends Comparable<E>> {
   Array<E> array;
    int size;
    /*
    默认构造函数
     */
    public MaxHeap() {
     array=new Array<>();
        size=0;
    }
    /*
    传入数组，heapify成堆。时间的复杂符是logn
     */
    public MaxHeap(E[] arr) {
        array=new Array<>(arr);
        for (int i=getParent(arr.length-1);i>=0;i--){
            shiftdown(i);
        }

    }

    public boolean isEmpty(){
        return size==0;
    }
    public int getSize(){
        return size;
    }

    /**
     * 给定索引得到该索引对应的父亲节点
     * @param index
     * @return
     */
    public int getParent(int index){
        if (index==0){
            throw new IllegalArgumentException("根节点没有父亲");
        }
        return (index-1)/2;
    }

    /**
     * 给定索引得到该索引的左孩子节点
     * @param index
     * @return
     */
    public int getLeftChild(int index){
        return index*2+1;
    }
    /**
     * 给定索引得到索引的右孩子节点

     */
    public int getRightChild(int index){
        return index*2+2;
    }
    private void swap(int parent,int son){
        E temp =array.get(parent);
        array.set(parent,array.get(son));
        array.set(son,temp);
    }

    /**
     * 给堆添加元素
     * @param e
     */
    public void add(E e){

        array.addLast(e);
        siftup(getSize()-1);
        }


    /**
     * 上浮操作
     * @param i
     */
    private void siftup(int i) {
        while(i>0&&array.get(getParent(i)).compareTo(array.get(i))<0){
            swap(getParent(i),i);
            i=getParent(i);
        }

    }

    /**
     * 从堆中删除最大的元素，并返回
     * @return
     */
    public E remove(){
        E temp=array.get(0);
        swap(0,array.getSize()-1);
        array.remove(array.getSize()-1);
        shiftdown(0);
        return temp;
    }

    /**
     * 下潜操作
     * @param k
     */
    private void shiftdown(int k){

        while(getLeftChild(k) < array.getSize()){
            int j = getLeftChild(k); // 在此轮循环中,data[k]和data[j]交换位置
            if( j + 1 < array.getSize() &&
                    array.get(j + 1).compareTo(array.get(j)) > 0 )
                j ++;
            // data[j] 是 leftChild 和 rightChild 中的最大值

            if(array.get(k).compareTo(array.get(j)) >= 0 )
                break;

            array.swap(k, j);
            k = j;
        }
    }

    /**
     * 删除堆中最大的元素并返回，同时往堆添加一个元素
     * @return e
     */
    public E replace(E e){
       E temp= remove();
       array.set(0,e);
       shiftdown(0);
       return  e;
    }

}



