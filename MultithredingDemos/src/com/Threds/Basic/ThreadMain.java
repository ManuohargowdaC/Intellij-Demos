package com.Threds.Basic;

public class ThreadMain {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread);
        thread.setName("poppy");
        thread.setPriority(Thread.MIN_PRIORITY+6);
        System.out.println(thread);
        thread.setName("sam");
        int[] nums= null;
        System.out.println(nums[0]);
    }
}
