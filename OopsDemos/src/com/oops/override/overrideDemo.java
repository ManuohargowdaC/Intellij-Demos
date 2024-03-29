package com.oops.override;

public class overrideDemo {
    public static void main(String[] args) {
        String choice= "indore";
        Sports sports=null;
        if (choice.equals("indore")){
            sports = new Indore();

        } else if (choice.equals("Outdor")) {
            sports = new Outdor();

        }else
            sports = new Sports();
        String[] games=sports.showTypes();
        if (games!=null)
            for (String game : games)
                System.out.println(game);
    }
}
