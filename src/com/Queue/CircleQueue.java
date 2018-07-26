package com.Queue;

import com.Stack.Array;




public class CircleQueue<E> implements QueueInterface<E> {
    Array<E> array;
    int front=0;
    int tail=0;
    int size=0;
    public CircleQueue() {
        this(10);
    }
    public CircleQueue(int capacity){
        array=new Array<>(capacity+1);
    }

    @Override
    public void inQueue(E e) {
        if ((tail+1)%(array.getCapacity())==front){
            resize((array.getCapacity()-1)*2+1);
        }
        array.addAtLast(e);
        size++;
        tail++;
    }

    private void resize(int newCapacity) {
        Array<E> newArray=new Array<>(newCapacity);
        for(int i=0;i<size;i++){
            newArray.setValue(i,array.findByIndex((front+i)%array.getCapacity()));
        }
        array=newArray;
        front=0;
        System.out.println("扩容后第一个元素"+array.findByIndex(front)+"大小为"+size+"长度为"+array.getCapacity());
        tail=size;
    }

    @Override
    public E DeQueue() {
        if(front==tail) throw new IllegalStateException("队列为空，无法出队。");
        front=(front+1)%array.getCapacity();
        size--;
        return  array.findByIndex(front);

    }

    @Override
    public E getFirst(E e) {
        return array.findByIndex(front);
    }

    @Override
    public boolean isEmpty() {
        return front==tail;
    }

    @Override
    public int getSize() {
        return size;
    }
    public void getIndex(){
        System.out.println("front  "+front+"    tail "+tail+"   队列大小为"+size+"    容量为"+(array.getCapacity()-1));
    }

//    @Override
//    public String toString() {
//       StringBuilder stringBuilder=new StringBuilder();
//       stringBuilder.append("队列容量为："+(array.getCapacity()-1) +"队列大小为："+size );
//       for (int i = front%array.getCapacity();(tail+1)%array.getCapacity()!=front;i++ ){
//           stringBuilder.append(array.findByIndex(front));
//           if ((tail+2)%array.getCapacity()==front)
//               stringBuilder.append(',');
//       }
//
//        return stringBuilder.toString();
//    }
}
