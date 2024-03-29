package com.inter.extend;

public interface ICalculater {
    void add(int x,int y);
    void multiply(int x,int y);
    default void sub(int x, int y){
        System.out.println((x-y));
    }

    void  product(int x,int y);

}
