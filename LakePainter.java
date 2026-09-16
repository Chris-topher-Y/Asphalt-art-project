import org.code.neighborhood.*;

public class LakePainter extends PainterPlus {

  // Paint exactly one row of 16 water squares
  public void paintWaterRow() {
    paint("#87CEEB");

    move();
    paint("#87CEEB");
    move();
    paint("#87CEEB");
    move();
    paint("#87CEEB");
    move();
    paint("#87CEEB");
    move();
    paint("#87CEEB");
    move();
    paint("#87CEEB");
    move();
    paint("#87CEEB");
    move();
    paint("#87CEEB");
    move();
    paint("#87CEEB");
    move();
    paint("#87CEEB");
    move();
    paint("#87CEEB");
    move();
    paint("#87CEEB");
    move();
    paint("#87CEEB");
    move();
    paint("#87CEEB");
    move();
    paint("#87CEEB");
  }

  public void paintLake() {

    // Move from Row 1 to Row 7
    moveDown();
    moveDown();
    moveDown();
    moveDown();
    moveDown();
    moveDown();

    // ROW 7
    paintWaterRow();

    // Return to Column 1
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

    // ROW 8
    moveDown();
    paintWaterRow();

    // Return to Column 1
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

    // ROW 9
    moveDown();
    paintWaterRow();

    // Return to Column 1
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

    // ROW 10
    moveDown();
    paintWaterRow();

    // Return to Column 1
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

    // ROW 11
    moveDown();
    paintWaterRow();

    // Return to Column 1
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

    // ROW 12
    moveDown();
    paintWaterRow();

    // Return to Column 1
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

    // ROW 13
    moveDown();
    paintWaterRow();

    // Return to Column 1
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

    // ROW 14
    moveDown();
    paintWaterRow();

    // Return to Column 1
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

    // ROW 15
    moveDown();
    paintWaterRow();

    // Return to Column 1
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

    // ROW 16
    moveDown();
    paintWaterRow();
  }
}