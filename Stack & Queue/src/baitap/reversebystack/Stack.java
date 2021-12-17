package baitap.reversebystack;

public class Stack {
    int size;
    int top;
    char[] a;

    boolean isEmpty()
    {
        return (top < 0);
    }

    Stack(int n)
    {
        top = -1;
        size = n;
        a = new char[size];
    }

    void push(char x)
    {
        if (top >= size)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            a[++top] = x;
        }
    }

    char pop()
    {
        if (top < 0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            return a[top--];
        }
    }
}

