package HomeWork_4.自定义接口;

import java.util.Arrays;

public class ArrayIntegerStack implements IntegerStack {
    private Integer arr[];
    private int top = 0;

    public ArrayIntegerStack(int n) {
        arr = new Integer[n];
        Arrays.fill(arr, null);
    }

    ArrayIntegerStack() {
    }

    @Override
    public Integer push(Integer item) {
        if (item == null || arr.length == top) return null;
        arr[top++] = item;
        return item;
    }

    @Override
    public Integer pop() {
        if (top == 0) return null;
        return arr[--top];
    }

    @Override
    public Integer peek() {
        if (top == 0) return null;
        else return arr[top - 1];
    }

    @Override
    public boolean empty() {
        return top == 0;
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}
