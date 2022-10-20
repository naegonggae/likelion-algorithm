package com.lionA;

import com.lionA.Stack02;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

public class Stack02Test {

    @BeforeEach
    void setUp() {

        System.out.println("before each");
    }

    @Test
    @DisplayName("push가 잘 되는지")
    void push() {
        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);
        Integer[] arr = st.getArr();
        assertEquals(20, arr[1]);
        assertEquals(10, arr[0]);
    }

    @Test
    void pop() {
        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);
        assertEquals(20, st.pop());
        assertEquals(10, st.pop());

        //st.pop() 비어 있을때는? 예외 검증
        //람다식...
        assertThrows(EmptyStackException.class,() -> {
            st.pop();
        });
        //익명 클래스 = 인터페이스 구현체 = 람다랑 비슷함
        new Interface01() {
            @Override
            public void runSth() {
            }
        };
    }

    @Test
    void peek() {
        Stack02 st = new Stack02();
        //stack이 비었는데 peek하면?
        assertThrows(EmptyStackException.class,()->{
            st.peek();
        });
        st.push(10);
        st.push(20);
        int peeked = st.peek();
        assertEquals(20, peeked);
    }

    @Test
    void isEmpty() {
        Stack02 st = new Stack02();
        assertTrue(st.isEmpty());
        st.push(10);
        assertFalse(st.isEmpty());
        st.pop();
        assertTrue(st.isEmpty());
    }

    @Test
    void realStack() {
        Stack<Integer> st = new Stack<>();
        assertThrows(EmptyStackException.class, () -> {
            st.peek();
        });
        assertThrows(EmptyStackException.class, () -> {
            st.pop();
        });
    }
}
