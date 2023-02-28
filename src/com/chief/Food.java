package com.chief;

public enum Food {


    Fish(90),
    Beef(55),
    Turkey(80),
    Mutton(46),
    Chips(19);

    final int nutrients;

    Food(int nutrients){
        this.nutrients=nutrients;

    }

}
