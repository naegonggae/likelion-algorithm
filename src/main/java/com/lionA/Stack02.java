package com.lionA;

import java.util.EmptyStackException;

public class Stack02 {
    //다형성 활용할거라 int 대신 Integer 로 적음
    private Integer[] arr;
    private int top = 0;

    //스택 초기화
    public Stack02() {
        this.arr = new Integer[10000];
    }

    public Stack02(int size) {
        this.arr = new Integer[size];
    }

    public Integer[] getArr() {
        return arr;
    }

    public void push(int value) {
        // 10을 넣으면 arr[0] = 10
        this.arr[this.top++] = value; //증감연산자 활용
    }
    public int pop() {
        //비었는데 pop 하는 경우
        if(this.isEmpty()) {
            throw new EmptyStackException();
        }
        return this.arr[--this.top]; //this.top = 2, 증감연산자 활용
    }

    public int peek() {
        if(this.isEmpty()) {
            throw new EmptyStackException();
        }
        return this.arr[this.top-1];
    }

    public boolean isEmpty() {

        return this.top == 0 ? true : false;
    }


}
