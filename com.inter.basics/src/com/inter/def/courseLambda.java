package com.inter.def;

public class courseLambda {
    public static void main(String[] args) {
        ICourse iCourse  = ()-> {
            String[] web= {"html","css","bootstrap"};

            return web;

        };

        ICourse iCourse1 = ()->{
            String[] cloud= {"azure","AWS","Devops","EC2"};
            return cloud;
        };
//        ICourse iCourse2 = ()-> {
//            String[]
//        };
        iCourse.showCourse();
        iCourse1.showCourse();
        //iCourse2.showCourse();
    };

}

