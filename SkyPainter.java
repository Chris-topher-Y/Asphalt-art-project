import org.code.neighborhood.*;

public class SkyPainter extends PainterPlus {

  // Paint exactly 16 spaces
  public void paintRow() {
    paint("black");
    move();
    paint("black");
    move();
    paint("black");
    move();
    paint("black");
    move();
    paint("black");
    move();
    paint("black");
    move();
    paint("black");
    move();
    paint("black");
    move();
    paint("black");
    move();
    paint("black");
    move();
    paint("black");
    move();
    paint("black");
    move();
    paint("black");
    move();
    paint("black");
    move();
    paint("black");
    move();
    paint("black");
  }

  public void paintSky() {

    // ROW 1
    paintRow();

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
    move();
    move();
    move();
    move();
    move();
    move();
    turnAround();

    // ROW 2
    moveDown();
    paintRow();

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
    move();
    move();
    move();
    move();
    turnAround();

    // ROW 3
    moveDown();
    paintRow();

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
    move();
    move();
    move();
    move();
    turnAround();

    // ROW 4
    moveDown();
    paintRow();

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
    move();
    move();
    move();
    move();
    turnAround();

    // ROW 5
    moveDown();
    paintRow();

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
    move();
    move();
    move();
    move();
    turnAround();

    // ROW 6
    moveDown();
    paintRow();

    // Go from Row 6, Column 16
    // back to Row 1, Column 1
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
    move();
    move();
    move();
    move();

    turnAround();

    turnLeft();
    move();
    move();
    move();
    move();
    move();
    turnRight();

    // ROW 1, COLUMN 3
    move();
    move();
    paint("yellow");

    // ROW 1, COLUMN 11
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    paint("yellow");

    // ROW 4, COLUMN 14
    moveDown();
    moveDown();
    moveDown();
    move();
    move();
    move();
    move();
    paint("yellow");

    // ROW 5, COLUMN 4
    moveDown();
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
    paint("yellow");
  }
}