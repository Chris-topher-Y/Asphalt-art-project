import org.code.neighborhood.*;

public class FrogPainter extends PainterPlus {

  public void paintFrog() {

    // Move to ROW 3, COLUMN 1
    turnRight();
    move();
    move();
    turnLeft();

    // ROW 3

    move();
    move();
    move();
    move();
    move();
    move();
    paint("#7ED957");

    move();
    move();
    move();
    paint("#7ED957");

    // Return to column 1
    turnAround();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    turnAround();
    moveDown();

    // ROW 4

    move();
    move();
    move();
    move();
    move();

    paint("#7ED957");
    move(); paint("#7ED957");
    move(); paint("#7ED957");
    move(); paint("#7ED957");
    move(); paint("#7ED957");
    move(); paint("#7ED957");

    turnAround();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    turnAround();
    moveDown();

    // ROW 5


    move();
    move();
    move();
    move();
    move();

    paint("#7ED957");
    move(); paint("black");
    move(); paint("#7ED957");
    move(); paint("#7ED957");
    move(); paint("black");
    move(); paint("#7ED957");

    turnAround();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    turnAround();
    moveDown();

    // ROW 6

    move();
    move();
    move();
    move();
    move();

    paint("#7ED957");
    move(); paint("#7ED957");
    move(); paint("#7ED957");
    move(); paint("#7ED957");
    move(); paint("#7ED957");
    move(); paint("#7ED957");

    turnAround();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    turnAround();
    moveDown();

    // ROW 7

    move();
    move();
    move();
    move();
    move();

    paint("#7ED957");
    move(); paint("#7ED957");
    move(); paint("black");
    move(); paint("black");
    move(); paint("#7ED957");
    move(); paint("#7ED957");

    turnAround();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    turnAround();
    moveDown();

    // ROW 8

    move();
    move();
    move();
    move();
    move();

    paint("#7ED957");
    move(); paint("#7ED957");
    move(); paint("#7ED957");
    move(); paint("#7ED957");
    move(); paint("#7ED957");
    move(); paint("#7ED957");

    turnAround();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    turnAround();
    moveDown();

    // ROW 9

    move();
    move();
    move();
    move();

    paint("#7ED957");
    move(); paint("#7ED957");
    move(); paint("#7ED957");
    move(); paint("white");
    move(); paint("white");
    move(); paint("#7ED957");
    move(); paint("#7ED957");
    move(); paint("#7ED957");

    turnAround();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    turnAround();
    moveDown();

    // ROW 10

    move();
    move();
    move();
    move();

    paint("#7ED957");
    move(); paint("#7ED957");
    move(); paint("#7ED957");
    move(); paint("white");
    move(); paint("white");
    move(); paint("#7ED957");
    move(); paint("#7ED957");
    move(); paint("#7ED957");

    turnAround();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    turnAround();
    moveDown();

    // ROW 11
    // G G W W G G

    move();
    move();
    move();
    move();
    move();

    paint("#7ED957");
    move(); paint("#7ED957");
    move(); paint("white");
    move(); paint("white");
    move(); paint("#7ED957");
    move(); paint("#7ED957");

    turnAround();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    turnAround();
    moveDown();

    // ROW 12

    move();
    move();
    move();
    move();
    move();

    paint("#7ED957");

    move();
    move();
    move();
    move();
    move();

    paint("#7ED957");
  }
}