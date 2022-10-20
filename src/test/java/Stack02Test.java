import com.lionA.Stack02;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

public class Stack02Test {
    Stack02 st = new Stack02();

    @BeforeEach
    void setUp() {
        st.push(10);
        st.push(20);
        System.out.println("before each");
    }

    @Test
    void push() {
        st.push(10);
        st.push(20);
        Integer[] arr = st.getArr();
        assertEquals(20, arr[1]);
        assertEquals(10, arr[0]);
    }

    @Test
    void pop() {
        assertEquals(20, st.pop());
        assertEquals(10, st.pop());


        assertThrows(EmptyStackException.class,() -> {
            st.pop();
        });
    }

    @Test
    void peek() {
        assertEquals(20, st.peek());
    }

    @Test
    void isEmpty() {
        assertFalse(st.isEmpty());
        st.pop();
        st.pop();
        assertTrue(st.isEmpty());
    }

    @Test
    void realStack() {
        Stack<Integer> stack = new Stack<>();
        assertThrows(EmptyStackException.class, () -> {
            stack.pop();
        });//
    }
}
