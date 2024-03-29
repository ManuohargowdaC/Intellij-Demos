package com.inter.def;


public class ShapeMain {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();


        IShape shape = new Rectangle();
        factory.printArea(shape,10,20);


 //       factory.printArea(new IShape(),10,40);


//       factory.printArea(new IShape()){
    //        void area(int x, int y){
                System.out.println("Calculating Tri Area");
     //           System.out.println("Tri "+(x*y*0.5));
            }
        }
   // }
//}
