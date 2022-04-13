package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();
      nakresliDomecek(zofka);
      //zacatek kresleni prasatka
//zofka.setLocation(300,300);
//zofka.move (50);
//zofka.turnLeft(90);
//zofka.move(100);
//zofka.turnLeft(90);
//zofka.move(50);



    }
private void nakresliDomecek(Turtle zofka){
    for (int j = 0; j < 2; j++) {

        for (int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnRight(90);
        }
        zofka.penUp();
        zofka.move(100);
        zofka.penDown();
        zofka.turnRight(45);
        zofka.move(75);
        zofka.turnRight(90);
        zofka.move(75);
        zofka.penUp();
        zofka.turnLeft(-45);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.penDown();
    }
}
}
